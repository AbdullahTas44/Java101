    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taksimetre;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Taksimetre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Gideceğiniz KM bilgisini yazar mısınız ?");
        System.out.print("KM : ");
        int km=input.nextInt();
        
        double total=(km*2.20)+10;
       
        
        if (total<=20){
            
            
            System.out.println("Ödenecek tutar = 20 TL'dir.");
            
            
        }
        else{
            
            System.out.println("Ödenecek tutar = " + total + " TL'dir.");
        }
        
    }
    
}
