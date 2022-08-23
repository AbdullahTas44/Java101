/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dizidekitekrarsayisi;

import java.util.Arrays;

/**
 *
 * @author DELL
 */
public class DizidekiTekrarSayisi {
    static int eski=0;
    
    static void agains (int [] arr , int x){
       
        int sayac=0;
        
        if ( eski != x){
            
            for ( int i =0 ; i < arr.length; i++){
            
                if ( x==arr[i]){
                sayac++;
                
                }
            
            
       
            }
        System.out.println(x + " sayısı dizide " + sayac + " defa tekrar etmiştir.");
        }
        
         eski=x;
        
        
    }
    
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        
        Arrays.sort(arr);
        for(int i =0 ; i<arr.length ; i++){
                    
                    agains(arr,arr[i]);
                   
                
            }
            
        }

        
        
    }
    

