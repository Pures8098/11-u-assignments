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
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //get students
        System.out.print("Enter How Many students ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int a[] = new int[num1];
        //get marks
        for (int i = 0; i < num1; i++) {
            System.out.print("Enter marks" + (i + 1) + ":");
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
        //get average mark
        double total = 0;

        for (int i = 0; i < a.length; i++) {
            total = total + a[i];
        }
        double average = (total) / a.length;
        
        System.out.println("the average mark is " + average);
        
        //get highest mark
         System.out.println("the lowest mark is " + a[0]);
        
        
        //get lowest marks
         System.out.println("the Highest mark is " + a[num1 - 1]);
        
        
        
      
    }
}
