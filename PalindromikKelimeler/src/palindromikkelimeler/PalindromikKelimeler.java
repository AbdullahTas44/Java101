/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromikkelimeler;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class PalindromikKelimeler {

    
    
    public static boolean palindrom(String str){
        
        String newstr="";
        
        for (int i =str.length()-1 ; i>-1 ; i--){
            newstr+=str.charAt(i);  
        }
        
        return newstr.equals(str);
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir kelime giriniz : ");
        String kelime = input.nextLine();
        
       if (!palindrom(kelime)){
           
           System.out.println("Girdiğiniz kelime palindrom değildir.");
       }else{
           
           System.out.println("Girdiğiniz kelime palindromdur.");
       }
        
        
        
        
    
    

    }
}
