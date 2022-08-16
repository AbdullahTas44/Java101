/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ogrencinotsistemi;

/**
 *
 * @author DELL
 */
public class Teacher {
    
    // teacher sınıfının özelliklerini tanımladık
    
    String name;
    String mpno;
    String branch;

    // teacher sınıfı için construction tanımladık 
    
     Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

     // öğretmenimizin özelliklerini ekrana yazdırdık 
     
     void print(){
         
         System.out.println("Adı : " + this.name);
         System.out.println("Telefonu : " + this.mpno);
         System.out.println("Bölümü : " + this.branch);
 
     }
}
