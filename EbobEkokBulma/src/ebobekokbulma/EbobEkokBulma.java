/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ebobekokbulma;

import java.awt.print.Book;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class EbobEkokBulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Birinci Sayıyı Giriniz :");
        int num1=input.nextInt();
        System.out.print("Lütfen İkinci Sayıyı Giriniz :");
        int num2=input.nextInt();
        
        int sayac=1,ebob=0,carpim,ekok=0;
       
        while (sayac<num1){
           
            if ( num1 % sayac == 0 && num2 % sayac == 0){
                
                ebob=sayac;
                
            }
            sayac++;
            
        }
        
        if (ebob==0){
            System.out.println("Girdiğiniz sayıların EBOB'u yoktur.");
        }else{
            
             System.out.println("En büyük ortak bölen EBOB : " + ebob);
             
        }
      
        boolean durum= true;
        sayac=1;
        while (durum){
          
          carpim=num1*sayac;
        
          if ((carpim%num1 ==0 ) && (carpim%num2 == 0 )){
            
              ekok=carpim;
              durum=false;
              
          }
         
         
         sayac++;
            
        }
       
       
        System.out.println("En küçük ortak katları EKOK : " + ekok);
            
     
     
        System.out.println("Formül ile ekok : " + (num1*num2)/ebob);
        
        
    }
    
}
