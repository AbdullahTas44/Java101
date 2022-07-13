/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daireninalanicevresi;

import java.util.Scanner;
import javax.sound.midi.Soundbank;

/**
 *
 * @author DELL
 */
public class DaireninAlaniCevresi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double pi =3.14;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen daire yarıçapını giriniz : ");
        int r= input.nextInt();
        System.out.print("Lütfen merkez açısının ölçüsünü giriniz : ");
        int aci=input.nextInt();
        input.nextLine();
       
        double sonuc = (pi*(r*r)*aci)/360;
        
        System.out.println("Daire diliminin alanı = " + sonuc);
   
    }
    
}
