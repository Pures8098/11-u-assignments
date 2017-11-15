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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Ask for amount of students
        System.out.println("How many students in the class?");
        Scanner input = new Scanner(System.in);
        int students = input.nextInt();
        double[] grades = new double[students];
        //get marks
        for (int i = 0; i < grades.length; i++) {
            System.out.println("what were the marks?");
            grades[i] = input.nextDouble();
        }
        //display marks
        for (int i = 0; i < grades.length; i++) {
           System.out.println(" the test is " + grades[i] + "%");
        }
        //get average
        double overallgrades = (students);
        
        double total = 0;

        for (int i = 0; i < grades.length; i++) {
            total = total + grades[i];
        }
        
         double overall = ( Math.round(total*100/ overallgrades)/100.0);
           System.out.println(" the test avaerage is " + overall + "%");
        
        
    }
}
