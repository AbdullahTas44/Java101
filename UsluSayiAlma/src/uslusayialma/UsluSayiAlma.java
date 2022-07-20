/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uslusayialma;

import java.util.Scanner;



/**
 *
 * @author DELL
 */
public class UsluSayiAlma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
     Scanner input = new Scanner(System.in);
     
        System.out.print("Üssü alınacak sayıyı giriniz : ");
        int n = input.nextInt();
        System.out.print("Üs olacak sayıyı giriniz : ");
        int k = input.nextInt();
        
    
        double sonuc = Math.pow(n, k);
        double sonuc2=1;
        
        System.out.println("formul ile yapılan sonuc : " + sonuc);
            
        for (int i=0; i<k; i++){
            
           sonuc2 = sonuc2 * n;
         
        }
        
        System.out.println("for ile yapılan sonuc : " + sonuc2);
        
    }
    
}
