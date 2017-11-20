/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_6;

import java.util.Scanner;

/**
 *
 * @author Pures8098
 */
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Output instructions and recive data
        System.out.println("Enter numbers");
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        double[] a = new double[0];
        int number2 = input.nextInt();
        //create loop
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextDouble();
        }
        //display greater before the lesser
            if (number1 > number2) {
                System.out.println(number1 +" "+ number2);
            } else {
                if (number1 < number2) {
                    System.out.println(number2 +" "+ number1);
                }
            }
        }
    }
