package boksoyunu;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Fighter {
    
    
    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    

    public Fighter(String name, int damage, int health, int weight,int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        
        if (this.dodge>=0 && this.dodge<=100){
            this.dodge = dodge;
            
        }else{
            this.dodge=0;
        }
        
        
        
    }
    
    
    int hit (Fighter foe){
        
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu");
        
        if (foe.isDodge()){
            
            System.out.println(foe.name + " gelen hasarı blockladı");
            System.out.println("---------------");
            return foe.health;
            
            
        }
        if (foe.health-this.damage<0) {
            return 0;
        }
        
        
        return foe.health-this.damage;
        
        
    }
    
    
    boolean isDodge(){
        double randomnumber = Math.random()*100;
        
        return randomnumber<=this.dodge;
        
        
    }
    
    
}
