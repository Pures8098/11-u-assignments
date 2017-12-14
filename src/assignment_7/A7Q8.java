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
public class A7Q8 {

    public static boolean oddNum(int a) {
        //if 0 return false
        if (a == 0) {
            return false;
        }
        //loop looking for even numbers
        while (a > 0 || a < 0) {
            //mod 10 to look for even numbers
            int b = a % 10;
            //if even retun false
            if (b % 2 == 0) {
                return false;
            }
            //divided to look for even numbers
            a = a / 10;
        }
        //if odd return true
        return true;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create array
        A7Q8 test = new A7Q8();
        //ask for an imout
        System.out.println("please imput a odd number ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        //test number
        boolean answer = test.oddNum(a);
        //output true or false
        System.out.println(answer);
    }
}
