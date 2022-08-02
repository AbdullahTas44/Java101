/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usalanprogram;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class UsAlanProgram {

    
    static int us (int num1, int num2){
        
        int result = (int) Math.pow(num1, num2);
        
        return result;
        
        
        
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen taban sayısını giriniz : ");
        int num1=input.nextInt();
        System.out.print("Lütfen üs sayısını giriniz : ");
        int num2=input.nextInt();
        
        System.out.println("Us alma sonucunuz : " + us(num1,num2));
        
        
        
        
    }
    
}
