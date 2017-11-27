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
        System.out.print("Enter numbers to be sorted ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        //create array
        int a[] = new int[2];
    //use array for 1 and 2
        a[0] = num1;
        a[1] = num2;
        //flip variables i and x with a temp int
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
    // output and answer
        for (int i = 0; i < a.length; ++i) {
            System.out.println(a[i]);
        }
    }
}
