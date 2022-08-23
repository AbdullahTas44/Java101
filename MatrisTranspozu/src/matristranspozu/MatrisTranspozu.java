/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matristranspozu;

/**
 *
 * @author DELL
 */
public class MatrisTranspozu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matris = {{2,3,4},{5,6,4}};
        
        int x = matris.length;
        int y =matris[0].length;
        
        int [][] mattrans = new int [y][x];
        
        
        for (int i =0; i < x ; i++){
            for (int j =0 ; j<y; j++){
                
               mattrans[j][i]= matris[i][j];
               
                
            }
            
        }
        
        
        for ( int [] a : mattrans){
            for (int b : a){
                
                System.out.print(b + " ");
                
            }
            System.out.println();
            
        }
        
      
        
        
        
        
        
        
        
    }
    
}
