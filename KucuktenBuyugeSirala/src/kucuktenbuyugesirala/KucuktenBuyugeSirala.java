/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kucuktenbuyugesirala;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class KucuktenBuyugeSirala {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print(" Sayi 1 giriniz : ");
        int sayi1=input.nextInt();
        System.out.print(" Sayi 2 giriniz : ");
        int sayi2=input.nextInt();
        System.out.print(" Sayi 3 giriniz : ");
        int sayi3=input.nextInt();
  
        input.nextLine();
        
        if ((sayi1<sayi2) && (sayi1<sayi3)){
            if (sayi2<sayi3){
                
                System.out.println(" sayi1 < sayi2 < sayi3 ");
                
            }else{
                
                System.out.println(" sayi1 < sayi3 < sayi2 ");
               
            }
        }else if ((sayi2 < sayi1) && (sayi2<sayi3)){
            
            if (sayi1<sayi3){
                
                System.out.println(" sayi2 < sayi1 < sayi3 ");
            }else{
                
                 System.out.println(" sayi2 < sayi3 < sayi1 ");
                
            }
           
            
        }else if ((sayi3 < sayi1)&& (sayi3 < sayi2 )){
            if (sayi1<sayi2){
                
                System.out.println(" sayi3 < sayi1 < sayi2 ");
                
            }else {
                
                System.out.println(" sayi3 < sayi2 < sayi1 ");
            }
            
            
        }
        
        
        
        
    }
    
}
