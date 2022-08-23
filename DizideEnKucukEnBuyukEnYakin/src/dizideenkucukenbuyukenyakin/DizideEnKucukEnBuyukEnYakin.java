/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dizideenkucukenbuyukenyakin;

import java.util.Arrays;

/**
 *
 * @author DELL
 */
public class DizideEnKucukEnBuyukEnYakin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] numbers = {56,34,1,8,101,-2,-33};
        
        Arrays.sort(numbers);
        
        System.out.println("En küçük sayı : " + numbers[0]);
        System.out.println("En küçük en yakın sayı : " + numbers[1]);
        
        System.out.println("En büyük sayı : " + numbers[numbers.length-1]);
        System.out.println("En büyük en yakın sayı : " + numbers[numbers.length-2]);
        
    }
    
}
