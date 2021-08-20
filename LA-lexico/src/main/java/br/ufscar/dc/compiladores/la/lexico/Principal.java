/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufscar.dc.compiladores.la.lexico;

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author moleke
 */
public class Principal {
    public static void main(String args[]) throws IOException{
        CharStream cs = CharStreams.fromFileName(args[0]);
        LaLexer lex = new LaLexer(cs);
        
        while(lex.nextToken().getType() != Token.EOF){
            System.out.print("");
        }
    }
    
}
