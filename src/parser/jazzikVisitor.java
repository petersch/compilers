// Generated from jazzik.g4 by ANTLR 4.1
package parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link jazzikParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface jazzikVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link jazzikParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(@NotNull jazzikParser.RangeContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#ArrayDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDecl(@NotNull jazzikParser.ArrayDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#Continue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue(@NotNull jazzikParser.ContinueContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#WriteInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteInt(@NotNull jazzikParser.WriteIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#Una}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUna(@NotNull jazzikParser.UnaContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull jazzikParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(@NotNull jazzikParser.CondContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#BoolVarDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolVarDecl(@NotNull jazzikParser.BoolVarDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#Mul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(@NotNull jazzikParser.MulContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#ifstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstatement(@NotNull jazzikParser.IfstatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#ArrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(@NotNull jazzikParser.ArrayAccessContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#Add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(@NotNull jazzikParser.AddContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#forstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForstatement(@NotNull jazzikParser.ForstatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#For}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(@NotNull jazzikParser.ForContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#Expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull jazzikParser.ExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#funcdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdef(@NotNull jazzikParser.FuncdefContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#VarAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAccess(@NotNull jazzikParser.VarAccessContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#Break}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak(@NotNull jazzikParser.BreakContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(@NotNull jazzikParser.InitContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#FuncCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(@NotNull jazzikParser.FuncCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#Par}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar(@NotNull jazzikParser.ParContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#Vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVars(@NotNull jazzikParser.VarsContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#AssignNope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignNope(@NotNull jazzikParser.AssignNopeContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#ReturnBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnBool(@NotNull jazzikParser.ReturnBoolContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#Bin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin(@NotNull jazzikParser.BinContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#Nop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNop(@NotNull jazzikParser.NopContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#ReturnInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnInt(@NotNull jazzikParser.ReturnIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#IntVarDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntVarDecl(@NotNull jazzikParser.IntVarDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalue(@NotNull jazzikParser.LvalueContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#IntConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntConstant(@NotNull jazzikParser.IntConstantContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#AssignInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignInt(@NotNull jazzikParser.AssignIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#ReturnVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnVoid(@NotNull jazzikParser.ReturnVoidContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#AssignBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignBool(@NotNull jazzikParser.AssignBoolContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#Read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(@NotNull jazzikParser.ReadContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#If}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(@NotNull jazzikParser.IfContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#funcargdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncargdef(@NotNull jazzikParser.FuncargdefContext ctx);
}