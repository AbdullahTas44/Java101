/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tersucgen;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class TersUcgen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen basamak sayısını giriniz : ");
        int basamak=input.nextInt();
        input.nextLine();
        
        System.out.println("");
        System.out.println("");
        
     for (int i =basamak ; i >=0; i--){
            for (int j=(basamak-i) ; j>=0 ; j--){
                
                System.out.print(" ");
                
            }
            
            for (int t = (2*i)-1; t>=1 ; t--){
                
                
                System.out.print("*");
            }
            
            System.out.println("");
            
        }
    
    
    
    }
    
}
