lexer grammar LaLexer;

PALAVRA_CHAVE: 'algoritmo' | 'declare' | 'literal' | 'inteiro' | 'fim_algoritmo' | ':' | ',' | '(' | ')' | 'leia' | 'escreva';

NUMINT: ('+'|'-')?('0'..'9')+;

NUMREAL: ('+'|'-')?('0'..'9')+ '.' ('0'..'9')+;

IDENT: ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z'|'0'..'9')+;

CADEIA: '\'' (ESC_SEQ | ~('\'' | '\\') )* '\'';

fragment
ESC_SEQ: '\\\'';

COMENTARIO: '{' ~('}')* '}' -> skip;

WS: (' ' | '\t' | '\r' | '\n' ) -> skip;
 