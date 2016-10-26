grammar cmm;

program :
    (stmt)+
    ;

stmt :
    var_decl                #vardecl
    | if_stmt               #ifstmt
    | while_stmt            #whilestmt
    | break_stmt            #breakstmt
    | assign_stmt           #assignstmt
    | read_stmt             #readstmt
    | write_stmt            #writestmt
    | stmt_block            #stmtblock
    | LParen stmt RParen    #LParenStmtRParen
    ;

stmt_block :
    lcurly (stmt)* rcurly
    ;

var_decl :
    type var_list lineend
    ;

type :
    int_ |
    double_ |
    type lbracket intconstant rbracket
    ;

var_list :
    ident (comma ident)*
    ;

decl_assign :
    ident assign expr
    ;

if_stmt :
    if_ expr stmt |
    if_ expr stmt else_ stmt
    ;

while_stmt :
    while_ expr stmt
    ;

break_stmt :
    break_ lineend
    ;

read_stmt :
    read_ lparen ident rparen lineend |
    read_ lparen ident lbracket intconstant rbracket lineend
    ;

write_stmt :
    write_ lparen expr rparen lineend
    ;

assign_stmt :
    value assign expr lineend
    ;

value :
    ident |
    ident lbracket intconstant rbracket
    ;

constant :
    intconstant |
    realconstant |
    booleanconstant
    ;

expr :
    expr muldivmod expr |
    expr addmin expr |
    expr compop expr |
	lparen expr rparen |
	ident |
	constant |
	addmin expr
	;

if_ :
    If # getIf
    ;
else_ :
    Else # getElse
    ;
while_ :
    While # getWhile
    ;
read_ :
    Read # getRead
    ;
write_ :
    Write # getWrite
    ;
int_ :
    Int # getInt
    ;
double_ :
    Double # getDouble
    ;
break_ :
    Break # getBreak
    ;

If : 'if' ;
Else : 'else' ;
While : 'while' ;
Read : 'read' ;
Write : 'write' ;
Int : 'int' ;
Double : 'double' ;
Break : 'break' ;

ident :
    Ident # getIdent
    ;
intconstant :
    IntConstant # getIntConstant
    ;
realconstant :
    RealConstant # getRealConstant
    ;
booleanconstant :
    BooleanConstant # getBooleanConstant
    ;
compop :
    CompOp # getCompop
    ;
muldivmod :
    MulDivMod # getMulDivMod
    ;
addmin :
    AddMin # getAddMin
    ;
lparen :
    LParen # getLParen
    ;
rparen :
    RParen # getRParen
    ;
lcurly :
    LCurly # getLCurly
    ;
rcurly :
    RCurly # getRCurly
    ;
lbracket :
    LBracket # getLBracket
    ;
rbracket :
    RBracket # getRBracket
    ;
assign :
    Assign # getAssign
    ;
lineend:
    LineEnd # getLineEnd
    ;
comma:
    Comma # getComma
    ;


Ident :
    [a-zA-Z]([a-zA-Z] | '_' | [0-9])*
    ;

IntConstant : '0' | [1-9][0-9]*;
RealConstant : IntConstant('.'([0-9]+))? ;
BooleanConstant : 'true' | 'false' ;

CompOp : '<=' | '>=' | '>' | '<' | '!=' | '==' | '<>' |;
MulDivMod : '*' | '/' | '%';
AddMin : '+' | '-' ;

LParen : '(' ;
RParen : ')' ;
LCurly : '{' ;
RCurly : '}' ;
LBracket : '[' ;
RBracket : ']' ;

Assign : '=' ;

LineEnd : ';' ;

Comma : ',' ;

WS : [' '\t\r\n]+ -> skip ;

SL_COMMENT :   '//' ~[\r\n]* -> skip;
MUL_COMMENT :   '/*' .*? '*/' -> skip;