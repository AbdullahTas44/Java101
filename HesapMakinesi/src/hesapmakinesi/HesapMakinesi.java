/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hesapmakinesi;

import java.util.Scanner;
import javax.xml.transform.OutputKeys;
import jdk.nashorn.internal.objects.NativeRegExp;

/**
 *
 * @author DELL
 */
public class HesapMakinesi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("birinci sayıyı giriniz : ");
        int sayi1= input.nextInt();
         System.out.print("ikinci sayıyı giriniz : ");
        int sayi2=input.nextInt();
        input.nextLine();
        
        String ifade = "Lütfen yapacağınız işlemi seçiniz :\n"
                + "1. Toplama \n"
                + "2. Çıkarma \n"
                + "3. Çarpma \n"
                + "4. Bölme \n ";
        
        System.out.println(ifade);
        System.out.print("Seçiminiz : ");
        int secim = input.nextInt();
        
        
        
        switch (secim) {
            case 1:
                System.out.println("Toplama sonucu : " + (sayi1 + sayi2));
                break;
            
            case 2 : 
                
                System.out.println("Çıkarma sonucu :" + (sayi1-sayi2));
                
                break;
                
            case 3 : 
                System.out.println("Çarpma sonucu :" + (sayi1*sayi2));
                
                break;
            case 4 : 
                
                if (sayi2==0){
                    System.out.println("Bölen değerini0 girdiniz. Bu durumda bölme yapılamaz  ");
                    break;
                }else {
                
                System.out.println("Bölme sonucu :" + (sayi1/sayi2));
                
                break;
                }
                
             default: 
                 
                 System.out.println("Hatalı değer giriniz");
                
        
                
        }
        
 
    }
    
}
