/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package burcbulanprogram;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class BurcBulanProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Doğduğunuz ayı giriniz : ");
        int ay = input.nextInt();
        System.out.print("Doğduğunuz günü giriniz : ");
        int gun= input.nextInt();
        
        String burc=" ";
        
        if ((ay>=1) && (ay<=12)){
        if (ay==1){
            if ((gun>=1) && (gun<=31)){
                
                if (gun<22){
                
                
                    burc="Oğlak";
                
                }
                else {
               
                    burc="Kova";

                }
                 
            }else {
                
                System.out.println("Hatalı gün sayısı girdiniz");
                burc="Hatalı giriş";
                
                
            }
            
        }
        else if (ay==2){
            if ((gun>=1) && (gun<=28)){
                
                if (gun<20){
                
                    burc = "Kova";
                
                }
                else {
                
                    burc="Balık";
             
                }
                 }
            else {
                
                System.out.println("Hatalı gün sayısı girdiniz");
                burc="Hatalı giriş";
                
                }
        }
        else if (ay==3){
           
            if ((gun>=1) && (gun<=31)){
                
                if (gun<21){
                
                    burc="Balık";
               
                }
                else {
                
                    burc="Koç";
                
                }
                 }
            
            else {
                
                System.out.println("Hatalı gün sayısı girdiniz");
                burc="Hatalı giriş";
                
                
            }
        
        }
        else if (ay==4){
           
            if ((gun>=1) && (gun<=30)){
                
                if (gun<21){
                
                    burc="Koç";
               
                }
                else {
                
                    burc="Boğa";
                
                }
                 }
            
            else {
                
                System.out.println("Hatalı gün sayısı girdiniz");
                burc="Hatalı giriş";
                
                
            }
        
        }
        else if (ay==5){
           
            if ((gun>=1) && (gun<=31)){
                
                if (gun<22){
                
                    burc="Boğa";
               
                }
                else {
                
                    burc="İkizler";
                
                }
                 }
            
            else {
                
                System.out.println("Hatalı gün sayısı girdiniz");
                burc="Hatalı giriş";
                
                
            }
        
        }
        else if (ay==6){
           
            if ((gun>=1) && (gun<=30)){
                
                if (gun<23){
                
                    burc="İkizler";
               
                }
                else {
                
                    burc="Yengeç";
                
                }
                 }
            
            else {
                
                System.out.println("Hatalı gün sayısı girdiniz");
                burc="Hatalı giriş";
                
                
            }
        
        }
        else if (ay==7){
           
            if ((gun>=1) && (gun<=30)){
                
                if (gun<23){
                
                    burc="Yengeç";
               
                }
                else {
                
                    burc="Aslan";
                
                }
                 }
            
            else {
                
                System.out.println("Hatalı gün sayısı girdiniz");
                burc="Hatalı giriş";
                
                
            }
        
        }
        else if (ay==8){
           
            if ((gun>=1) && (gun<=31)){
                
                if (gun<23){
                
                    burc="Aslan";
               
                }
                else {
                
                    burc="Başak";
                
                }
                 }
            
            else {
                
                System.out.println("Hatalı gün sayısı girdiniz");
                burc="Hatalı giriş";
                
                
            }
        
        }
        else if (ay==9){
           
            if ((gun>=1) && (gun<=30)){
                
                if (gun<23){
                
                    burc="Başak";
               
                }
                else {
                
                    burc="Terazi";
                
                }
                 }
            
            else {
                
                System.out.println("Hatalı gün sayısı girdiniz");
                burc="Hatalı giriş";
                
                
            }
        
        }
        
        else if (ay==10){
           
            if ((gun>=1) && (gun<=31)){
                
                if (gun<23){
                
                    burc="Terazi";
               
                }
                else {
                
                    burc="Akrep";
                
                }
                 }
            
            else {
                
                System.out.println("Hatalı gün sayısı girdiniz");
                burc="Hatalı giriş";
                
            }
        
        }
        
        else if (ay==11){
           
            if ((gun>=1) && (gun<=30)){
                
                if (gun<22){
                
                    burc="Akrep";
               
                }
                else {
                
                    burc="Yay";
                
                }
                 }
            
            else {
                
                System.out.println("Hatalı gün sayısı girdiniz");
                burc="Hatalı giriş";
                
            }
        
        }
        else if (ay==12){
           
            if ((gun>=1) && (gun<=31)){
                
                if (gun<22){
                
                    burc="Yay";
               
                }
                else {
                
                    burc="Oğlak";
                
                }
                 }
            
            else {
                
                System.out.println("Hatalı gün sayısı girdiniz");
                burc="Hatalı giriş";
                
            }
        
        }
        
        
        }
        
        
        
        else {
            
            System.out.println("Hatalı bir ay seçtiniz :( ");
            burc="Hatalı giriş";
            
            
        }
        
        
        System.out.println("Burcunuz : " + burc);
        
        
        
    }
    
}
