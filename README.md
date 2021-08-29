# La-Lexico
Analisador léxico para a [linguagem LA (Linguagem Algorítmica)](https://docs.google.com/document/d/1ZuFtrLSeC-Fkh24oacKs5KBibHp_27CrFnQISZwHR2c/edit).

## Autores

Roseval Donisete Malaquias Junior - 758597</br>
Nathan Celestino de Oliveira - 758601</br>
Yuri Gabriel Aragão da Silva - 758608

## Sobre o trabalho

Este trabalho foi desenvolvido através da linguagem Java utilizando a API fornecida pela biblioteca ANTLR4 (ANother Tool for Language Recognition),
com o propósito de efetuar uma análise léxica na linguagem LA (Linguagem Algorítmica) elaborada pelo professor Jander Moreira. O desenvolvimento deste trabalho
baseou-se nas aulas disponibilizadas pelo professor Daniel Lucrédio durante o período letivo ENPE 3.

## Dependências

Este projeto possui as seguintes dependências principais:

- maven-assembly-plugin - Versão 3.3.0
- antlr4 - Versão 4.7.2

As dependências encontram-se no arquivo pom.xml 

## Especificações do OpenJDK

Openjdk 11.0.11 2021-04-20
OpenJDK Runtime Environment
OpenJDK 64-Bit Server VM

## Execução do analisador léxico

Primeiramente é recomendado instalar a IDE NetBeans 12.4, efetuar o comando build & clean.

Após isso, será gerado um arquivo La-Lexico/LA-lexico/target/LA-lexico-1.0-SNAPSHOT-jar-with-dependencies.jar
que será utilizado para efetuar a execução do projeto.

Para efetuar a execução, utiliza-se o seguinte comando:

```
java -jar La-Lexico/LA-lexico/target/LA-lexico-1.0-SNAPSHOT-jar-with-dependencies.jar [Arquivo de entrada] [Arquivo de saída]
```

Esse comando considera o caminho relativo do projeto e pressupõe que o java já esteja instalado em seu computador com as
versões de OpenJDK especificadas anteriormente.

Os arquivos de entrada e arquivos de saída foram disponibilizados através da plataforma Google Classroom, os quais
servirão como casos de testes para a corretude do projeto.
