/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enkucukenbuyuksayibulma;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class EnKucukEnBuyukSayiBulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Kaç adet sayı gireceksiniz : ");
        int adet = input.nextInt();
        input.nextLine();
        int sayi,enbuyuk=0,enkucuk=0;
        
      
        
        if (adet==1){
            
        
            System.out.print("Lütfen 1. sayıyı giriniz : ");
            sayi=input.nextInt();
            input.nextLine();
        
            enbuyuk=sayi;
            enkucuk=sayi;
        }else{
           
            for ( int i =1 ; i<=adet ; i++){

             System.out.print("Lütfen " + i +". sayıyı giriniz : ");
             sayi = input.nextInt();
             input.nextLine();
            
             if ( i==1){
                 enbuyuk=sayi;
                 enkucuk=sayi;
                 
             }
             
             
             if (sayi>enbuyuk){
                enbuyuk=sayi;
            }
            
             if (sayi<enkucuk){
                enkucuk=sayi;
            }
            
           
             

            }
        }
        
        System.out.println("Girdiğiniz en büyük sayi : " + enbuyuk);
        System.out.println("Girdiğiniz en küçük sayi : " + enkucuk);
        
        
    }
    
}
