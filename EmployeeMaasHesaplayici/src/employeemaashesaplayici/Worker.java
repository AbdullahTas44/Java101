/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemaashesaplayici;

/**
 *
 * @author DELL
 */
public class Worker {
    
    
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Worker(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    
    
    double tax(){
        
        if (this.salary<1000){
            return 0;
        }else{  
            return this.salary*0.03;
        }
 
    }
    
    
      double bonus(){
          
          if (this.workHours>40){
              
              return (this.workHours-40)*30;
              
          }else{
              
              return 0;
                                   
          }
          
      }
      
      
      
      double raiseSalary(){
          
          if ( (2021-this.hireYear) <10){
              
              return this.salary*0.5;
          }
          
           if (( (2021-this.hireYear) >=10) && ((2021-this.hireYear) <20 )){
          
              
              return this.salary*0.10;
          }
           
           if ( (2021-this.hireYear) >=20){
              
              return this.salary*0.15;
               
          }
          
          return 0;
          
      }
      
      
      
    
      void toStrings() {
          
          System.out.println("Adı : " + this.name);
          System.out.println("Maaşı : " + this.salary);
          System.out.println("Çalışma saati : " + this.workHours);
          System.out.println("Başlangıç yılı : " + this.hireYear);
          System.out.println("Vergi : " + tax());
          System.out.println("Bonus : " + bonus());
          System.out.println("Maaş artışı : " + raiseSalary());
          System.out.println("Vergi ve bonuslarla birlikte maaş : " + (this.salary - tax()+ bonus() ));
          System.out.println("Toplam maaş  : " + (this.salary - tax() + bonus() + raiseSalary()));
          
          
      }
    
    
}
