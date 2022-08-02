/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asalsayiprogram;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class AsalSayiProgram {

    /**
     * @param args the command line arguments
     */
    
    static boolean isAsal(int num){
        
        boolean durum=true;
        
        for ( int i = 2 ; i<num ; i++){
            
            if (num % i == 0 ){
                durum = false;
                
            }
            
            
        }
        
        
        return durum;
        
        
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen sayıyı giriniz : ");
        int num = input.nextInt();
        
        if (isAsal(num)){
            System.out.println("Sayınız asaldır.");
        }else {
            System.out.println("Sayınız asal değildir.");
        }
        
        
        
    }
    
}
