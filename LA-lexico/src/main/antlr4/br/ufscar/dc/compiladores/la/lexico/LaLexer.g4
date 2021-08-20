lexer grammar LaLexer;

Letra: 'a'..'z'|'A'..'Z';
Digito: '0'..'9';
Variavel: Letra (Letra | Digito)*{ System.out.println("[Var,"+getText()+"]"); } ;