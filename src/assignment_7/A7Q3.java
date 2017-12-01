/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_7;

import java.util.Scanner;

/**
 *
 * @author Pures8098
 */
public class A7Q3 {

    public void num1(double num) {
        //go throughout number
        for (int i = 0; i <= num; i++) {
            //check for factors
            while (num % i == 0) {
                //display facors
                System.out.println("These are the factor " + i);
                break;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A7Q3 test = new A7Q3();
        Scanner in = new Scanner(System.in);

        //ask for number
        System.out.println("please enter your number ");
        //store number
        int num = in.nextInt();
        //check mark
        test.num1(num);



    }
}
