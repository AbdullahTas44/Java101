/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package denemeler;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class NotHesaplamaPatika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        int mat,fizik,kimya,turkce,tarih,muzik;
        
        System.out.print("Matematik notunuz : ");
        mat=input.nextInt();
        
        System.out.print("Fizik notunuz : ");
        fizik=input.nextInt();
        
        System.out.print("Kimya notunuz : ");
        kimya=input.nextInt();
        
        System.out.print("Türkçe notunuz : ");
        turkce=input.nextInt();
        
        System.out.print("Tarih notunuz : ");
        tarih=input.nextInt();
        
        System.out.print("Müzik notunuz : ");
        muzik=input.nextInt();
        
        
        double sonuc = (mat+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println(sonuc);
        
        if (sonuc >= 60){
            
            System.out.println("geçtiniz");
        }
        
    }
    
}
