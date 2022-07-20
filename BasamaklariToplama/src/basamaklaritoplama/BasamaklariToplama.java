/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basamaklaritoplama;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class BasamaklariToplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        
        Scanner input = new Scanner(System.in);
    
        System.out.print("Bir sayı giriniz : ");
        int sayi = input.nextInt();
        input.nextLine();
        int basamak;
        int toplam=0;
        
        while(sayi>0){
            
            basamak = sayi%10;
            sayi=sayi/10;
            toplam+=basamak;
            
            
            
        }
        
        System.out.println("Basamak toplamları : " + toplam);
        
    
    }
    
}
