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
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ask for numbers here
        System.out.print("Enter numbers ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();
        int num6 = input.nextInt();
        int num7 = input.nextInt();
        int num8 = input.nextInt();
        int num9 = input.nextInt();
        int num10 = input.nextInt();
        //create array
        int a[] = new int[10];
        //lable arrays
        a[0] = num1;
        a[1] = num2;
        a[2] = num3;
        a[3] = num4;
        a[4] = num5;
        a[5] = num6;
        a[6] = num7;
        a[7] = num8;
        a[8] = num9;
        a[9] = num10;
        //sort array
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
        //output order
        for (int i = 0; i < a.length; ++i) {
            System.out.println("the percentages are in order :" + a[i] + "%");
        }

    }
}
