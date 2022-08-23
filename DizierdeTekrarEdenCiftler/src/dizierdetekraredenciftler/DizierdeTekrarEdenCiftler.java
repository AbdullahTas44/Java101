/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dizierdetekraredenciftler;

/**
 *
 * @author DELL
 */
public class DizierdeTekrarEdenCiftler {

    /**
     * @param args the command line arguments
     */
    static int eski=0;
    
    
   static void print (int x){

       if ( x %2 ==0 && x != eski ){

           System.out.println(x);
           eski=x;
       }
   }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] numbers = {10,32,23,34,3,3,1,2,2,2,4,5,6,5,6,2,10};
        
        
        for (int i =0; i <numbers.length ; i++){
                for ( int j = i+1 ; j < numbers.length ; j++){
                    
                    if (numbers[i]==numbers[j]){
                        
                       print(numbers[i]);
                       
                    }
                    
                }
                
            }
            
       
        
       
        
        
    }
    
}
