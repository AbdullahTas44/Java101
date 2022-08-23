/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dizilerleharfyazma;

/**
 *
 * @author DELL
 */
public class DizilerleHarfYazma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         String[][] letter = new String[7][4];
        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 || i == 3 || i == 6) {
                    letter[i][j] = " * ";
                    letter[0][3] = " ";
                    letter[3][3] = " ";
                    letter[6][3] = " ";
                    
                } else if (j == 0 || j == 3) {
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = "  ";
                }
            }
        }
        for (String[] a : letter) {
            for (String b : a) {
                System.out.print(b);
            }
            System.out.println();

        }
        
    }
    
}
