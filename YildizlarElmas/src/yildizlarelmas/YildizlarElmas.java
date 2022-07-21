/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package yildizlarelmas;

/**
 *
 * @author DELL
 */
public class YildizlarElmas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("BAŞLIYORUZ ");
        
        // düz üçgen yapma 
        for (int i = 1; i <=6 ;i ++){
            for (int j = 1 ; j<=(6-i) ; j++){
                
                System.out.print(" ");
               
            }
             for (int t =1 ; t<=(2*i)-1 ; t++){
                    
                    System.out.print("*");
                }
            
            System.out.println("");
        
        
    }
        // ters üçgen yapma 
        
        for (int i =5 ; i >=0; i--){
            for (int j=(5-i) ; j>=0 ; j--){
                
                System.out.print(" ");
                
            }
            
            for (int t = (2*i)-1; t>=1 ; t--){
                
                
                System.out.print("*");
            }
            
            System.out.println("");
            
        }
        
        
        
        
        
    }
    
}
