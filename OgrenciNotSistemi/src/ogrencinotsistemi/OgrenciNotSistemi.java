/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ogrencinotsistemi;

/**
 *
 * @author DELL
 */
public class OgrenciNotSistemi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //öğretmenleri tanımladık
        Teacher t1 = new Teacher("Mahmut Hoca", "05068348943", "TRH");
        Teacher t2 = new Teacher("İsmail Hoca", "05068348943", "FZK");
        Teacher t3 = new Teacher("Ayşe Hoca", "05068348943", "BIO");
        
        // dersleri tanımladık 
        Course tarih= new Course(t1, "Tarih", "101", "TRH");
        Course fizik = new Course(t2, "Fizik", "102", "FZK");
        Course biyoloji = new Course(t3, "Biyoloji", "101", "BIO");
        
        //öğretmenleri derslere atadık
        tarih.addTeacher(t1);
        fizik.addTeacher(t2);
        biyoloji.addTeacher(t3);
     
        // öğrencimizi tanımladık derslerini atadık 
        
        Student s1 = new Student("Abdullah", "123", "4", tarih, fizik, biyoloji);
        Student s2 = new Student("Hakan", "124", "4", tarih, fizik, biyoloji);
        
        // öğrencimizin notlarını atadık sırası ile tarih notu fizik notu biyoloji notu tarih sözlü notu fizik sözlü notu biyoloji sözlü notu 
        
        s1.addBulkExamNote(100,78, 0,0,0,0);
        
        s1.isPass();
         
        s2.addBulkExamNote(100, 20, 40,100,100,100);
             
        s2.isPass();
       
       
       
       
        
        
        
        
    }
    
}
