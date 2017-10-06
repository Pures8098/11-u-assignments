
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pures8098
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //say title and imput place
        System.out.println("Inchs to centimeters converter");
        System.out.println("place number here to be converted:");
        
        
        //create a Scanner for input
        Scanner input = new Scanner(System.in);
        
         //get Year
        double Inch = input.nextDouble();
        
        double Cm = 2.54 * Inch; 
        
        System.out.println("Your " + Inch + " Inchs are equal to " + Cm + " Centimeters ");
        
    }
}
