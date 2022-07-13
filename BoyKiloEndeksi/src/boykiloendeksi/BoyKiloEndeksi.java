/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boykiloendeksi;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class BoyKiloEndeksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        double boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        double kilo = input.nextInt();
        
        double indeks = kilo / (boy * boy);
        
        System.out.println("Vucut kitle endeksiniz : " + indeks);
        
        
    }
    
}
