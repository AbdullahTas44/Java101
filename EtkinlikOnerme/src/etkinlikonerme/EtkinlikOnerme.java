/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package etkinlikonerme;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class EtkinlikOnerme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         int sicaklik;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the temperature value : ");
        sicaklik = input.nextInt();

        String sonuc = (sicaklik < 5) ? "Kayağa gidebilirsin"
                : ((5 <= sicaklik && sicaklik < 15) ? "Sinemaya gidebilrsin"
                        : ((15 <= sicaklik && sicaklik <= 25) ? "Pikniğe gidebilirsin"
                                : "Yüzmeye gidebilirsin"));

        System.out.println(sonuc);
        
        
        
        
    }
    
}
