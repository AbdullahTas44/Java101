/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mukemmelsayi;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class MukemmelSayi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        int sayi = input.nextInt();
        input.nextLine();
        int toplam=0;
        
        for(int i = 1; i<sayi ; i++){
            
            if (sayi%i==0){
                
                toplam+=i;
                
                
            }
            
        }
        
        
        if (toplam==sayi){
            
            System.out.println("Girdiğiniz sayı mükemmel sayıdır.");
            
        }else {
            
            
            System.out.println("Girdiğiniz sayı mükemmel değildir.");
        }
        
        
        
        
    }
    
}
