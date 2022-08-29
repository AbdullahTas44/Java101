/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sayitahminoyunu;

import com.sun.corba.se.impl.logging.OMGSystemException;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class SayiTahminOyunu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        int number = (int)(Math.random()*100);
        int hak=0;
        int sayi;
        
        while(hak<5){
            System.out.println("Lütfen sayıyı tahmin ediniz");
            sayi=input.nextInt();
            if (sayi == number){
                
                System.out.println("Tebrikler kazandınız ");
                break;
            }else{
                hak++;
                System.out.println("Yanlış bildiniz");
                if ( sayi < number){
                    System.out.println("Tahmininizi büyütünüz");
                }else {
                    System.out.println("Tahmininizi küçütünüz");
                }
            
                System.out.println("Kalan tahmin hakkınız : " + (5-hak));
                
            }
            
            
            
            
            
            
        }
             
        
        
        
        
        
        
        
        
        
        
    }
    
}
