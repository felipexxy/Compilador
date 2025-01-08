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
TIPO: 'i8'|'i16'|'i32'|'i64'|'u8'|'u16'|'u32'|'u64'|'f32'|'f64'|'string'|'void';
IDENTIFICADOR: [a-zA-Z_][a-zA-Z_0-9]* ;
WHILE: 'while';
WS: [ \t\r\n]+ -> skip;  // Ignorar espaços em branco

ESC: '\\' . ;

// Regras Sintáticas
prog:   stmt+ EOF;  // Adiciona EOF ao final do programa

stmt:   varDecl
    |   funcDecl
    |   exprStmt
    |   ifStmt
    |   whileStmt
    |   forStmt
    |   returnStmt
    ;

varDecl: TIPO IDENTIFICADOR ('=' expr)? ';' 
        | TIPO IDENTIFICADOR ABRE_COLCHETE NUMERO FECHA_COLCHETE PONTO_E_VIRGULA;

funcDecl: FUNCAO IDENTIFICADOR ABRE_PARENTESE (IDENTIFICADOR (VIRGULA IDENTIFICADOR)*)? FECHA_PARENTESE SETA TIPO ABRE_CHAVE stmt* FECHA_CHAVE;
exprStmt: expr PONTO_E_VIRGULA ;
ifStmt: IF ABRE_PARENTESE expr FECHA_PARENTESE stmt (elseIfStmt)* (elseStmt)?;
elseIfStmt: ELSE IF ABRE_PARENTESE expr FECHA_PARENTESE stmt; 
elseStmt: ELSE stmt;
whileStmt: WHILE ABRE_PARENTESE expr FECHA_PARENTESE stmt ;
forStmt: FOR IDENTIFICADOR IN NUMERO PONTO_PONTO NUMERO ABRE_CHAVE stmt* FECHA_CHAVE;
returnStmt: RETURN expr? PONTO_E_VIRGULA ;
assignStmt: IDENTIFICADOR ATRIBUICAO expr PONTO_E_VIRGULA
            | IDENTIFICADOR ABRE_COLCHETE expr FECHA_COLCHETE ATRIBUICAO expr PONTO_E_VIRGULA;

expr:   expr (MAIS | MENOS) expr
    |   expr (ASTERISCO | BARRA) expr
    |   expr IGUAL expr 
    |   NUMERO
    |   STRING
    |   CHAR
    |   IDENTIFICADOR
    | IDENTIFICADOR ABRE_COLCHETE expr FECHA_COLCHETE
    ;
