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
public class A7Q1 {

    public double areaOfCircle(double radius) {
        //calculate area
        double answer = (radius * radius) * Math.PI;
        //send back answer
        return answer;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        A7Q1 test = new A7Q1();
        Scanner in = new Scanner(System.in);
        //ask for radius
        System.out.println("please enter the radius of the circle ");
        double a = in.nextDouble();
        //calculate area
        double area = test.areaOfCircle(a);
        area = Math.round(area*100)/100.0;
        //let user know answer
        System.out.println("the area is " + area);





    }
}
