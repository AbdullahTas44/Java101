/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ıkıdortkatlaribulma;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class IkıDortKatlariBulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
    
        Scanner input = new Scanner(System.in);
        int sayi;
        int toplam=0;
        
        
        do {  
        
            System.out.print("Sayınızı giriniz :");
            sayi = input.nextInt();
            
            if (sayi%4==0){
                
                toplam+=sayi;
                
            }
        
            
            
        } while (sayi%2==0);
        
        
        System.out.println("Girdiğiniz sayıların 2 ve 4 e bölünen toplamı : " + toplam);
        
    }
    
}
