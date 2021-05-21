/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project10;
import java.util.Scanner;

/**
 *
 * @author London
 */
public class Project10 {
//    question = Buatlah sebuah program yang mampu untuk menghitung jumlah gaji. 
//    Jika dia bekerja lebih dari 8 jam maka gaji yang 
//    didapat = 8 jam * gajiPokok . 
//    2. Jika dia bekerja selama 6 jam maka totalGajinya = 6 jam * gajiPokok
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scan = new Scanner (System.in);
    
    int gajiTotal;
    int gajiPokok;
    int gajiJam;
    
        System.out.println("Insert Your Gaji.");
        gajiPokok = scan.nextInt();
        
        System.out.println("Insert Your Gaji Jam");
        gajiJam = scan.nextInt();
        
        if (gajiJam > 8 ){
            gajiTotal = gajiPokok * gajiJam;
            
           }
        else if(gajiJam == 6 ){
            gajiTotal = gajiPokok * 6;
        }
        System.out.println("Gaji Jam = "+gajiJam);
        System.out.println("GajiPokok = "+gajiPokok);
        System.out.println("Total = "+gajiPokok * gajiJam);
    
    
    
    
    
    
    }
    
}
