/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kdvprogram;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class KdvProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Bedeli giriniz");
        double deger= input.nextDouble();
        input.nextLine();
  
        double sonuc;
        double kdv;
        
        if (deger<=1000){    
            kdv=0.18;
            sonuc= deger +(deger*kdv);
            }else {
            
            kdv=0.08;
            sonuc= deger +(deger*kdv);
            
                   }
        
        
        System.out.println("KDV'siz Fiyat = " + deger);
        System.out.println("KDV'li Fiyat = " + sonuc);
        System.out.println("KDV = " + sonuc);
        
        
        
    }
    
}
