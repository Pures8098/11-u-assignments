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
public class A7Q4 {

    public double compoundInterest(double a, double b, double c) {
        //create equation
        double fullIntrest = a * Math.pow((1 + b), c);
        //display fullIntrest
        System.out.println("The coumpound intrest is " + fullIntrest);
        return fullIntrest;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A7Q4 test = new A7Q4();
        //ask for number
        System.out.println("What is the initial amount ");
        Scanner in = new Scanner(System.in);
        //test intrest with variables
        //get variable for initial amount
        double a = in.nextDouble();
        System.out.println("What is the intrest rate (in decimal format)");
        //get variable for intrest rate
        double b = in.nextDouble();
        System.out.println("What is the amount of years");
        //get variiable for years
        double c = in.nextDouble();
        //test
        test.compoundInterest(a, b, c);
    }
}
