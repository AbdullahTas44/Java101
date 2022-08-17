/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boksoyunu;

import javax.xml.transform.Source;

/**
 *
 * @author DELL
 */
public class Match {
    
    Fighter f1;
    Fighter f2;
    
    int minweight;
    int maxweight;

    public Match(Fighter f1, Fighter f2, int minweight, int maxweight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minweight = minweight;
        this.maxweight = maxweight;
    }
    
    
    
    public void run(){
        
        if (isCheck()){
            
        while (this.f1.health>0 && this.f2.health>0){
            System.out.println("====== YENİ ROUNT =======");
            f2.health=f1.hit(f2);
       
            if (isWin()){
                break;
            }
            f1.health=f2.hit(f1);
            
            if (isWin()){
                break;                
            }
            
            
            System.out.println(this.f1.name + " sağlık : " + this.f1.health);
            System.out.println(this.f2.name + " sağlık : " + this.f2.health);
        }
            
        }else{
            
            System.out.println("Sporcuların sikletleri uymuyor");
        }
        
        
    }
    
    
    public boolean isCheck (){
        
        
        return (this.f1.weight>=minweight && this.f1.weight<=maxweight) &&(this.f2.weight>=minweight && this.f2.weight<=maxweight);
        
        
    }
    
    
    public boolean isWin(){
        
        if (this.f1.health==0){
            
            System.out.println(f2.name + " kazanan oyuncumuz");
            return true;
            
        }
        
        if (this.f2.health==0){
            
            System.out.println(f1.name + " kazanan oyuncumuz");
            return true;
            
        }
        
        return  false;
        
    }
    
    
}
