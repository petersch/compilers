package compiler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.stringtemplate.v4.*;
import parser.jazzikBaseVisitor;
import parser.jazzikParser;

public class CompilerVisitor extends jazzikBaseVisitor<CodeFragment> {
    //private Map<String, String> vars = new HashMap<String, String>();
    private Map<String, VarEntry> variables = new HashMap<String, VarEntry>();
    private Map<String, FuncEntry> functions = new HashMap<String, FuncEntry>();
    private int labelIndex = 0;
    private int registerIndex = 0;
    private int stringIndex = 0;
    CommonTokenStream tokens;
    
    public CompilerVisitor(CommonTokenStream tokens) {
        this.tokens = tokens;
    }
    
    private int getLine(ParserRuleContext ctx) {
        //return tokens.get(ctx.getSourceInterval().a).getLine;
        return ctx.getStart().getLine();
    }
    
    private Stack<Map<String, VarEntry>> vars = new Stack<Map<String, VarEntry>>();

    private String generateNewLabel() {
        return String.format("L%d", this.labelIndex++);
    }

    private String generateNewRegister() {
        return String.format("%%R%d", this.registerIndex++);
    }

    private String generateNewString() {
        return String.format("@.S%d", this.stringIndex++);
    }
    
    private void clearScope() {
        vars.clear();
    }
    
    private void startScope() {
        vars.push(new HashMap<String, VarEntry>());
    }
    
    private void endScope() {
        vars.pop();
    }
    
    private String registerVariable(int type, String name) {
        String register = generateNewRegister();
        //variables.put(name, new VarEntry(type, name, register));
        vars.peek().put(name, new VarEntry(type, name, register));
        return register;
    }
    
    private VarEntry getVariable(String name) {
        //return variables.get(name);
        for (int i = vars.size() - 1; i >= 0; --i) {
            if (vars.get(i).containsKey(name)) {
                return vars.get(i).get(name);
            }
        };
        throw new RuntimeException("Undeclared variable: " + name);
    }
    
    private void registerFunction(int type, String name) {
        functions.put(name, new FuncEntry(type, name));
    }
    
    @Override
    protected CodeFragment aggregateResult(CodeFragment aggregate, CodeFragment nextResult) {
        if (aggregate == null) return nextResult;
        if (nextResult == null) return aggregate;
        aggregate.addFragment(nextResult);
        aggregate.setRegister(nextResult.getRegister());
        //System.out.println("AGGREGATING " + aggregate + " + " + nextResult);
        return aggregate;
    }
    
    @Override
    public CodeFragment visitInit(jazzikParser.InitContext ctx) {
        CodeFragment decls = visit(ctx.funcdecls());

        ST template = new ST(
            "<global>" +
            "\n" +
            "declare void @write_int(i32)\n" +
            "declare void @write_cond(i32)\n" +
            "declare void @write_str(i8*)\n" +
            "declare void @write_nl()\n" +
            "declare void @read_int(i32*)\n" +
            "\n" +
            "<decls>"
        );
        template.add("decls", decls.getCode());
        template.add("global", decls.getGlobal());

        CodeFragment code = new CodeFragment();
        code.addCode(template.render());
        return code;
    }
    
    @Override
    public CodeFragment visitFuncdecls(jazzikParser.FuncdeclsContext ctx) {
        /*CodeFragment code = new CodeFragment();
        for(jazzikParser.FuncdeclContext decl: ctx.funcdecl()) {
            CodeFragment declcode = visit(decl);
            code.addCode(declcode);
        }
        return code;*/
        return visitChildren(ctx);
    }
    
    @Override
    public CodeFragment visitFuncExtern(jazzikParser.FuncExternContext ctx) {
        startScope();
        registerFunction(ctx.type.getType(), ctx.name.getText());
        
        String name = ctx.name.getText();
        String type = "TYPE";
        switch (ctx.type.getType()) {
            case jazzikParser.INT_TYPE: type = "i32"; break;
            case jazzikParser.BOOL_TYPE: type = "i32"; break;
            case jazzikParser.VOID_TYPE: type = "void"; break;
        }
        
        ST template = new ST(
            "declare <type> @<name>(<args>)\n\n"
        );
        
        template.add("type", type);
        template.add("name", name);
        if (ctx.args != null)
            template.add("args", visit(ctx.args).getFuncArgs());
        else
            template.add("args", "");
        
        CodeFragment code = new CodeFragment();
        code.addCode(template.render());
        endScope();
        return code;
    }
    
    @Override
    public CodeFragment visitFuncDef(jazzikParser.FuncDefContext ctx) {
        startScope();
        registerFunction(jazzikParser.INT_TYPE, ctx.name.getText());
        
        String name = ctx.name.getText();
        String type = "TYPE";
        switch (ctx.type.getType()) {
            case jazzikParser.INT_TYPE: type = "i32"; break;
            case jazzikParser.BOOL_TYPE: type = "i32"; break;
            case jazzikParser.VOID_TYPE: type = "i32"; break;
        }
        
        ST template = new ST(
            "define <type> @<name>(<args>) {\n" + 
            "<arg_vars>" +
            "<body_code>" + 
            "  ret i32 0\n" +
            "}\n" +
            "\n"
        );
        
        template.add("type", type);
        template.add("name", name);
        if (ctx.args != null) {
            CodeFragment args = visit(ctx.args);
            template.add("args", args.getFuncArgs());
            template.add("arg_vars", args.getCode());
        }
        else {
            template.add("args", "");
            template.add("arg_vars", "");
        }
        
        CodeFragment body = visit(ctx.block());
        template.add("body_code", body.getCode());

        CodeFragment code = new CodeFragment();
        code.addCode(template.render());
        code.addGlobal(body.getGlobal());
        endScope();
        return code;
    }
    
    @Override
    public CodeFragment visitFuncArgDecl(jazzikParser.FuncArgDeclContext ctx) {
        CodeFragment code = new CodeFragment();
        String name = ctx.name.getText();
        if (ctx.type.getType() == jazzikParser.INT_TYPE) {
            String register = registerVariable(ctx.type.getType(), ctx.name.getText());
            code.addFuncArg("i32 %" + name);
            code.addCode(String.format("  %s = alloca i32\n", register));
            code.addCode(String.format("  store i32 %%%s, i32* %s\n", name, register));
        }
        if (ctx.type.getType() == jazzikParser.ARRAY_TYPE) {
            String register = registerVariable(ctx.type.getType(), ctx.name.getText());
            code.addFuncArg("i32* " + register);
        }
        return code;
    }
    
    @Override
    public CodeFragment visitFuncCall(jazzikParser.FuncCallContext ctx) {
        String name = ctx.ID().getText();
        String type = "TYPE";
        String register = generateNewRegister();
        switch (functions.get(name).type) {
            case jazzikParser.INT_TYPE: type = "i32"; break;
            case jazzikParser.BOOL_TYPE: type = "i32"; break;
            case jazzikParser.VOID_TYPE: type = "void"; break;
        }
        
        CodeFragment code = new CodeFragment();
        CodeFragment args = new CodeFragment();
        if (ctx.funcargs() != null)  args = visit(ctx.funcargs());
        code.addCode(args);
            
        ST template = new ST(
            "  <register>call <type> @<name>(<args>)\n"
        );
        if (functions.get(name).type == jazzikParser.VOID_TYPE)
            template.add("register", "");
        else
            template.add("register", register + " = ");
        template.add("type", type);
        template.add("name", name);
        template.add("args", args.getFuncArgs());
        code.addCode(template.render());
        code.setRegister(register);
        return code;
    }
    
    @Override
    public CodeFragment visitFuncArgID(jazzikParser.FuncArgIDContext ctx) {
        CodeFragment code = new CodeFragment();
        String name = ctx.ID().getText();
        if (getVariable(name).type == jazzikParser.INT_TYPE) {
            String register = generateNewRegister();
            code.addCode(String.format("  %s = load i32* %s\n", register, getVariable(name).register));
            code.addFuncArg("i32 " + register);
        }
        if (getVariable(name).type == jazzikParser.ARRAY_TYPE) {
            String register = getVariable(ctx.ID().getText()).register;
            code.addFuncArg("i32* " + register);
        }
        return code;
    }
    
    @Override
    public CodeFragment visitFuncArgExpr(jazzikParser.FuncArgExprContext ctx) {
        CodeFragment expr = visit(ctx.expression());
        CodeFragment code = new CodeFragment();
        code.addCode(expr);
        code.addFuncArg("i32 " + expr.getRegister());
        return code;
    }
    
	@Override
    public CodeFragment visitReturnInt(jazzikParser.ReturnIntContext ctx) {
        CodeFragment code = new CodeFragment();
        
        if (ctx.expression() != null) {
            CodeFragment expr = visit(ctx.expression());
            code.addCode(expr);
            code.addCode(String.format("  ret i32 %s\n", expr.getRegister()));
        }
        else {
            code.addCode("  ret i32 0\n");
        }
        return code;
    }
    
    
    @Override
    public CodeFragment visitBlock(jazzikParser.BlockContext ctx) {
        startScope();
        if (ctx.statement().isEmpty()) return new CodeFragment();
        CodeFragment code = visitChildren(ctx);
        endScope();
        return code;
    }
    
    @Override
    public CodeFragment visitIntDecl(jazzikParser.IntDeclContext ctx) {
        CodeFragment code = new CodeFragment();
        if (null == ctx.expression()) {
            ST template = new ST(
                "  <register> = alloca i32\n" +
                "  store i32 0, i32* <register>\n"
            );
            String register = registerVariable(jazzikParser.INT_TYPE, ctx.name.getText());
            template.add("register", register);
            code.addCode(template.render());
        }
        else {
            CodeFragment expr = visit(ctx.expression());
            ST template = new ST(
                "  <register> = alloca i32\n" +
                "  store i32 <expr_register>, i32* <register>\n"
            );
            String register = registerVariable(jazzikParser.INT_TYPE, ctx.name.getText());
            template.add("register", register);
            template.add("expr_register", expr.getRegister());
            code.addCode(expr);
            code.addCode(template.render());
        }
        return code;
    }
    
    @Override
    public CodeFragment visitArrayDecl(jazzikParser.ArrayDeclContext ctx) {
        CodeFragment code = new CodeFragment();
        CodeFragment expr = visit(ctx.expression());
        
        ST template = new ST(
            "  <shifted> = add i32 <length>, 1\n" +
            "  <register> = alloca i32, i32 <shifted>\n" +
            "  store i32 <length>, i32* <register>\n"
        );
        
        template.add("shifted", generateNewRegister());
        String register = registerVariable(jazzikParser.ARRAY_TYPE, ctx.name.getText());
        template.add("register", register);
        template.add("length", expr.getRegister());
        code.addCode(expr);
        code.addCode(template.render());
        return code;
    }
    
    @Override
    public CodeFragment visitIntConstant(jazzikParser.IntConstantContext ctx) {
        CodeFragment code = new CodeFragment();
        String register = generateNewRegister();
        ST template = new ST(
            "  <register> = add i32 <value>, 0\n"
        );
        template.add("register", register);
        template.add("value", ctx.INT().getText());
        code.setRegister(register);
        code.addCode(template.render());
        return code;
    }
    
    @Override
    public CodeFragment visitAssignInt(jazzikParser.AssignIntContext ctx) {
        CodeFragment value = visit(ctx.expression());
        CodeFragment code = new CodeFragment();
        
        String register = getVariable(ctx.name.getText()).register;
        ST template = new ST(
            "  store i32 <expr_register>, i32* <register>\n"
        );
        template.add("register", register);
        template.add("expr_register", value.getRegister());
        code.addCode(value);
        code.addCode(template.render());
        return code;
    }
    
    @Override
    public CodeFragment visitAssignArray(jazzikParser.AssignArrayContext ctx) {
        CodeFragment value = visit(ctx.value);
        CodeFragment index = visit(ctx.index);
        CodeFragment code = new CodeFragment();
        
        String register = getVariable(ctx.name.getText()).register;
        ST template = new ST(
            "  <shifted> = add i32 <index>, 1\n" +
            "  <ptr> = getelementptr i32* <register>, i32 <shifted>\n" +    
            "  store i32 <value>, i32* <ptr>\n"
        );
        template.add("shifted", generateNewRegister());
        template.add("register", register);
        template.add("index", index.getRegister());
        template.add("value", value.getRegister());
        template.add("ptr", generateNewRegister());
        code.addCode(value);
        code.addCode(index);
        code.addCode(template.render());
        return code;
    }
    
    @Override
    public CodeFragment visitVarAccess(jazzikParser.VarAccessContext ctx) {
        CodeFragment code = new CodeFragment();
        String ret_register = generateNewRegister();
        
        String register = getVariable(ctx.ID().getText()).register;
        ST template = new ST(
            "  <ret_register> = load i32* <register>\n"
        );
        template.add("ret_register", ret_register);
        template.add("register", register);
        code.addCode(template.render());
        code.setRegister(ret_register);
        return code;
    }
    
    @Override
    public CodeFragment visitArrayAccess(jazzikParser.ArrayAccessContext ctx) {
        CodeFragment code = new CodeFragment();
        CodeFragment index = visit(ctx.expression());
        
        String register = getVariable(ctx.ID().getText()).register;
        ST template = new ST(
            "  <shifted> = add i32 <index>, 1\n" +
            "  <ptr> = getelementptr i32* <register>, i32 <shifted>\n" +   
            "  <ret_register> = load i32* <ptr>\n"
        );
        template.add("shifted", generateNewRegister());
        template.add("register", register);
        template.add("index", index.getRegister());
        template.add("ptr", generateNewRegister());
        String ret_register = generateNewRegister();
        template.add("ret_register", ret_register);
        code.addCode(index);
        code.addCode(template.render());
        code.setRegister(ret_register);
        return code;
    }
    
    @Override
    public CodeFragment visitSize(jazzikParser.SizeContext ctx) {
        CodeFragment code = new CodeFragment();
        
        String register = getVariable(ctx.ID().getText()).register;
        ST template = new ST(
            "  <ret_register> = load i32* <register>\n"
        );
        template.add("register", register);
        String ret_register = generateNewRegister();
        template.add("ret_register", ret_register);
        code.addCode(template.render());
        code.setRegister(ret_register);
        return code;
    }
    
    /*
     * Integer operators
     * 
     */
    
    @Override
    public CodeFragment visitUna(jazzikParser.UnaContext ctx) {
        CodeFragment code = new CodeFragment();
        CodeFragment expr = visit(ctx.expression());
        String register, tmp;
        switch (ctx.op.getType()) {
            case jazzikParser.ADD:
                return expr;
            case jazzikParser.SUB:
                code.addCode(expr);
                register = generateNewRegister();
                code.addCode(String.format("  %s = sub i32 0, %s\n", register, expr.getRegister()));
                code.setRegister(register);
                return code;
            case jazzikParser.NEG:
                code.addCode(expr);
                register = generateNewRegister();
                tmp = generateNewRegister();
                code.addCode(String.format("  %s = icmp eq i32 %s, 0\n", tmp, expr.getRegister()));
                code.addCode(String.format("  %s = zext i1 %s to i32\n", register, tmp));
                code.setRegister(register);
                return code;
        }
        return null;
    }
    
    @Override
    public CodeFragment visitMul(jazzikParser.MulContext ctx) {
        CodeFragment code = new CodeFragment();
        CodeFragment left = visit(ctx.expression(0));
        CodeFragment right = visit(ctx.expression(1));
        code.addCode(left);
        code.addCode(right);
        String register = generateNewRegister();
        code.setRegister(register);
        String operator = "OPERATOR";
        switch (ctx.op.getType()) {
            case jazzikParser.MUL: operator = "mul"; break;
            case jazzikParser.DIV: operator = "sdiv"; break;
            case jazzikParser.MOD: operator = "srem"; break;
        }
        code.addCode(String.format("  %s = %s i32 %s, %s\n", register, operator, left.getRegister(), right.getRegister()));
        return code;
    }
    
    @Override
    public CodeFragment visitAdd(jazzikParser.AddContext ctx) {
        CodeFragment code = new CodeFragment();
        CodeFragment left = visit(ctx.expression(0));
        CodeFragment right = visit(ctx.expression(1));
        code.addCode(left);
        code.addCode(right);
        String register = generateNewRegister();
        code.setRegister(register);
        String operator = "OPERATOR";
        switch (ctx.op.getType()) {
            case jazzikParser.ADD: operator = "add"; break;
            case jazzikParser.SUB: operator = "sub"; break;
        }
        code.addCode(String.format("  %s = %s i32 %s, %s\n", register, operator, left.getRegister(), right.getRegister()));
        return code;
    }
    
    @Override
    public CodeFragment visitCmp(jazzikParser.CmpContext ctx) {
        CodeFragment code = new CodeFragment();
        CodeFragment left = visit(ctx.expression(0));
        CodeFragment right = visit(ctx.expression(1));
        code.addCode(left);
        code.addCode(right);
        String operator = "OPERATOR";
        switch (ctx.op.getType()) {
            case jazzikParser.GT: operator = "sgt"; break;
            case jazzikParser.GTE: operator = "sge"; break;
            case jazzikParser.LT: operator = "slt"; break;
            case jazzikParser.LTE: operator = "sle"; break;
            case jazzikParser.EQ: operator = "eq"; break;
            case jazzikParser.NEQ: operator = "ne"; break;
        }
        ST template = new ST(
            "  <bool> = icmp <operator> i32 <left>, <right>\n" +
            "  <register> = zext i1 <bool> to i32 \n"
        );
        template.add("left", left.getRegister());
        template.add("right", right.getRegister());
        template.add("operator", operator);
        template.add("bool", generateNewRegister());
        String register = generateNewRegister();
        code.setRegister(register);
        template.add("register", register);
        code.addCode(template.render());
        return code;
    }
    
    @Override
    public CodeFragment visitLog(jazzikParser.LogContext ctx) {
        CodeFragment code = new CodeFragment();
        CodeFragment left = visit(ctx.expression(0));
        CodeFragment right = visit(ctx.expression(1));
        code.addCode(left);
        code.addCode(right);
        String operator = "OPERATOR";
        switch (ctx.op.getType()) {
            case jazzikParser.AND: operator = "and"; break;
            case jazzikParser.OR: operator = "or"; break;
        }
        ST template = new ST(
            "  <r1> = icmp ne i32 <left>, 0\n" +
            "  <r2> = icmp ne i32 <right>, 0\n" +
            "  <bool> = <operator> i1 <r1>, <r2>\n" +
            "  <register> = zext i1 <bool> to i32 \n"
        );
        template.add("r1", generateNewRegister());
        template.add("r2", generateNewRegister());
        template.add("bool", generateNewRegister());
        template.add("left", left.getRegister());
        template.add("right", right.getRegister());
        template.add("operator", operator);
        String register = generateNewRegister();
        code.setRegister(register);
        template.add("register", register);
        code.addCode(template.render());
        return code;
    }
    
    /*
     * Control Flow
     * 
     */
    
    @Override
    public CodeFragment visitIf(jazzikParser.IfContext ctx) {
        CodeFragment expr = visit(ctx.expression());
        
        ST template = new ST(
            "<expr_code>" +
            "  <cmp> = icmp ne i32 <expr>, 0\n" + 
            "  br i1 <cmp>, label %<label_true>, label %<label_false>\n" +
            "<label_true>:\n" +
            "<true_code>" +
            "  br label %<label_end>\n" + 
            "<label_false>:\n" + 
            "<false_code>" +
            "  br label %<label_end>\n" + 
            "<label_end>:\n" +
            "  <ret> = add i32 0, 0\n"
        );
        
        template.add("cmp", generateNewRegister());
        CodeFragment trueCode = visit(ctx.block(0));
        CodeFragment falseCode = new CodeFragment();
        if (ctx.block().size() > 1) falseCode = visit(ctx.block(1));
        template.add("expr_code", expr);
        template.add("true_code", trueCode.getCode());
        template.add("false_code", falseCode.getCode());
        template.add("expr", expr.getRegister());
        template.add("label_true", this.generateNewLabel());
        template.add("label_false", this.generateNewLabel());
        template.add("label_end", this.generateNewLabel());
        template.add("ret", generateNewRegister());

        CodeFragment code = new CodeFragment();
        code.addCode(template.render());
        code.addGlobal(trueCode);
        code.addGlobal(falseCode);
        return code;
    }
    
    @Override
    public CodeFragment visitUnless(jazzikParser.UnlessContext ctx) {
        CodeFragment expr = visit(ctx.expression());
        CodeFragment trueCode = new CodeFragment();
        if (ctx.block().size() > 1) trueCode = visit(ctx.block(1));
        CodeFragment falseCode = visit(ctx.block(0));
        
        ST template = new ST(
            "<expr_code>" +
            "  <cmp> = icmp ne i32 <expr>, 0\n" + 
            "  br i1 <cmp>, label %<label_true>, label %<label_false>\n" +
            "<label_true>:\n" +
            "<true_code>" +
            "  br label %<label_end>\n" + 
            "<label_false>:\n" + 
            "<false_code>" +
            "  br label %<label_end>\n" + 
            "<label_end>:\n" +
            "  <ret> = add i32 0, 0\n"
        );
        
        template.add("expr_code", expr);
        template.add("true_code", trueCode.getCode());
        template.add("false_code", falseCode.getCode());
        template.add("expr", expr.getRegister());
        template.add("cmp", generateNewRegister());
        template.add("label_true", this.generateNewLabel());
        template.add("label_false", this.generateNewLabel());
        template.add("label_end", this.generateNewLabel());
        template.add("ret", generateNewRegister());

        CodeFragment code = new CodeFragment();
        code.addCode(template.render());
        code.addGlobal(trueCode);
        code.addGlobal(falseCode);
        return code;
    }
    
    @Override
    public CodeFragment visitFor(jazzikParser.ForContext ctx) {
        startScope();
        CodeFragment start = visit(ctx.expression(0));
        CodeFragment end = visit(ctx.expression(1));
        
        String register = registerVariable(jazzikParser.INT_TYPE, ctx.ID().getText());
        CodeFragment body = visit(ctx.block());
        
        String operator = "OPERATOR";
        switch (ctx.rtype.getType()) {
            case jazzikParser.INC_RANGE: operator = "sle"; break;
            case jazzikParser.EXC_RANGE: operator = "slt"; break;
        }
        
        ST template = new ST(
            "  br label %<init_label>\n" + 
            "<init_label>:\n" + 
            "  <iter> = alloca i32\n" +
            "  store i32 <start>, i32* <iter>\n" + 
            "  br label %<cmp_label>\n" + 
            "<cmp_label>:\n" + 
            "  <r0> = load i32* <iter>\n" +
            "  <cmp> = icmp <operator> i32 <r0>, <end>\n" + 
            "  br i1 <cmp>, label %<body_label>, label %<end_label>\n" + 
            "<body_label>:\n" + 
            "<body_code>" + 
            "  <r1> = load i32* <iter>\n" +
            "  <r2> = add i32 <r1>, 1\n" +
            "  store i32 <r2>, i32* <iter>\n" + 
            "  br label %<cmp_label>\n" + 
            "<end_label>:\n" + 
            "  <ret> = add i32 0, 0\n"
        );
        
        template.add("init_label", generateNewLabel());
        template.add("cmp_label", generateNewLabel());
        template.add("body_label", generateNewLabel());
        template.add("end_label", generateNewLabel());
        template.add("iter", register);
        template.add("operator", operator);
        template.add("cmp", generateNewRegister());
        template.add("r0", generateNewRegister());
        template.add("r1", generateNewRegister());
        template.add("r2", generateNewRegister());
        template.add("ret", generateNewRegister());
        template.add("start", start.getRegister());
        template.add("end", end.getRegister());
        template.add("body_code", body.getCode());
        
        CodeFragment code = new CodeFragment();
        code.addCode(start);
        code.addCode(end);
        code.addCode(template.render());
        code.addGlobal(body);
        endScope();
        return code;
    }
    
    @Override
    public CodeFragment visitWhile(jazzikParser.WhileContext ctx) {
        CodeFragment expr = visit(ctx.expression());
        CodeFragment body = visit(ctx.block());
        String cmp = generateNewRegister();
        
        ST template = new ST(
            "  br label %<cmp_label>\n" + 
            "<cmp_label>:\n" + 
            "<expr_code>" +
            "  <cmp> = icmp ne i32 <expr_reg>, 0\n" + 
            "  br i1 <cmp>, label %<body_label>, label %<end_label>\n" + 
            "<body_label>:\n" + 
            "<body_code>" + 
            "  br label %<cmp_label>\n" + 
            "<end_label>:\n" + 
            "  <ret> = add i32 0, 0\n"
        );
        
        template.add("cmp_label", generateNewLabel());
        template.add("body_label", generateNewLabel());
        template.add("end_label", generateNewLabel());
        template.add("expr_code", expr.getCode());
        template.add("expr_reg", expr.getRegister());
        template.add("cmp", generateNewRegister());
        template.add("body_code", body.getCode());
        template.add("ret", generateNewRegister());
                
        CodeFragment code = new CodeFragment();
        code.addCode(template.render());
        code.addGlobal(body);
        return code;
    }
    
    /*
     * Write
     * 
     */
    
    @Override
    public CodeFragment visitWrite(jazzikParser.WriteContext ctx) {
        CodeFragment code = visitChildren(ctx);
        code.addCode("  call void @write_nl()\n");
        return code;
    }
    
    @Override
    public CodeFragment visitWriteInt(jazzikParser.WriteIntContext ctx) {
        CodeFragment code = new CodeFragment();
        CodeFragment expr = visit(ctx.expression());
        ST template = new ST(
            "  call void @write_int(i32 <register>)\n"
        );
        template.add("register", expr.getRegister());
        code.addCode(expr);
        code.addCode(template.render());
        return code;
    }
    
    @Override
    public CodeFragment visitWriteStr(jazzikParser.WriteStrContext ctx) {
        CodeFragment code = new CodeFragment();
        String str = ctx.STRING().getText().replaceAll("\"", "");
        ST global = new ST(
            "<name> = global [<length> x i8] c\"<string>\\00\"\n"
        );
        ST template = new ST(
            "  <ptr> = getelementptr [<length> x i8]* <name>, i64 0, i64 0\n" +
            "  call void @write_str(i8* <ptr>)\n"
        );
        String name = generateNewString();
        global.add("name", name);
        global.add("length", str.length() + 1);
        global.add("string", str);
        template.add("name", name);
        template.add("length", str.length() + 1);
        template.add("ptr", generateNewRegister());
        code.addGlobal(global.render());
        code.addCode(template.render());
        return code;
    }
    
    @Override
    public CodeFragment visitReadInt(jazzikParser.ReadIntContext ctx) {
        CodeFragment code = new CodeFragment();
        String register = getVariable(ctx.ID().getText()).register;
        ST template = new ST(
            "  call void @read_int(i32* <register>)\n"
        );
        template.add("register", register);
        code.addCode(template.render());
        return code;
    }
    
    @Override
    public CodeFragment visitReadArray(jazzikParser.ReadArrayContext ctx) {
        CodeFragment code = new CodeFragment();
        CodeFragment index = visit(ctx.expression());
        String register = getVariable(ctx.ID().getText()).register;
        ST template = new ST(
            "  <shifted> = add i32 <index>, 1\n" +
            "  <ptr> = getelementptr i32* <register>, i32 <shifted>\n" +
            "  call void @read_int(i32* <ptr>)\n"
        );
        template.add("register", register);
        template.add("index", index.getRegister());
        template.add("shifted", generateNewRegister());
        template.add("ptr", generateNewRegister());
        code.addCode(index);
        code.addCode(template.render());
        return code;
    }
}