/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufscar.dc.compiladores.la.lexico;

import java.io.FileWriter;
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
        FileWriter myWriter = new FileWriter(args[1]);
        
        Token t = null;

        while(Token.EOF != (t = lex.nextToken()).getType()){

            if(t.getType() == 1 | (t.getType() >= 8 && t.getType() <= 14))
                myWriter.write("<'"+t.getText()+"','"+t.getText()+"'>\n");
            else
                myWriter.write("<'"+t.getText()+"',"+LaLexer.VOCABULARY.getDisplayName(t.getType())+">\n");
        }
        myWriter.close();
    }
    
}
