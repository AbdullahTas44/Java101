/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ucedordetambolunenortalama;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class UceDordeTamBolunenOrtalama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Lütfen bir sayı giriniz : ");
        int sayi=input.nextInt();
        int toplam = 0,adet=0;
        double ort;
        
        for ( int i =1 ; i<=sayi ; i++){
            
            if ((i%3==0) && (i %4 ==0)){
                adet++;
                toplam+=sayi;
                System.out.println(i);
            }
            
            
        }
        
        
        ort = toplam / adet;
        System.out.print("sayıların toplamı : "  + toplam);
        System.out.println("");
        System.out.print("sayıların adedi : " + adet);
        System.out.println("");
        System.out.println("3 ve 4 bölünen sayıların ortalaması : " + ort);
        
        
        
    }
    
}
