/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cinzodyaghesaplama;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class CinZodyagHesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum yılınızı girer misiniz :");
        int dogumyili= input.nextInt();
        String zodyag = " ";
        boolean IsError = true;
        
        int sonuc = dogumyili % 12;
        
        
        if ((dogumyili>=1900) && (dogumyili<=2050)){
            
      
        switch (sonuc){
            
            case 0 : 
                zodyag="Maymun";
                break;
            case 1 :
                zodyag="Horoz";
                break;
            case 2 :
                zodyag="Köpek";
                break;
            case 3 : 
                zodyag="Domuz";
                break;
            case 4 : 
                zodyag="Fare";
                break;
            case 5 : 
                zodyag="Öküz";
                break;
            case 6 : 
                zodyag="Kaplan";
                break;
            case 7 : 
                zodyag="Tavşan";
                break;
            case 8 :
                zodyag="Ejderha";
                break;
            case 9 :
                zodyag="Yılan";
                break;
            case 10 : 
                zodyag="At";
                break;
            case 11 : 
                zodyag="Koyun";
                break;
             
        }
        
        }else {
            
            IsError = false;
            
        }
        
        if (IsError){
            
            System.out.println("Çin Zodyağı Burcunuz : " + zodyag);
        }else{
            
            System.out.println("Hatalı giriş yaptınız. Doğum tarihini \"1915\" şeklinde giriniz");
        }
        
        
    }
    
}
