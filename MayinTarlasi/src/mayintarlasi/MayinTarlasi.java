/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mayintarlasi;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class MayinTarlasi {

    public static void main(String[] args) {
                
        Scanner input = new Scanner(System.in);
        
        System.out.print("Mayın tarlası oynuna hoş geldin !\n"+
        "koordinat seçerken ,bayrak dikmek istersen koordinattan sonra 'f' harfini gir ,örneğin : (3 1 f)\n"+
        "tarlanın boyutunu gir ,örneğin : (4 7)  : ");
       
        int x , y ;
        
        x = input.nextInt();
        y = input.nextInt();
        
        MineSweeper mineSweeper = new MineSweeper(x, y);
        //mineSweeper.printMineMap();
        
        mineSweeper.run();
        
     
        
    }
    
}
