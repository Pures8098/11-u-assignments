
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pures8098
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //say title and imput place
        System.out.println("Hello please write down 4 random numbers");
        
        //create a Scanners for input
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        Scanner input4 = new Scanner(System.in);
        
        //get numbers
        double number = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        double number4 = input.nextDouble();
        
        
        //say numbers in position
        System.out.println(number);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
    }
}
