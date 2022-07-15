/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kullanıcigirisi;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class KullanıciGirisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        String username,password;
        
        System.out.print("Kullanıcı adınız : ");
        username = input.nextLine();
        System.out.print("Şifreniz adınız : ");
        password = input.nextLine();
        
        String user = "Patika";
        String pass = "java123";
        
        
        if (username.equals(user)){
            
            System.out.println("Kullanıcı adınız doğru...");
            
            if (password.equals(pass)){
                
                System.out.println("Şİfreniz doğru....");
                System.out.println("Programa girdiniz. Tebrikler...");
                
            }else {
                
                System.out.println("Şifreniz hatalıdır...");
                System.out.print("Şİfrenizi unuttunuz mu ? Değiştirmek istermisiniz (y / n)  : ");
                String secim = input.nextLine();
                
                if (secim.equals("y")){
                    
                    System.out.println("Lütfen yeni şifre giriniz");
                    System.out.print("Yeni şifre : ");
                    String newpass = input.nextLine();
                    if (newpass.equals(pass)){
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                        
                    }else {
                        
                        System.out.println("Şifre oluşturuldu");
                    }
                    
                }else{
                    
                    System.out.println("Programdan çıkılıyor...");
                }
            }
            
        }else {
            
            System.out.println("Kullanıcı adınız hatalıdır...");
            
        }
        
        
    }
    
}
