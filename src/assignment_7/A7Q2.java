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
public class A7Q2 {

    public void marks(double mark) {

        //check marks
        if (mark < 50) {
            //display mark
            System.out.println("you got a F");

        } else {

            if (mark < 59 && mark > 50) {
                //display mark
                System.out.println("you got a D");

            }
        }

        if (mark < 69 && mark > 60) {
            //display mark
            System.out.println("you got a C");

        } else {

            if (mark < 70 && mark > 79) {
                //display mark
                System.out.println("you got a B");

            }
        }
        if (mark > 80) {
            //display mark
            System.out.println("you got a A");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A7Q2 test = new A7Q2();
        Scanner in = new Scanner(System.in);
        //ask for mark
        System.out.println("please enter your mark ");
        //store mark
        double mark = in.nextDouble();
        //check mark
        test.marks(mark);
    }
}
