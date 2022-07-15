/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sinifigecmedurumu;

import java.util.Scanner;
import javax.sound.midi.Soundbank;

/**
 *
 * @author DELL
 */
public class SinifiGecmeDurumu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int Matematik,Fizik,Turkce,Kimya,Muzik;
        int bolen=0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Matematik notunuzu giriniz :");
        Matematik=input.nextInt();
        
        System.out.print("Fizik notunuzu giriniz :");
        Fizik=input.nextInt();
        
        System.out.print("Turkce notunuzu giriniz :");
        Turkce=input.nextInt();
        
        System.out.print("Kimya notunuzu giriniz :");
        Kimya=input.nextInt();
        
        System.out.print("Müzik notunuzu giriniz :");
        Muzik=input.nextInt();
        input.nextLine();
        
       
        if (Matematik>=0 && Matematik<=100){
            
            bolen++;
            
        }else{
            
            System.out.println("Girdiğiniz Matematik notunuz 0 ile 100 arasında değil ortalamaya bu ders dahil olmayacak");
        }
         if (Fizik>=0 && Fizik<=100){
            
            bolen++;
            
        }else{
            
            System.out.println("Girdiğiniz Fizik notunuz 0 ile 100 arasında değil ortalamaya bu ders dahil olmayacak");
        }
          if (Kimya>=0 && Kimya<=100){
            
            bolen++;
            
        }else{
            
            System.out.println("Girdiğiniz Kimya notunuz 0 ile 100 arasında değil ortalamaya bu ders dahil olmayacak");
        }
           if (Turkce>=0 && Turkce<=100){
            
            bolen++;
            
        }else{
            
            System.out.println("Girdiğiniz Türkçe notunuz 0 ile 100 arasında değil ortalamaya bu ders dahil olmayacak");
        }
            if (Muzik>=0 && Muzik<=100){
            
            bolen++;
            
        }else{
            
            System.out.println("Girdiğiniz Müzik notunuz 0 ile 100 arasında değil ortalamaya bu ders dahil olmayacak");
        }
            
        double Toplam = Matematik + Fizik + Turkce + Kimya + Muzik;
        
        double Ortalama = Toplam / bolen ;
        if (Ortalama > 55 ){
            
            System.out.println("Tebrikler sınıfı geçtiniz...");
        }else{
            
            System.out.println("Ne yazık ki sınıfta kaldınız...");
            System.out.println("Seneye tekrar görüşmek üzere");
        }
        
        
        System.out.println("Ortalamanız : " + Ortalama);
       
        
        
    }
    
}
