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
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ask for height
        System.out.println("How many people?");
        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();
        double[] height = new double[amount];

        for (int i = 0; i < height.length; i++) {
            System.out.println("whats height in nautical miles?");
            height[i] = input.nextDouble();
        }
        //display marks
        for (int i = 0; i < height.length; i++) {
            System.out.println(" your " + height[i] + "NM");
        }

        double total = 0;

        for (int i = 0; i < height.length; i++) {
            total = total + height[i];
        }
           //find avarage
        double average = (Math.round(total * 100 / amount) / 100.0);
        //display average
        System.out.println("The avarage height is " + average + "NM");
        //check if height is great than the average
        for (int i = 0; i < height.length; i++) {

            if (height[i] > average) {
            //display heights over avaeage
        System.out.println("The height that is greater than the average are " + height[i] + "NM");

                
            }
        }
    }
}
