// Generated from /Users/Lucius/IdeaProjects/cmm/cmm.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link cmmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface cmmVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link cmmParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(cmmParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vardecl}
	 * labeled alternative in {@link cmmParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardecl(cmmParser.VardeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifstmt}
	 * labeled alternative in {@link cmmParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstmt(cmmParser.IfstmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whilestmt}
	 * labeled alternative in {@link cmmParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilestmt(cmmParser.WhilestmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code breakstmt}
	 * labeled alternative in {@link cmmParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakstmt(cmmParser.BreakstmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignstmt}
	 * labeled alternative in {@link cmmParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignstmt(cmmParser.AssignstmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readstmt}
	 * labeled alternative in {@link cmmParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadstmt(cmmParser.ReadstmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code writestmt}
	 * labeled alternative in {@link cmmParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWritestmt(cmmParser.WritestmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtblock}
	 * labeled alternative in {@link cmmParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtblock(cmmParser.StmtblockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LParenStmtRParen}
	 * labeled alternative in {@link cmmParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLParenStmtRParen(cmmParser.LParenStmtRParenContext ctx);
	/**
	 * Visit a parse tree produced by {@link cmmParser#stmt_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_block(cmmParser.Stmt_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link cmmParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(cmmParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link cmmParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(cmmParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link cmmParser#var_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_list(cmmParser.Var_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link cmmParser#decl_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_assign(cmmParser.Decl_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link cmmParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(cmmParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link cmmParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(cmmParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link cmmParser#break_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(cmmParser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link cmmParser#read_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_stmt(cmmParser.Read_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link cmmParser#write_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_stmt(cmmParser.Write_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link cmmParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(cmmParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link cmmParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(cmmParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link cmmParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(cmmParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link cmmParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(cmmParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getIf}
	 * labeled alternative in {@link cmmParser#if_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetIf(cmmParser.GetIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getElse}
	 * labeled alternative in {@link cmmParser#else_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetElse(cmmParser.GetElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getWhile}
	 * labeled alternative in {@link cmmParser#while_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetWhile(cmmParser.GetWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getRead}
	 * labeled alternative in {@link cmmParser#read_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetRead(cmmParser.GetReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getWrite}
	 * labeled alternative in {@link cmmParser#write_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetWrite(cmmParser.GetWriteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getInt}
	 * labeled alternative in {@link cmmParser#int_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetInt(cmmParser.GetIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getDouble}
	 * labeled alternative in {@link cmmParser#double_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetDouble(cmmParser.GetDoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getBreak}
	 * labeled alternative in {@link cmmParser#break_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetBreak(cmmParser.GetBreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getIdent}
	 * labeled alternative in {@link cmmParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetIdent(cmmParser.GetIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getIntConstant}
	 * labeled alternative in {@link cmmParser#intconstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetIntConstant(cmmParser.GetIntConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getRealConstant}
	 * labeled alternative in {@link cmmParser#realconstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetRealConstant(cmmParser.GetRealConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getBooleanConstant}
	 * labeled alternative in {@link cmmParser#booleanconstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetBooleanConstant(cmmParser.GetBooleanConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getCompop}
	 * labeled alternative in {@link cmmParser#compop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetCompop(cmmParser.GetCompopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getMulDivMod}
	 * labeled alternative in {@link cmmParser#muldivmod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetMulDivMod(cmmParser.GetMulDivModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getAddMin}
	 * labeled alternative in {@link cmmParser#addmin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetAddMin(cmmParser.GetAddMinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getLParen}
	 * labeled alternative in {@link cmmParser#lparen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetLParen(cmmParser.GetLParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getRParen}
	 * labeled alternative in {@link cmmParser#rparen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetRParen(cmmParser.GetRParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getLCurly}
	 * labeled alternative in {@link cmmParser#lcurly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetLCurly(cmmParser.GetLCurlyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getRCurly}
	 * labeled alternative in {@link cmmParser#rcurly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetRCurly(cmmParser.GetRCurlyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getLBracket}
	 * labeled alternative in {@link cmmParser#lbracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetLBracket(cmmParser.GetLBracketContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getRBracket}
	 * labeled alternative in {@link cmmParser#rbracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetRBracket(cmmParser.GetRBracketContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getAssign}
	 * labeled alternative in {@link cmmParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetAssign(cmmParser.GetAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getLineEnd}
	 * labeled alternative in {@link cmmParser#lineend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetLineEnd(cmmParser.GetLineEndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getComma}
	 * labeled alternative in {@link cmmParser#comma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetComma(cmmParser.GetCommaContext ctx);
}