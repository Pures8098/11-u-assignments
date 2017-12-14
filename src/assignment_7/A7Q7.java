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
public class A7Q7 {

    public void firstDigit(int num1) {
        //if number is positive get first positive digit
        if (num1 > 9) {
            while (num1 > 9) {
                num1 = num1 / 10;
            }
            //display first positive digit
            System.out.println("This is the first digit " + num1);
        } else {
            //if number is negative get first negative digit
            if (num1 < -9) {
                while (num1 < -9) {
                    num1 = num1 / 10;
                }
                //make first digit positive
                int firstNum2 = num1 * -1;
                //display first positive digit
                System.out.println("This is the first digit " + firstNum2);
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        A7Q7 test = new A7Q7();
        Scanner in = new Scanner(System.in);
        //ask for number
        System.out.println("please imput a number ");
        //store number
        int num1 = in.nextInt();
        //check number
        test.firstDigit(num1);
    }
}
