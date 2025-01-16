grammar Gramatica;

// Regras Léxicas
MAIS: '+';
SETA: '->';
MENOS: '-';
ASTERISCO: '*';
BARRA: '/';
BARRA_INVERTIDA: '\\';
ABRE_PARENTESE: '(';
FECHA_PARENTESE: ')';
ABRE_COLCHETE: '[';
FECHA_COLCHETE: ']';
ABRE_CHAVE: '{';
FECHA_CHAVE: '}';
E_LOGICO: '&&';
E_BINARIO: '&';
OU_LOGICO: '||';
OU_BINARIO: '|';
PONTO_PONTO: '..';
PONTO: '.';
VIRGULA: ',';
PONTO_E_VIRGULA: ';';
DOIS_PONTOS: ':';
PORCENTO: '%';
MAIOR: '>';
MENOR: '<';
IGUAL: '==';
ATRIBUICAO: '=';
EXCLAMACAO: '!';
NUMERO: [0-9]+ ('.' [0-9]+)?;
COMENTARIO: '//' ~[\r\n]* -> skip;
COMENTARIO_BLOCO: '/*' .*? '*/' -> skip;
STRING: '"' (ESC | ~["\\])* '"';
CHAR: '\'' (ESC | ~[\\']) '\''; // Correção aqui
BOOLEANO: 'true' | 'false';
MAIN: 'main';
FOR: 'for';
IN: 'in';
FUNCAO: 'fn';
RETURN: 'return';
IF: 'if';
ELSE: 'else';
STRUCT: 'struct';
TIPO:
	'i8'
	| 'i16'
	| 'i32'
	| 'i64'
	| 'u8'
	| 'u16'
	| 'u32'
	| 'u64'
	| 'f32'
	| 'f64'
	| 'string';
WHILE: 'while';
DISPLAY: 'display';
INPUT: 'input';
VOID: 'void';
IDENTIFICADOR: [a-zA-Z_][a-zA-Z_0-9]*;
WS: [ \t\r\n]+ -> skip; // Ignorar espaços em branco

ESC: '\\' .;

// Regras Sintáticas
prog: mainFunc stmt* EOF;

stmt:
	varDecl
	| funcDecl
	| exprStmt
	| ifStmt
	| whileStmt
	| printStmt
	| scanStmt
	| forStmt
	| returnStmt
	| assignStmt ; // Adicionado assignStmt

mainFunc:
	FUNCAO MAIN ABRE_PARENTESE FECHA_PARENTESE SETA VOID ABRE_CHAVE stmt* FECHA_CHAVE;

varDecl:
	TIPO IDENTIFICADOR ('=' expr)? PONTO_E_VIRGULA
	| TIPO IDENTIFICADOR ABRE_COLCHETE NUMERO FECHA_COLCHETE PONTO_E_VIRGULA;

funcDecl:
	FUNCAO IDENTIFICADOR ABRE_PARENTESE (
		paramDecl (VIRGULA paramDecl)*
	)? FECHA_PARENTESE SETA (TIPO | VOID) ABRE_CHAVE stmt* FECHA_CHAVE;

paramDecl: TIPO IDENTIFICADOR;

exprStmt: expr PONTO_E_VIRGULA;

ifStmt:
	IF ABRE_PARENTESE expr FECHA_PARENTESE ABRE_CHAVE stmt* FECHA_CHAVE (
		elseIfStmt
	)* (elseStmt)?;

elseIfStmt:
	ELSE IF ABRE_PARENTESE expr FECHA_PARENTESE ABRE_CHAVE stmt* FECHA_CHAVE;

elseStmt: ELSE ABRE_CHAVE stmt* FECHA_CHAVE;

whileStmt:
	WHILE ABRE_PARENTESE expr FECHA_PARENTESE ABRE_CHAVE stmt* FECHA_CHAVE;

forStmt:
	FOR IDENTIFICADOR IN NUMERO PONTO_PONTO NUMERO ABRE_CHAVE stmt* FECHA_CHAVE;

returnStmt: RETURN expr? PONTO_E_VIRGULA;

assignStmt:
	IDENTIFICADOR ATRIBUICAO expr PONTO_E_VIRGULA
	| IDENTIFICADOR ABRE_COLCHETE expr FECHA_COLCHETE ATRIBUICAO expr PONTO_E_VIRGULA;

printStmt:
	DISPLAY ABRE_PARENTESE expr (VIRGULA expr)* FECHA_PARENTESE PONTO_E_VIRGULA;

scanStmt:
	INPUT ABRE_PARENTESE expr (VIRGULA expr)* FECHA_PARENTESE PONTO_E_VIRGULA;

expr:
	expr (MAIS | MENOS) expr
	| expr (ASTERISCO | BARRA | PORCENTO) expr
	| expr IGUAL expr
	| expr (MAIOR | MENOR | MAIOR IGUAL | MENOR IGUAL) expr
	| ABRE_PARENTESE expr FECHA_PARENTESE
	| NUMERO
	| STRING
	| CHAR
	| BOOLEANO
	| IDENTIFICADOR
	| IDENTIFICADOR ABRE_COLCHETE expr FECHA_COLCHETE
	| DISPLAY ABRE_PARENTESE expr FECHA_PARENTESE
	| IDENTIFICADOR ABRE_PARENTESE (expr (VIRGULA expr)*)? FECHA_PARENTESE
	| assignStmt;