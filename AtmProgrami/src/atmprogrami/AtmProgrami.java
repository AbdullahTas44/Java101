/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atmprogrami;

import com.sun.org.apache.bcel.internal.generic.Select;
import java.util.Scanner;
import jdk.nashorn.internal.objects.NativeRegExp;

/**
 *
 * @author DELL
 */
public class AtmProgrami {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        String userName,password;
        int balance=1500;
        int hak =3;
        int miktar;
        Boolean durum=true;
        
        while (hak>0){
            System.out.println("");
            System.out.println("**********************");
            System.out.print("Lütfen Kullanıcı adınızı giriniz : ");
            userName= input.nextLine();
            System.out.print("Password giriniz : ");
            password=input.nextLine();
            System.out.println("**********************");
            System.out.println("");
            System.out.println("");
            
            if (   userName.equals("patika") && password.equals("dev123")){
                
                 System.out.println("Merhana Patika Bankasına Hoş Geldiniz...");
               while  (durum){
                 
                   System.out.println("");
                   System.out.println("");
                  
                  
                   String islemler = "Merhaba Yapmak istediğiniz işlemi seçiniz : \n"
                         + "1. Para Yatırma\n"
                         + "2. Para Çekme\n"
                         + "3. Bakiye Sorgula\n"
                         + "4. Çıkış";
                         
                   
                   System.out.println("");
                   System.out.println("**********************");
                   System.out.println(islemler);
                   System.out.println("**********************");
                  
                   System.out.print("Seçiminiz : ");
                  int select = input.nextInt();
                 
                 
                  switch (select) {
                     case 1:
                         System.out.print("Yatırmak istediğiniz miktarı giriniz : ");
                         miktar = input.nextInt();
                         balance+=miktar;
                         System.out.println("Yeni bakiyeniz : " + balance );
                         
                         break;
                     case 2 : 
                         System.out.print("Çekmek istediğiniz miktarı yazınız : ");
                         miktar=input.nextInt();
                         if (miktar>balance){
                             
                             System.out.println("Bu miktarı çekemezsiniz bakiyeniz yetersiz");
                             System.out.println("Var olan bakiyeniz : " + balance);
                              
                             break;
                         }else{
                             
                             balance-=miktar;
                             System.out.println("Kalan bakiyeniz : " + balance);
                             break;
                         }
                        
                         
                     case 3 :
                         System.out.println("Var olan bakiyeniz : " + balance);
                         break;
                         
                     case 4 : 
                         System.out.println("");
                         System.out.println("**********************");
                         System.out.println("Patika Bankası İyi Günler Diler...");
                         System.out.println("**********************");
                         durum=false;
                         hak=0;
                         break;
                      default:
                         
                          System.out.println("Hatalı seçim yaptınız");
                          System.out.println("");
                          break;
                 }
                
                         
               }
               
      
             }else {
                 hak--;
                 System.out.println("");
                 System.out.println("**********************");
                 System.out.println("Hatalı Giriş Yaptınız");
                 
                 if (hak ==0){
                     System.out.println("");
                     System.out.println("Hesabınız Bloke olmuştur.Bankanızı arayınız...");
                     System.out.println("**********************");
                     
                 }else{
                     System.out.println("");
                     System.out.println("Kalan Giriş Hakkınız : " + hak);
                     System.out.println("**********************");
                 }
                 
                 
             }
            
        }
        
        
        
    }
    
}
