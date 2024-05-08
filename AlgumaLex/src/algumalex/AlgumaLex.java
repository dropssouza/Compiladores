/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algumalex;

/**
 *
 * @author mbern
 */
public class AlgumaLex {

   public static void main(String[] args) {
        AlgumaLexico lex = new AlgumaLexico(args[0]);
        Token t = null;
        while((t=lex.proximoToken()).nome != TipoToken.Fim) {
            System.out.println(t);
        }
    }
    
}
