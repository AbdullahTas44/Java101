/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kombinasyon;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Kombinasyon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("C(n,r) şeklinde n değerini giriniz : ");
        int n = input.nextInt();
        System.out.print("C(n,r) şeklinde r değerini giriniz : ");
        int r = input.nextInt();
        input.nextLine();
        
        double nfak=1,rfak=1,totalfak=1;
        
        for (int i =1 ; i<=n; i++){
            
            nfak=nfak*i;
            
        }
        
         for (int i =1 ; i<=r; i++){
            
            rfak=rfak*i;
            
        }
        
         for (int i =1 ; i<=(n-r); i++){
            
            totalfak=totalfak*i;
            
        }
         System.out.println("");
         System.out.println("***** SONUÇLAR *****");
         System.out.println("n faktöriyel : " + nfak );
         System.out.println("r faktöriyel : " + rfak );
         System.out.println("farkları faktöriyel : " + totalfak );
        
         
         double sonuc = nfak / (rfak * totalfak);
         
         System.out.println("Kombinasyon sonucu : " + sonuc);
        //C(n,r) = n! / (r! * (n-r)!)
        
        
    }
    
}
