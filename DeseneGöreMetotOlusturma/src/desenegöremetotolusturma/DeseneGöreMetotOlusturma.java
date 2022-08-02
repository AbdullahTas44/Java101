/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desenegöremetotolusturma;

import java.awt.Event;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class DeseneGöreMetotOlusturma {
    
 
   
    
    static void desenYap(int num){
       int orj=num;
       System.out.print(num + " ");

        if (num>0){
            num-=5;
            desenYap(num);
        }
        desenYap_2(num,orj);
    }
    
   
    static void desenYap_2(int num,int orj){

        if (num<orj){
             num+=5;
         System.out.print(num + " ");
            desenYap_2(num,orj);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        int num = input.nextInt();
        desenYap(num);

    }
}
