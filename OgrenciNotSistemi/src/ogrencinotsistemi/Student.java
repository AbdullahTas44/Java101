/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ogrencinotsistemi;

/**
 *
 * @author DELL
 */
public class Student {
    // course dersler sınıfından 3 ders aldık
    Course c1;
    Course c2;
    Course c3;

   // Student sınıfının özelliklerini tanımladık 
    
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean IsPass;
    
    
    // Student sınıfı consuctior yazdık
      Student(String name, String stuNo, String classes,Course c1, Course c2, Course c3) {
        
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.IsPass = false;
        
    }
     
      // notları derslere atadık 
     
     void addBulkExamNote(int note1,int note2,int note3,int sozlu1,int sozlu2, int sozlu3){
         
         if (note1>=0 && note1<=100){
             this.c1.note=note1;    
         }
         
         if (sozlu1>=0 && sozlu1<=100){
             this.c1.sozlu=sozlu1;    
         }
         
         
         
        if (note2>=0 && note2<=100){
             this.c2.note=note2;
         }
        
         if (sozlu2>=0 && sozlu2<=100){
             this.c2.sozlu=sozlu2;    
         }
         
         
          if (note3>=0 && note3<=100){
             this.c3.note=note3;
         } 
          
           if (sozlu3>=0 && sozlu3<=100){
             this.c3.sozlu=sozlu3;    
         }
     }
     
     // notları ekrana yazdırdık
     
      void printNote(){
         
         System.out.println("Öğrenci ismi : " + this.name);
         System.out.println(c1.name + " notu : " + this.c1.note);
         System.out.println(c1.name + " Sozlu notu : " + this.c1.sozlu);
         System.out.println(c2.name + " notu : " + this.c2.note);
         System.out.println(c2.name + " Sozlu notu : " + this.c2.sozlu);
         System.out.println(c3.name + " notu : " + this.c3.note);
         System.out.println(c3.name + " Sozlu notu : " + this.c3.note);
         System.out.println("Ortalamanız : " + this.avarage);
         System.out.println("");
         System.out.println("********************");
         System.out.println("");
     }
      
      void isPass (){
          
          this.avarage= ((this.c1.note*0.80 + this.c1.sozlu*0.20) + (this.c2.note*0.70 + this.c2.sozlu*0.30) + (this.c3.note*0.75 + this.c3.sozlu*0.25))  / 3.0;
          
          
          
          if ( this.avarage>55){
              
              System.out.println("Sınıfı başarılı bir şekilde geçtiniz" );
              System.out.println("");
              this.IsPass=true;
              
          }else{
              
              System.out.println("Ne yazık ki Sınıfta kaldınız....");
              System.out.println("");
              this.IsPass=false;
          }
          
          printNote();
          
      }
      
      
     
    
    
}
