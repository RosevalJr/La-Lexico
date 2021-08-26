lexer grammar LaLexer;

PALAVRA_CHAVE: 'algoritmo' | 'declare' | 'literal' | 'inteiro' | 'fim_algoritmo' | 'leia' | 'escreva' | 'real' | 'e' | 'ou' | 'nao' | 'logico' | 'se' | 'senao' | 'fim_se' | 'entao' | 'caso' | 'seja' | '..' | 'fim_caso' | 'para' | 'faca' | 'ate' | 'fim_se' | 'fim_para' | 'enquanto' | 'fim_enquanto';

NUM_INT: ('+'|'-')?('0'..'9')+;

NUM_REAL: ('+'|'-')?('0'..'9')+ '.' ('0'..'9')+;

IDENT: ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z'|'0'..'9')*;

CADEIA: '"' (ESC_SEQ | ~('"' | '\\') )* '"';

fragment
ESC_SEQ: '\\"';

COMENTARIO: '{' ~('}')* '}' -> skip;

WS: (' ' | '\t' | '\r' | '\n' ) -> skip;

OP_REL: '>' | '>=' | '<' | '<=' | '<>' | '=';

OP_ARIT: '+' | '-' | '*' | '/';

DELIM: ':';

ATRIB: '<-';

VIRGU: ',';

ABREPAR: '(';

FECHAPAR: ')';