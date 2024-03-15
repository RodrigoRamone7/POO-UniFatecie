/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thistest;

/**
 *
 * @author Impressão
 */
public class ThisTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SimpleTime time = new SimpleTime(15, 30, 19);
        System.out.println(time.buildString());
    }
    
}

class SimpleTime{
    private int hour;
    private int minute;
    private int second;
    
    public SimpleTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public String buildString(){
        return String.format("%24s: %s%n%24s: %s",
                "this.toUniversalString()", this.toUniversalString(),
                "toUniversalString()", toUniversalString());
    }
    
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }
}
        
