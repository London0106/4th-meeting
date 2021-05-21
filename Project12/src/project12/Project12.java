/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project12;
import java.util.Scanner;

/**
 *
 * @author London
 */
public class Project12 {
//    question = 1. Kamu diminta untuk membuat sebuah program untuk menghitung harga tiket pesawat. 
//                  Pesawat dua tipe tiket ; 
//		1.Bussines Class ; 
//		2. Economy Class ; 
//		Jika kamu masuknya di ekonomi class maka harga tiket + 500.000  ; 
//		Jika kamu masuknya di business clas maka harga tiketnya + 1.000.000 ; 
//		JIKA Barang bawaan mu lebih dari > 25 kg  maka + 500.000
//		Jika kurang lebih dari <25 + 0 ; 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scan = new Scanner (System.in);
    
     int hargaTiket ; 
    int hargaTotal ; 
    int beratBarang ; 
    int selected ;
    
        System.out.println("Harga Tiket ");
        hargaTiket = scan.nextInt() ; 
        System.out.println("Berat Barang");
        beratBarang = scan.nextInt(); 
        
        System.out.println("===Chose your class tiket====");
        System.out.println("1.Bussiness Class");
        System.out.println("2.Economy Class ");
        System.out.println("===Your Answer==");
        selected = scan.nextInt();
       
         switch(selected){
            case 1 : System.out.println("Bussines Class Menu..");
                hargaTotal = hargaTiket+1000000 ; 
                if(beratBarang>25)
                {
                    hargaTotal = hargaTotal + 500000 ; 
                    System.out.println("Total Harga Tiket Anda "+hargaTotal);
                }
                else if(beratBarang<=25){
                    hargaTotal = hargaTotal+ 0 ; 
                    System.out.println("Total Harga Tiket Anda "+hargaTotal);
                }
                break ; 
            case 2 : System.out.println("Economy Class Menu..");
                hargaTotal = hargaTiket+500000 ;
                if(beratBarang>25)
                {
                    hargaTotal = hargaTotal + 500000 ;
                    System.out.println("Total Harga Tiket Anda "+hargaTotal);
                }
                else if(beratBarang<=25){
                    hargaTotal = hargaTotal + 0 ;
                    System.out.println("Total Harga Tiket Anda "+hargaTotal);
                }
         
         }
    
    }
   
}
    

