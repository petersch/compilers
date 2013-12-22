// Generated from jazzik.g4 by ANTLR 4.1
package parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link jazzikParser}.
 */
public interface jazzikListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link jazzikParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(@NotNull jazzikParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(@NotNull jazzikParser.RangeContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#ArrayDecl}.
	 * @param ctx the parse tree
	 */
	void enterArrayDecl(@NotNull jazzikParser.ArrayDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#ArrayDecl}.
	 * @param ctx the parse tree
	 */
	void exitArrayDecl(@NotNull jazzikParser.ArrayDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#Continue}.
	 * @param ctx the parse tree
	 */
	void enterContinue(@NotNull jazzikParser.ContinueContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#Continue}.
	 * @param ctx the parse tree
	 */
	void exitContinue(@NotNull jazzikParser.ContinueContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#WriteInt}.
	 * @param ctx the parse tree
	 */
	void enterWriteInt(@NotNull jazzikParser.WriteIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#WriteInt}.
	 * @param ctx the parse tree
	 */
	void exitWriteInt(@NotNull jazzikParser.WriteIntContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#Una}.
	 * @param ctx the parse tree
	 */
	void enterUna(@NotNull jazzikParser.UnaContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#Una}.
	 * @param ctx the parse tree
	 */
	void exitUna(@NotNull jazzikParser.UnaContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull jazzikParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull jazzikParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(@NotNull jazzikParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(@NotNull jazzikParser.CondContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#BoolVarDecl}.
	 * @param ctx the parse tree
	 */
	void enterBoolVarDecl(@NotNull jazzikParser.BoolVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#BoolVarDecl}.
	 * @param ctx the parse tree
	 */
	void exitBoolVarDecl(@NotNull jazzikParser.BoolVarDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#Mul}.
	 * @param ctx the parse tree
	 */
	void enterMul(@NotNull jazzikParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#Mul}.
	 * @param ctx the parse tree
	 */
	void exitMul(@NotNull jazzikParser.MulContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void enterIfstatement(@NotNull jazzikParser.IfstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void exitIfstatement(@NotNull jazzikParser.IfstatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#ArrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(@NotNull jazzikParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#ArrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(@NotNull jazzikParser.ArrayAccessContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#Add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(@NotNull jazzikParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#Add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(@NotNull jazzikParser.AddContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#forstatement}.
	 * @param ctx the parse tree
	 */
	void enterForstatement(@NotNull jazzikParser.ForstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#forstatement}.
	 * @param ctx the parse tree
	 */
	void exitForstatement(@NotNull jazzikParser.ForstatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#For}.
	 * @param ctx the parse tree
	 */
	void enterFor(@NotNull jazzikParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#For}.
	 * @param ctx the parse tree
	 */
	void exitFor(@NotNull jazzikParser.ForContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#Expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull jazzikParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#Expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull jazzikParser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(@NotNull jazzikParser.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(@NotNull jazzikParser.FuncdefContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#VarAccess}.
	 * @param ctx the parse tree
	 */
	void enterVarAccess(@NotNull jazzikParser.VarAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#VarAccess}.
	 * @param ctx the parse tree
	 */
	void exitVarAccess(@NotNull jazzikParser.VarAccessContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#Break}.
	 * @param ctx the parse tree
	 */
	void enterBreak(@NotNull jazzikParser.BreakContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#Break}.
	 * @param ctx the parse tree
	 */
	void exitBreak(@NotNull jazzikParser.BreakContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(@NotNull jazzikParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(@NotNull jazzikParser.InitContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#FuncCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(@NotNull jazzikParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#FuncCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(@NotNull jazzikParser.FuncCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#Par}.
	 * @param ctx the parse tree
	 */
	void enterPar(@NotNull jazzikParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#Par}.
	 * @param ctx the parse tree
	 */
	void exitPar(@NotNull jazzikParser.ParContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#Vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(@NotNull jazzikParser.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#Vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(@NotNull jazzikParser.VarsContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#AssignNope}.
	 * @param ctx the parse tree
	 */
	void enterAssignNope(@NotNull jazzikParser.AssignNopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#AssignNope}.
	 * @param ctx the parse tree
	 */
	void exitAssignNope(@NotNull jazzikParser.AssignNopeContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#ReturnBool}.
	 * @param ctx the parse tree
	 */
	void enterReturnBool(@NotNull jazzikParser.ReturnBoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#ReturnBool}.
	 * @param ctx the parse tree
	 */
	void exitReturnBool(@NotNull jazzikParser.ReturnBoolContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#Bin}.
	 * @param ctx the parse tree
	 */
	void enterBin(@NotNull jazzikParser.BinContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#Bin}.
	 * @param ctx the parse tree
	 */
	void exitBin(@NotNull jazzikParser.BinContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#Nop}.
	 * @param ctx the parse tree
	 */
	void enterNop(@NotNull jazzikParser.NopContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#Nop}.
	 * @param ctx the parse tree
	 */
	void exitNop(@NotNull jazzikParser.NopContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#ReturnInt}.
	 * @param ctx the parse tree
	 */
	void enterReturnInt(@NotNull jazzikParser.ReturnIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#ReturnInt}.
	 * @param ctx the parse tree
	 */
	void exitReturnInt(@NotNull jazzikParser.ReturnIntContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#IntVarDecl}.
	 * @param ctx the parse tree
	 */
	void enterIntVarDecl(@NotNull jazzikParser.IntVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#IntVarDecl}.
	 * @param ctx the parse tree
	 */
	void exitIntVarDecl(@NotNull jazzikParser.IntVarDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(@NotNull jazzikParser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(@NotNull jazzikParser.LvalueContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#IntConstant}.
	 * @param ctx the parse tree
	 */
	void enterIntConstant(@NotNull jazzikParser.IntConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#IntConstant}.
	 * @param ctx the parse tree
	 */
	void exitIntConstant(@NotNull jazzikParser.IntConstantContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#AssignInt}.
	 * @param ctx the parse tree
	 */
	void enterAssignInt(@NotNull jazzikParser.AssignIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#AssignInt}.
	 * @param ctx the parse tree
	 */
	void exitAssignInt(@NotNull jazzikParser.AssignIntContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#ReturnVoid}.
	 * @param ctx the parse tree
	 */
	void enterReturnVoid(@NotNull jazzikParser.ReturnVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#ReturnVoid}.
	 * @param ctx the parse tree
	 */
	void exitReturnVoid(@NotNull jazzikParser.ReturnVoidContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#AssignBool}.
	 * @param ctx the parse tree
	 */
	void enterAssignBool(@NotNull jazzikParser.AssignBoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#AssignBool}.
	 * @param ctx the parse tree
	 */
	void exitAssignBool(@NotNull jazzikParser.AssignBoolContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#Read}.
	 * @param ctx the parse tree
	 */
	void enterRead(@NotNull jazzikParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#Read}.
	 * @param ctx the parse tree
	 */
	void exitRead(@NotNull jazzikParser.ReadContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#If}.
	 * @param ctx the parse tree
	 */
	void enterIf(@NotNull jazzikParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#If}.
	 * @param ctx the parse tree
	 */
	void exitIf(@NotNull jazzikParser.IfContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#funcargdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncargdef(@NotNull jazzikParser.FuncargdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#funcargdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncargdef(@NotNull jazzikParser.FuncargdefContext ctx);
}