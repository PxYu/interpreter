// Generated from /Users/Lucius/IdeaProjects/cmm/cmm.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link cmmParser}.
 */
public interface cmmListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link cmmParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(cmmParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link cmmParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(cmmParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vardecl}
	 * labeled alternative in {@link cmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterVardecl(cmmParser.VardeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vardecl}
	 * labeled alternative in {@link cmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitVardecl(cmmParser.VardeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifstmt}
	 * labeled alternative in {@link cmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(cmmParser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifstmt}
	 * labeled alternative in {@link cmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(cmmParser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whilestmt}
	 * labeled alternative in {@link cmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhilestmt(cmmParser.WhilestmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whilestmt}
	 * labeled alternative in {@link cmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhilestmt(cmmParser.WhilestmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code breakstmt}
	 * labeled alternative in {@link cmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakstmt(cmmParser.BreakstmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code breakstmt}
	 * labeled alternative in {@link cmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakstmt(cmmParser.BreakstmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignstmt}
	 * labeled alternative in {@link cmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignstmt(cmmParser.AssignstmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignstmt}
	 * labeled alternative in {@link cmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignstmt(cmmParser.AssignstmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readstmt}
	 * labeled alternative in {@link cmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterReadstmt(cmmParser.ReadstmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readstmt}
	 * labeled alternative in {@link cmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitReadstmt(cmmParser.ReadstmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code writestmt}
	 * labeled alternative in {@link cmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterWritestmt(cmmParser.WritestmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code writestmt}
	 * labeled alternative in {@link cmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitWritestmt(cmmParser.WritestmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtblock}
	 * labeled alternative in {@link cmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtblock(cmmParser.StmtblockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtblock}
	 * labeled alternative in {@link cmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtblock(cmmParser.StmtblockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LParenStmtRParen}
	 * labeled alternative in {@link cmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterLParenStmtRParen(cmmParser.LParenStmtRParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LParenStmtRParen}
	 * labeled alternative in {@link cmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitLParenStmtRParen(cmmParser.LParenStmtRParenContext ctx);
	/**
	 * Enter a parse tree produced by {@link cmmParser#stmt_block}.
	 * @param ctx the parse tree
	 */
	void enterStmt_block(cmmParser.Stmt_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link cmmParser#stmt_block}.
	 * @param ctx the parse tree
	 */
	void exitStmt_block(cmmParser.Stmt_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link cmmParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(cmmParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link cmmParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(cmmParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link cmmParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(cmmParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link cmmParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(cmmParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link cmmParser#var_list}.
	 * @param ctx the parse tree
	 */
	void enterVar_list(cmmParser.Var_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link cmmParser#var_list}.
	 * @param ctx the parse tree
	 */
	void exitVar_list(cmmParser.Var_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link cmmParser#decl_assign}.
	 * @param ctx the parse tree
	 */
	void enterDecl_assign(cmmParser.Decl_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link cmmParser#decl_assign}.
	 * @param ctx the parse tree
	 */
	void exitDecl_assign(cmmParser.Decl_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link cmmParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(cmmParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link cmmParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(cmmParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link cmmParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(cmmParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link cmmParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(cmmParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link cmmParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(cmmParser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link cmmParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(cmmParser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link cmmParser#read_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRead_stmt(cmmParser.Read_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link cmmParser#read_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRead_stmt(cmmParser.Read_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link cmmParser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWrite_stmt(cmmParser.Write_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link cmmParser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWrite_stmt(cmmParser.Write_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link cmmParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(cmmParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link cmmParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(cmmParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link cmmParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(cmmParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link cmmParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(cmmParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link cmmParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(cmmParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link cmmParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(cmmParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link cmmParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(cmmParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link cmmParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(cmmParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getIf}
	 * labeled alternative in {@link cmmParser#if_}.
	 * @param ctx the parse tree
	 */
	void enterGetIf(cmmParser.GetIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getIf}
	 * labeled alternative in {@link cmmParser#if_}.
	 * @param ctx the parse tree
	 */
	void exitGetIf(cmmParser.GetIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getElse}
	 * labeled alternative in {@link cmmParser#else_}.
	 * @param ctx the parse tree
	 */
	void enterGetElse(cmmParser.GetElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getElse}
	 * labeled alternative in {@link cmmParser#else_}.
	 * @param ctx the parse tree
	 */
	void exitGetElse(cmmParser.GetElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getWhile}
	 * labeled alternative in {@link cmmParser#while_}.
	 * @param ctx the parse tree
	 */
	void enterGetWhile(cmmParser.GetWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getWhile}
	 * labeled alternative in {@link cmmParser#while_}.
	 * @param ctx the parse tree
	 */
	void exitGetWhile(cmmParser.GetWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getRead}
	 * labeled alternative in {@link cmmParser#read_}.
	 * @param ctx the parse tree
	 */
	void enterGetRead(cmmParser.GetReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getRead}
	 * labeled alternative in {@link cmmParser#read_}.
	 * @param ctx the parse tree
	 */
	void exitGetRead(cmmParser.GetReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getWrite}
	 * labeled alternative in {@link cmmParser#write_}.
	 * @param ctx the parse tree
	 */
	void enterGetWrite(cmmParser.GetWriteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getWrite}
	 * labeled alternative in {@link cmmParser#write_}.
	 * @param ctx the parse tree
	 */
	void exitGetWrite(cmmParser.GetWriteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getInt}
	 * labeled alternative in {@link cmmParser#int_}.
	 * @param ctx the parse tree
	 */
	void enterGetInt(cmmParser.GetIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getInt}
	 * labeled alternative in {@link cmmParser#int_}.
	 * @param ctx the parse tree
	 */
	void exitGetInt(cmmParser.GetIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getDouble}
	 * labeled alternative in {@link cmmParser#double_}.
	 * @param ctx the parse tree
	 */
	void enterGetDouble(cmmParser.GetDoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getDouble}
	 * labeled alternative in {@link cmmParser#double_}.
	 * @param ctx the parse tree
	 */
	void exitGetDouble(cmmParser.GetDoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getBreak}
	 * labeled alternative in {@link cmmParser#break_}.
	 * @param ctx the parse tree
	 */
	void enterGetBreak(cmmParser.GetBreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getBreak}
	 * labeled alternative in {@link cmmParser#break_}.
	 * @param ctx the parse tree
	 */
	void exitGetBreak(cmmParser.GetBreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getIdent}
	 * labeled alternative in {@link cmmParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterGetIdent(cmmParser.GetIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getIdent}
	 * labeled alternative in {@link cmmParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitGetIdent(cmmParser.GetIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getIntConstant}
	 * labeled alternative in {@link cmmParser#intconstant}.
	 * @param ctx the parse tree
	 */
	void enterGetIntConstant(cmmParser.GetIntConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getIntConstant}
	 * labeled alternative in {@link cmmParser#intconstant}.
	 * @param ctx the parse tree
	 */
	void exitGetIntConstant(cmmParser.GetIntConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getRealConstant}
	 * labeled alternative in {@link cmmParser#realconstant}.
	 * @param ctx the parse tree
	 */
	void enterGetRealConstant(cmmParser.GetRealConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getRealConstant}
	 * labeled alternative in {@link cmmParser#realconstant}.
	 * @param ctx the parse tree
	 */
	void exitGetRealConstant(cmmParser.GetRealConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getBooleanConstant}
	 * labeled alternative in {@link cmmParser#booleanconstant}.
	 * @param ctx the parse tree
	 */
	void enterGetBooleanConstant(cmmParser.GetBooleanConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getBooleanConstant}
	 * labeled alternative in {@link cmmParser#booleanconstant}.
	 * @param ctx the parse tree
	 */
	void exitGetBooleanConstant(cmmParser.GetBooleanConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getCompop}
	 * labeled alternative in {@link cmmParser#compop}.
	 * @param ctx the parse tree
	 */
	void enterGetCompop(cmmParser.GetCompopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getCompop}
	 * labeled alternative in {@link cmmParser#compop}.
	 * @param ctx the parse tree
	 */
	void exitGetCompop(cmmParser.GetCompopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getMulDivMod}
	 * labeled alternative in {@link cmmParser#muldivmod}.
	 * @param ctx the parse tree
	 */
	void enterGetMulDivMod(cmmParser.GetMulDivModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getMulDivMod}
	 * labeled alternative in {@link cmmParser#muldivmod}.
	 * @param ctx the parse tree
	 */
	void exitGetMulDivMod(cmmParser.GetMulDivModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getAddMin}
	 * labeled alternative in {@link cmmParser#addmin}.
	 * @param ctx the parse tree
	 */
	void enterGetAddMin(cmmParser.GetAddMinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getAddMin}
	 * labeled alternative in {@link cmmParser#addmin}.
	 * @param ctx the parse tree
	 */
	void exitGetAddMin(cmmParser.GetAddMinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getLParen}
	 * labeled alternative in {@link cmmParser#lparen}.
	 * @param ctx the parse tree
	 */
	void enterGetLParen(cmmParser.GetLParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getLParen}
	 * labeled alternative in {@link cmmParser#lparen}.
	 * @param ctx the parse tree
	 */
	void exitGetLParen(cmmParser.GetLParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getRParen}
	 * labeled alternative in {@link cmmParser#rparen}.
	 * @param ctx the parse tree
	 */
	void enterGetRParen(cmmParser.GetRParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getRParen}
	 * labeled alternative in {@link cmmParser#rparen}.
	 * @param ctx the parse tree
	 */
	void exitGetRParen(cmmParser.GetRParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getLCurly}
	 * labeled alternative in {@link cmmParser#lcurly}.
	 * @param ctx the parse tree
	 */
	void enterGetLCurly(cmmParser.GetLCurlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getLCurly}
	 * labeled alternative in {@link cmmParser#lcurly}.
	 * @param ctx the parse tree
	 */
	void exitGetLCurly(cmmParser.GetLCurlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getRCurly}
	 * labeled alternative in {@link cmmParser#rcurly}.
	 * @param ctx the parse tree
	 */
	void enterGetRCurly(cmmParser.GetRCurlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getRCurly}
	 * labeled alternative in {@link cmmParser#rcurly}.
	 * @param ctx the parse tree
	 */
	void exitGetRCurly(cmmParser.GetRCurlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getLBracket}
	 * labeled alternative in {@link cmmParser#lbracket}.
	 * @param ctx the parse tree
	 */
	void enterGetLBracket(cmmParser.GetLBracketContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getLBracket}
	 * labeled alternative in {@link cmmParser#lbracket}.
	 * @param ctx the parse tree
	 */
	void exitGetLBracket(cmmParser.GetLBracketContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getRBracket}
	 * labeled alternative in {@link cmmParser#rbracket}.
	 * @param ctx the parse tree
	 */
	void enterGetRBracket(cmmParser.GetRBracketContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getRBracket}
	 * labeled alternative in {@link cmmParser#rbracket}.
	 * @param ctx the parse tree
	 */
	void exitGetRBracket(cmmParser.GetRBracketContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getAssign}
	 * labeled alternative in {@link cmmParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterGetAssign(cmmParser.GetAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getAssign}
	 * labeled alternative in {@link cmmParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitGetAssign(cmmParser.GetAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getLineEnd}
	 * labeled alternative in {@link cmmParser#lineend}.
	 * @param ctx the parse tree
	 */
	void enterGetLineEnd(cmmParser.GetLineEndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getLineEnd}
	 * labeled alternative in {@link cmmParser#lineend}.
	 * @param ctx the parse tree
	 */
	void exitGetLineEnd(cmmParser.GetLineEndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getComma}
	 * labeled alternative in {@link cmmParser#comma}.
	 * @param ctx the parse tree
	 */
	void enterGetComma(cmmParser.GetCommaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getComma}
	 * labeled alternative in {@link cmmParser#comma}.
	 * @param ctx the parse tree
	 */
	void exitGetComma(cmmParser.GetCommaContext ctx);
}