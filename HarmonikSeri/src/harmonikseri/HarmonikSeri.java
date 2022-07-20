/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package harmonikseri;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class HarmonikSeri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
    
        System.out.print("Bir sayı giriniz : ");
        int sayi = input.nextInt();
        
        double toplam=0;
        
        
        for (int i =1 ; i<=sayi ; i++){
            
            toplam = toplam +(1.0/i);
            
        }
  
        System.out.println("Harmonik Seri : " + toplam);
        
    
    }
    
}
