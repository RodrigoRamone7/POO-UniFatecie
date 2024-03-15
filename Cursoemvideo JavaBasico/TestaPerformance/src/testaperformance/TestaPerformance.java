/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testaperformance;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Impressão
 */
public class TestaPerformance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Iniciando...");
        long inicio = System.currentTimeMillis();
        //Collection<Integer> teste = new ArrayList<>();
        Collection<Integer> teste = new HashSet<>();
        
        int total = 200000;
        
        for (int i = 0; i < total; i++){
            teste.add(i);
        }
        
        for (int i = 0; i < total; i++){
            teste.contains(i);
        }
        
        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo gasto: " + tempo);
    }
    
}
