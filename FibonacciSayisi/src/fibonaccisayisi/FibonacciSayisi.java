/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonaccisayisi;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class FibonacciSayisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("İstediğiniz fibonacci sayısını giriniz : ");
        int number= input.nextInt();
        input.nextLine();
        int sayac=0,fib=1;
        int eski=0;
        
        System.out.println("sonuc = " + eski);
        
        while(sayac<number-1){
   
            fib=eski + fib;
            eski=fib-eski;
            sayac++;

            System.out.println("sonuc = " + fib); 
 
        }
        
        
        
        
        
        
    }
    
}
