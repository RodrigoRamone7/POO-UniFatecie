/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inverterstring;

import java.util.Scanner;

/**
 *
 * @author Impressão
 */
public class InverterString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        String texto = teclado.nextLine();
        char[] invert = new char[texto.length()];
        
        for(int c=texto.length()-1; c>=0; c--){
            invert[c] = texto.charAt(c);
        }
        for (char l: invert){
            System.out.print(l);
    }
    }
    
}
