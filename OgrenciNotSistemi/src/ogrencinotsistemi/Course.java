/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ogrencinotsistemi;

/**
 *
 * @author DELL
 */
public class Course {
    
    // Teacher sınıfından bir öğretmen aldık
    Teacher teacher;
    
    // Course sınıfının özelliklerini tanımladık 
    
    String name;
    String code;
    String prefix;
    int note;
    int sozlu;
    
    // Course sınıf construction tanımladık 
    
     Course(Teacher teacher, String name, String code, String prefix) {
        this.teacher = teacher;
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note=0;
        this.sozlu=0;
        
        
    }
   
    // Teacher sınıfından aldığımız öğretmeni derse atadık brans kodları uyusuyor ise ekleme yapıldı
     
    void addTeacher( Teacher teacher){
       
        if (teacher.branch.equals(this.prefix)){
        this.teacher=teacher;
       // printTeacher();
        }else{ 
            System.out.println("Öğretmen ve ders bölümleri uyuşmamaktadır.");
        } 
    }
    
    // öğretmen isimlerini teacher sınıfındaki yazdır metodunu kullanarak yazdırdık
    
    void printTeacher(){
        
        this.teacher.print();
        
    }
}
