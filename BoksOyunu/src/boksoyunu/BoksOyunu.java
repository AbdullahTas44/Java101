/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boksoyunu;

/**
 *
 * @author DELL
 */
public class BoksOyunu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Fighter f1 = new Fighter("Abdullah", 10, 120, 100,30);
        Fighter f2 = new Fighter("Harun", 20, 85, 85,40);
        
        Match match = new Match(f1, f2, 85, 120);
        
        
        match.run();
        
        
        
        
    }
    
}
