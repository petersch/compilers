grammar jazzik;

@lexer::members {
    public boolean failed = false;
		public int errcount = 0;

    @Override
    public void recover(RecognitionException e) {
        failed = true;
				++errcount;
				super.recover(e);
	  }

		@Override
    public void recover(LexerNoViableAltException e) {
        failed = true;
				++errcount;
				super.recover(e);
		}
}

init: funcdecls;

funcdecls: (NEWLINE* funcdecl)* NEWLINE*;
     
funcdecl:
    type=('void'|'int') name=ID '(' args=funcargdecls? ')' block      # FuncDef
    | 'extern' ('void'|'int') ID '(' funcargdecl? (',' funcargdecl)* ')' # FuncExtern
    ;
    
block:
    NEWLINE* '{' (NEWLINE* statement (NEWLINE+ statement)*)? NEWLINE* '}' NEWLINE*
    ;

statement: 
    assignment                                         # Assign
		| vardecl 																				 # VarDecl
    | 'write' writearg (',' writearg)*                 # Write
    | 'read' readarg (',' readarg)*                    # Read
    | forstatement                                     # ForStm
    | ifstatement                                      # IfStm
    | 'return' expression?                             # ReturnInt
    | expression                                       # Expr
		| funcdecl { notifyErrorListeners("nested functions are not allowed"); } # ErrorNested
    ;

writearg:
	expression 																# WriteInt
	| STRING 																		# WriteStr
	;

readarg:
	ID '[' expression ']' 									# ReadArray
	| ID 																		# ReadInt
	;

vardecl:
	'int' intvardecl (',' intvardecl)*
	| 'bool' boolvardecl (',' boolvardecl)*
	;
intvardecl:
  name=ID ('=' expression)? 					# IntDecl
	| name=ID '[' expression ']' 					# ArrayDecl
	;
boolvardecl:
	name=ID ('=' cond)? 					# BoolDecl
	;

assignment:
    name=ID '=' expression                                    # AssignInt
		| name=ID '[' index=expression ']' '=' value=expression   # AssignArray
    ;

expression:
		op=('++'|'--') ID 																	# Inc
    | op=('!'|'+'|'-') expression                           # Una
    | expression op=('/'|'*'|'%') expression            # Mul
    | expression op=('&'|'|'|'^') expression            # Bin
    | expression op=('+'|'-') expression                # Add
    | expression op=('=='|'!='|'>'|'<'|'>='|'<=') expression   # Cmp
    | expression op=('&&'|'||') expression    # Log
    | '(' expression ')'                                # Par
		| 'size' '(' ID ')' 																# Size
    | ID '(' funcargs? ')'                              # FuncCall
    | INT                                               # IntConstant
    | varaccess     								                    # Vars
    ;

funccall:
	ID '(' funcargs? ')'
	;
funcargs:
	funcarg (',' funcarg)*
	;
funcarg:
	ID     										# FuncArgID
	| expression              # FuncArgExpr
	| cond   									# FuncArgCond
	;

varaccess:
    ID                                                  # VarAccess
    | ID '[' expression ']'                             # ArrayAccess   
    ;

funcargdecls:
		funcargdecl (',' funcargdecl)* 											# FuncArgDecls
		;

funcargdecl:
    type=('int'|'int[]'|'bool') name=ID                   # FuncArgDecl
    ;
    
ifstatement:
    'if' expression block ('else' block)?     # If
    | 'unless' expression block ('else' block)?     # Unless
    ;
    
forstatement:
    'for' ID 'in' expression rtype=('..'|'...') expression block   # For
    | 'while' expression block            # While
    ;
    
cond:
    expression op=('=='|'!='|'>'|'<'|'>='|'<=') expression
    | '!' cond
    | '(' cond ')'
    | BOOL
    | ID
    ;

//ID: [a-zA-Z][a-zA-Z0-9]*;

INT: [0-9]+;
STRING: '"' ~('\r'|'\n'|'"')* '"';
BOOL: ('true'|'false');

//TRUE: 'true';
//FALSE: 'false';

ASSIGN: '=';
COMMA: ',';
COLON: ':';
QMARK: '?';

INC: '++';
DEC: '--';
MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';
MOD: '%';
IAND: '&';
IOR: '|';
IXOR: '^';

NEG: '!';
AND: '&&';
OR: '||';

EQ: '==';
NEQ: '!=';
GT: '>';
LT: '<';
GTE: '>=';
LTE: '<=';

ARRAY_TYPE: 'int[]';
INT_TYPE: 'int';
BOOL_TYPE: 'bool';
VOID_TYPE: 'void';

SIZE: 'size';
IF: 'if';
UNLESS: 'unless';
ELSE: 'else';
FOR: 'for';
IN: 'in';
WHILE: 'while';
EXTERN: 'extern';
READ: 'read';
WRITE: 'write';
RETURN: 'return';
BREAK: 'break';
CONTINUE: 'continue';

ID: [a-zA-Z][a-zA-Z0-9_]*;

BLOCK_BEGIN: '{';
BLOCK_END: '}';
PAREN_BEGIN: '(';
PAREN_END: ')';
ARRAY_BEGIN: '[';
ARRAY_END: ']';

INC_RANGE: '..';
EXC_RANGE: '...';

NEWLINE: '\r'? '\n';
WHITESPACE: [ \t] -> skip;
