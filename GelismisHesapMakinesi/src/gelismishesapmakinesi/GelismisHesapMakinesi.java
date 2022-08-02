/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gelismishesapmakinesi;

import java.util.Scanner;
import jdk.nashorn.internal.objects.NativeRegExp;
import jdk.nashorn.internal.parser.TokenType;
import jdk.nashorn.tools.ShellFunctions;

/**
 *
 * @author DELL
 */
public class GelismisHesapMakinesi {

    static void toplama(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("lütfen toplamak istediğiniz sayı adedini giriniz : ");
        int n = input.nextInt();
        int sayi,toplam=0;
        
        for (int i =1 ; i<=n ; i++){
            System.out.print("lütfen " + i + ". sayıyı giriniz : ");
            sayi=input.nextInt();
            toplam+=sayi;
  
        }
        
        System.out.println("Giriş yaptığınız sayıların toplamı : " + toplam);
        
        
    }
    
    static void cıkarma(){
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen 1. sayıyı giriniz : ");
        int num1= input.nextInt();
        System.out.print("Lütfen 2. sayıyı giriniz : ");
        int num2= input.nextInt();
        
        System.out.println("Çıkarma işlem sonucunuz : " + (num1-num2));
    }
    
    static void carpma(){
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen 1. sayıyı giriniz : ");
        int num1= input.nextInt();
        System.out.print("Lütfen 2. sayıyı giriniz : ");
        int num2= input.nextInt();
      
        System.out.println("Çarpma işleminin sonucu : " + (num1*num2));
        
        
    }
    
    static void bolme(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Lütfen 1. sayıyı giriniz : ");
        int num1= input.nextInt();
        System.out.print("Lütfen 2. sayıyı giriniz : ");
        int num2= input.nextInt();
        
        double result = num1/num2;
        System.out.println("Bölme işleminizin sonucu : " + result);
    }
    
    
    static void uslu(){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Lütfen taban sayınızı giriniz : ");
        int num1= input.nextInt();
        System.out.print("Lütfen üs sayınızı giriniz : ");
        int num2= input.nextInt();
        
        double sonuc = Math.pow(num1, num2);
        
        System.out.println("Üs alma işlem sonucunuz : " + sonuc);
        
    }
    
    static void faktoriyel(){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Lütfen faktöriyelini istediğiniz sayıyı giriniz : ");
        int num= input.nextInt();
        int result=1;
        for (int i =1 ; i<=num ; i++){
            
            result*=i;
            
            
        }
        
        System.out.println("Faktöriyel sonucunuz : " + result);
        
        
        
    }
    
    
    static void mod(){
       
        Scanner input = new Scanner(System.in);
        
        System.out.print("Lütfen mod alınacak sayıyı giriniz : ");
        int num1= input.nextInt();
        System.out.print("Lütfen kaçlık mod almak istediğinizi yazınız");
        int num2= input.nextInt();
        
        System.out.println("mod alma sonucunuz : " + (num1%num2));
        
        
    }
    
    static void dikdortgen(){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Dikdörtgen uzun kenarını giriniz : ");
        int a= input.nextInt();
        System.out.print("Dikdörtgen kısa kenarını giriniz : ");
        int b= input.nextInt();
        
        System.out.println("Dikdörtgenin cevresi : " + 2*(a+b));
        System.out.println("Dikdörtgenin alanı : " + (a*b));    
        
    }
    
    
    public static void main(String[] args) {
      
  
    Scanner input = new Scanner(System.in);
    int select;
    String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
    boolean durum=true;
    
    while (durum){
        
        System.out.println("");
        System.out.println("");
        System.out.println(menu);
        System.out.println("");
        System.out.print("Lütfen bir seçim yapınız : ");
        select=input.nextInt();
        
        switch(select){
            case 0: 
                durum=false;
                System.out.println();
                System.out.println("Programdan çıkış yapıyorsunuz");
                break;
            case 1: 
                toplama();
                break;
            case 2:
                cıkarma();
                break;
            case 3 : 
                carpma();
                break;
            case 4: 
                bolme();
                break;
            case 5 : 
                uslu();
                break;
            case 6 : 
                faktoriyel();
                break;
            case 7 :
                mod();
                break;
            case 8 : 
                dikdortgen();
                break;
                
            default:
                System.out.println("Hatalı giriş yaptınız lütfen girişinizi düzeltiniz");
                break;
        
                
                
        }
        
        
        
    }
    
    
    
    
    
        
        
    
    
    
    }
    
}
