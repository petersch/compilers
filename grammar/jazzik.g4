grammar jazzik;

init: (NEWLINE* funcdef)* ;

statement: 
    assignment                                         # AssignNope
    | 'write' (expression|cond|STRING) (',' (expression|cond|STRING))*    # WriteInt
    | 'read' varaccess (',' varaccess)*                # Read
    | forstatement                                     # For
    | ifstatement                                      # If
    |                                                  # Nop
    | 'return' expression                              # ReturnInt
    | 'return' cond                                    # ReturnBool
    | 'return'                                         # ReturnVoid
    | 'break'                                          # Break
    | 'continue'                                       # Continue
    | expression                                       # Expr
    ;
     
assignment:
    'int' (ID | ID '=' expression) (',' ID | ',' ID '=' expression)*  # IntVarDecl
    | 'bool' (ID | ID '=' cond) (',' ID | ',' ID '=' cond)*  # BoolVarDecl
    | 'int' ID '[' expression ']'                       # ArrayDecl
    | lvalue '=' expression                            # AssignInt
    | lvalue '=' cond                            # AssignBool
    ;

lvalue:
    ID
    | ID '[' expression ']'
    ;

expression:
    op=('+'|'++'|'-'|'--') expression                             # Una
    | expression op=('/'|'*'|'%') expression            # Mul
    | expression op=('&'|'|'|'^') expression            # Bin
    | expression op=('+'|'-') expression                # Add
    | '(' expression ')'                                # Par
    | ID '(' (expression (',' expression)*)? ')'        # FuncCall
    | INT                                               # IntConstant
    | varaccess     																		# Vars
    ;

varaccess:
    ID                                                  # VarAccess
    | ID '[' expression ']'                             # ArrayAccess   
    ;
     
funcdef:
    ('void'|'int'|'bool') ID '(' funcargdef? (',' funcargdef)* ')' block
    | 'extern' ('void'|'int'|'bool') ID '(' funcargdef? (',' funcargdef)* ')'
    ;

funcargdef:
    ('int'|'int[]'|'bool') ID
    ;
    
ifstatement:
    'if' cond block
    | 'if' cond block 'else' block
    | 'unless' cond block
    | 'unless' cond block 'else' block
    ;
    
forstatement:
    'for' ID 'in' range block
    | 'while' cond block
    ;
    
range:
    expression rtype=('..'|'...') expression
    ;
    
cond:
    expression op=('=='|'!='|'>'|'<'|'>='|'<=') expression
    | cond op=('=='|'!='|'&&'|'||') cond
    | '!' cond
    | '(' cond ')'
    | BOOL
    | ID
    ;
    
block:
    NEWLINE* '{' NEWLINE* statement (NEWLINE+ statement)* NEWLINE* '}' NEWLINE*
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

BOOL_TYPE: 'bool';
INT_TYPE: 'int';
ARRAY_TYPE: 'int[]';
VOID_TYPE: 'void';

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
