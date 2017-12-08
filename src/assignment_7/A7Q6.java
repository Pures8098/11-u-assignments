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
public class A7Q6 {

    /**
     *
     *
     *
     * @param args the command line arguments
     */
    public void lastDigit(int num1) {
        //if number is positive get last positive digit
        if (num1 >= 0) {
            int lastNum = num1 % 10;
            //display last positive digit
            System.out.println("This is the last digit " + lastNum);

        } else {
            //if number is negitive get last digit
            if (num1 < 0) {
                int lastNum = num1 % 10;
                //make last digit positive
                int lastNum2 = lastNum * -1;
                //display last positive digit
                System.out.println("This is the last digit " + lastNum2);
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        A7Q6 test = new A7Q6();
        Scanner in = new Scanner(System.in);
        //ask for number
        System.out.println("please imput a number ");
        //store number
        int num1 = in.nextInt();
        //check number
        test.lastDigit(num1);
    }
}
