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
public class A7Q5 {

    public void lines(double a) {

        //loop
        for (int i = 0; i <= a; i++) {
            //create a equation
            int randNum = (int) (Math.random() * (5 - 1 + 1)) + 1;
            //if one of five specific numbers then display however many astrisicts respectivly
            if (randNum == 5) {
                System.out.println("*****");
            }
            if (randNum == 4) {
                System.out.println("****");
            }
            if (randNum == 3) {
                System.out.println("***");
            }
            if (randNum == 2) {
                System.out.println("**");
            }
            if (randNum == 1) {
                System.out.println("*");
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A7Q5 test = new A7Q5();
        Scanner in = new Scanner(System.in);
        //ask for number
        System.out.println("please enter the upper amount of lines that you want to randomly generate ");
        //store number
        int a = in.nextInt();
        //check number
        test.lines(a);
    }
}
