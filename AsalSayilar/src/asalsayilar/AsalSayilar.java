/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asalsayilar;

/**
 *
 * @author DELL
 */
public class AsalSayilar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int asal;
        
        System.out.println("");
        for(int i =2 ; i <= 100 ; i++){
            asal=0;
            for (int j =2 ; j < i ; j++){
                
                if (i % j ==0){
                    
                    asal = 1; 
      
                }
            }
            
            if (asal==0){
                
                System.out.print(i + " ");
                
            }
        }
        
    }
    
}
