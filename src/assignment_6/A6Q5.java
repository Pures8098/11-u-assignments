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
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Enter How Many Inputs ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int a[] = new int[num1];
        //get amount of numbers
        for (int i = 0; i < num1; i++) {
            System.out.print("Enter amount of number" + (i + 1) + ":");
            a[i] = input.nextInt();
        }
        //sort numbers in array
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int x = i + 1; x < a.length; x++) {
                if (a[i] > a[x]) {
                    temp = a[i];
                    a[i] = a[x];
                    a[x] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; ++i) {
            System.out.println("the percentages are in order: " + a[i]);
        }
        //get median
        double median = (double) a[a.length / 2];
        //get average of 2 medians
        double media = (double) (a[a.length-a[1] / 2]);
        if (a.length % 2 == 0) {
          double  average = (median + media) / 2;
            System.out.println("the media is: " + average);
        } else {
            if (a.length % 2 != 0) {
                System.out.println("the median is: " + median);
            }
        }
    }
}