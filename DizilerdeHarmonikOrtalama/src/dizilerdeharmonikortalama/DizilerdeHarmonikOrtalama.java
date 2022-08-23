/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dizilerdeharmonikortalama;

/**
 *
 * @author DELL
 */
public class DizilerdeHarmonikOrtalama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] numbers = {1,2,3,4,5};
        
        double avarage=0;
        
        
        for ( int i : numbers){
            
            avarage+=1.0/i;
            
            
        }
        
        System.out.println("Harmonik ortalama : " + avarage);
        
    }
    
}
