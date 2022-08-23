/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dizisilamakullanicili;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class DiziSilamaKullanicili {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Tanımlanacak dizi için eleman sayısı giriniz : ");
        
        int piece = input.nextInt();
        int[] arr = new int [piece];
        
        for ( int i = 0 ; i < arr.length ; i++){
            
            System.out.print("Dizi elemanlarını giriniz " + i + ". eleman : ");
            arr[i]=input.nextInt();
        }
     
        Arrays.sort(arr);
        
        System.out.println("Dizinizin sıralanmış hali : ");
        
        for ( int j : arr){
            
            System.out.println(j);
        }
        
        
    }
    
}
