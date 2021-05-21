/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project9;
import java.util.Scanner;

/**
 *
 * @author London
 */
public class Project9 {
//    question = BUATLAH PROGRAM UNTUK MENGHITUNG LUAS SEGITA DIMANA FORMULA : (a*t)/2
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scan = new Scanner (System.in);
    
    double alas;
    double tinggi;
    double luasSegita;
    
        System.out.println("Insert Your Alas.");
        alas = scan.nextDouble();
        
        System.out.println("Insert Your Tinggi.");
        tinggi = scan.nextDouble();
        
        luasSegita = (alas*tinggi) / 2;
        System.out.println("Answer = "+luasSegita);
        
    
    
    
    
    
            
    
    }
    
}
