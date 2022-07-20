/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dordunbesinkuvvetleribulma;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class DordunBesinKuvvetleriBulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        int sayi = input.nextInt();
        
        int dongu1=4;
        int dongu2=5;
        
        
        while (dongu1<sayi){
            
            System.out.println("4 sayısının katları : " + dongu1);
            dongu1=dongu1*dongu1;
          
        }
        
        while (dongu2<sayi){
            
            System.out.println("5 sayısının katları : " + dongu2);
            dongu2=dongu2*dongu2;
            
        }
        
        
        
        
    }
    
}
