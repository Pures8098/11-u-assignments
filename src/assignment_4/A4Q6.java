/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4;

import java.util.Scanner;

/**
 *
 * @author Pures8098
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


        //say hello 
        System.out.println("Hello welcome to the automatic fine checker");

        //say hello 
        System.out.println("please input your name");

        //get name
        Scanner input = new Scanner(System.in);

        // name, name
        String name = input.nextLine();

        //display name
        System.out.println("welcome " + name);

        //imput what the speed limit is
        System.out.println("please input the speed limit");

        // name speed limit
        double speedLimit = input.nextDouble();

        //imput your speed
        System.out.println("please input the speed that u were going");

        //name speed 
        double speed = input.nextDouble();

        //imput your speed
        System.out.println("you were going " + speed + "km/h on a " + speedLimit + "km/h,road");

        // get fine
        double fine = (speed - speedLimit);

        if (fine <= 20 && fine >= 1) {

            //calculate fine
            double f = 100;

            //display mark
            System.out.println("you got a, $" + f + " fine good job");
        }

        if (fine >= 21 && fine <= 30) {
            //calculate fine
            double f = 270;

            //display mark
            System.out.println("you got a, $" + f + " fine good job");
        }

        if (fine >= 31) {

            //calculate fine
            double f = 500;

            //display mark
            System.out.println("you got a, $" + f + " fine good job");
        }

        if (fine <= 0) {

            //calculate fine
            double f = 0;
            
            //display mark
            System.out.println("you got a, $" + f + " fine good job");
        }
    }
}
