/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ucakbiletifiyatıhesaplama;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class UcakBiletiFiyatıHesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double ucret =0.10;
        double toplam =0.0;
        double indirim =0.0;
        
        
        System.out.print("Lütfen KM bilgisi giriniz : ");
        int km = input.nextInt();
        System.out.print("Lütfen Yaşınızı giriniz : ");
        int yas = input.nextInt();
        System.out.print("Lütfen bilet türünü giriniz (tek yön:1 - gidiş dönüş:2) : ");
        int tip = input.nextInt();
        input.nextLine();
        
        toplam = km*ucret;
        
       
        
        if ((km<=0)||(yas<=0)||(tip<1)||(tip>2)){
            
            System.out.println("Hatalı veri girişi yaptınız...");
        
        }else{
            
             
            System.out.println("Normal ücretiniz : " + toplam);
             
            if ( yas < 12){
            
            indirim = toplam * 0.50;
            toplam -=indirim;
            
            System.out.println("Yaş indirimli ücretiniz : " + toplam);
            
        }else if((yas>=12) && (yas<=24)){
            
            indirim = toplam * 0.10;
            toplam -=indirim;
            System.out.println("Yaş indirimli ücretiniz : " + toplam);
            
                
        }else if (yas>65){
            
            indirim = toplam * 0.30;
            toplam -=indirim;
            System.out.println("Yaş indirimli ücretiniz : " + toplam);
            
        }
  
        if (tip==2){
            
            indirim = toplam * 0.20;
            toplam -=indirim;
            System.out.println("Gidiş dönüş indirimli ücretiniz : " + (toplam*2) + " TL. ");
            
        }
            
        }
    
    
    }
    
}
