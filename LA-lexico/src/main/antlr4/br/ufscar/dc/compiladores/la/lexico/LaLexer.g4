/*
Nesse arquivo, definimos a gramática da Linguagem Algoritmica (LA) criada pelo 
professor Jander Moreira, DC - UFSCar.
*/

lexer grammar LaLexer;

/* 
Aqui sao definidas as palavras chaves da LA, elas sao posicionadas no ínicio para
nao termos problemas com a abordagem gulosa do analisador. Essas palavras sao
reservadas para uma tarefa especifica dentro da linguagem.
*/ 
PALAVRA_CHAVE: 'algoritmo' | 'declare' | 'literal' | 'inteiro' | 'fim_algoritmo' |
 'leia' | 'escreva' | 'real' | 'e' | 'ou' | 'nao' | 'logico' | 'se' | 'senao' |
 'fim_se' | 'entao' | 'caso' | 'seja' | '..' | 'fim_caso' | 'para' | 'faca' |
 'ate' | 'fim_para' | 'enquanto' | 'fim_enquanto' | 'registro' | 'fim_registro' |
 'tipo' | 'procedimento' | 'var' | 'fim_procedimento' | 'retorne' | 'fim_funcao' |
 'funcao' | 'constante' |'falso' | 'verdadeiro';

// Definicao dos numeros, o sinal eh analisado separadamente
NUM_INT: ('0'..'9')+;

NUM_REAL: ('0'..'9')+ '.' ('0'..'9')+;

// Nome das variaveis
IDENT: ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z'|'0'..'9' | '_')*;

/* Cadeia de caracteres, eh tudo aquilo entre dentre aspas, exceto por quebra 
de linha, \r e a própria aspas */
CADEIA: '"' (~('\n' | '\r' | '"'))* '"';


// Comentario eh tudo aquilo dentre chaves, com exceçoes analogas as da CADEIA.
// Todo COMENTARIO sera ignorado (função do -> skip)
COMENTARIO: '{' (~('}' | '\n' | '\r'))* '}' -> skip;

// Ignorando whitespaces (espaco, quebra de linha, tab, \r)
WS: (' ' | '\t' | '\r' | '\n' ) -> skip;

// Operacoes aritmeticas (soma, subtracao, multiplicacao, divisao e resto de div.)
OP_ARIT: '+' | '-' | '*' | '/' | '%';

// Operacoes relacionais (maior, maior igual, menor, menor igual, diferente, igual)
OP_REL: '>' | '>=' | '<' | '<=' | '<>' | '=';


OP_PON: '^' | '&' | '.' | '[' | ']';

// O delimitador (:) eh utilizado para definir o tipo das variaveis
DELIM: ':';

// Usado para atribuir os valores das variaveis
ATRIB: '<-';

// Virgula
VIRGU: ',';

// Abre arenteses
ABREPAR: '(';

// Fecha parenteses
FECHAPAR: ')';