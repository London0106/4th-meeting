/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project11;
import java.util.Scanner;
 
/**
 *
 * @author London
 */
public class Project11 {
//    question = saya ingin menentukan channel tv = kompas, disney, hbo.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scan = new Scanner (System.in);
    
    int channel;
        System.out.println ("===Please Insert your Channel===");
        
       
        System.out.println("1.Kompas");
        System.out.println("2.Disney");
        System.out.println("3.HBO");
        System.out.println("Answer = ");
        
        channel = scan.nextInt();
        
        switch(channel){
            case 1 :
                System.out.println("Your Channel is Kompas");
                break;
            case 2 :
                System.out.println("Your Channel is Disney");
                break;
            case 3 :
                System.out.println("Your Channel is HBO");
                break;
            default :
                System.out.println("Wrong Answer!");
                break;
        }
           
    
       
    
    }
    
}
