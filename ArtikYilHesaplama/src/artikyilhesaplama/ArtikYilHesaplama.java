/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package artikyilhesaplama;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ArtikYilHesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl giriniz : ");
        int yil= input.nextInt();
        
        
        if (yil % 4 == 0 ){
            
            if (yil %100 == 0 ){
               
                if (yil % 400 == 0){
                    
                    System.out.println(yil + " bir artık yıldır ! ");
                }else{
                    System.out.println(yil + " bir artık yıl değildir ! ");
                }
            
            }else {
                
                 System.out.println(yil + " bir artık yıldır ! ");
                
            }
            
            
        } else {
            
             System.out.println(yil + " bir artık yıl değildir ! ");
            
            
        }
        
        
        
        
    }
    
}
