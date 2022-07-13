/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manavkasa;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ManavKasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double armut=2.14 , elma=3.67 , domates=1.11 , muz=0.95 , patlican=5.00;
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Armut kaç kilo : ");
        int akilo=input.nextInt();
        
        System.out.print("Elma kaç kilo : ");
        int ekilo=input.nextInt();
        
        System.out.print("Domates kaç kilo : ");
        int dkilo=input.nextInt();
        
        System.out.print("Muz kaç kilo : ");
        int mkilo=input.nextInt();
        
        System.out.print("Patlıcan kaç kilo : ");
        int pkilo=input.nextInt();
        
        
        double toplam = (armut*akilo) + (elma*ekilo) + (domates*dkilo) + (muz*mkilo) + (patlican*pkilo);
        
        System.out.println("Toplam tutar : " + toplam + " TL");
        
        
        
        
    }
    
}
