/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hipotenusbulma;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class HipotenusBulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        
        System.out.print("A kenarını giriniz : ");
        double a=input.nextDouble();
        System.out.print("B kenarını giriniz : ");
        double b=input.nextDouble();
        System.out.print("C kenarını giriniz : ");
        double c=input.nextDouble();
        
        double cevre=(a+b+c)/2;
        double alan= cevre*(cevre-a)*(cevre-b)*(cevre-c);
        
        
        
        System.out.println("Üçgenin Çevresi = " + cevre);
        System.out.println("Üçgenin Alanı = " + alan);
        
  
    }
    
}
