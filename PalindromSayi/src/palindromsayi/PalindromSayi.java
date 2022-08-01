/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromsayi;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class PalindromSayi {

    static boolean  palindrom (int number){
       
        int temp=number, reverse=0, last;
        
        while (temp>0){
            last=temp%10;
            reverse=(reverse*10)+last;
            temp=temp/10;
        }
        
        return reverse==number; 
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int number=input.nextInt();
       
       if (palindrom(number)){
           System.out.println("sayımız palindromdur.");
       }else{
           System.out.println("sayımız palindrom değildir.");
       }   
    }
    
}
