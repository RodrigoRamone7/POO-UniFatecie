/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Impressão
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, soma = 0, totalValores = 0, totalPares = 0, totalImpares = 0, acima100 = 0, media = 0;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um Número:<br><i>(Valor 0 interrompe)</i></html>"));
            soma += n;
            int verifica = n%2;
            
            if(n > 0){
                totalValores++;
            }
            
            if(verifica == 0 && n > 0){
                totalPares++;
            } else if (verifica != 0 && n > 0){
                totalImpares++;
            }
            
            if(n > 100){
                acima100++;
            }
        } while (n != 0);
        media = soma/totalValores;
        
        JOptionPane.showMessageDialog(null,
                "<html>Resultado final <hr>"
                + "Somatório vale: " + soma + "<br>"
                + "Total de valores: " + totalValores + "<br>"
                + "Total pares: " + totalPares + "<br>"
                + "Total ímpares: " + totalImpares + "<br>"
                + "Acima de 100: " + acima100 + "<br>"
                + "Média dos valores: " + media + "<br></html>"
        );

    }
    
}

            