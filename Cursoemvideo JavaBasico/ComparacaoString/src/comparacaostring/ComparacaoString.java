/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacaostring;

/**
 *
 * @author Impressão
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String n1 = "Rodrigo";
        String n2 = "Rodrigo";
        String n3 = new String("Rodrigo");
        Boolean res;
        res = (n1.equals(n3)) ? true : false ;
        System.out.println(res);
        System.out.println(n3);
    }
    
}
