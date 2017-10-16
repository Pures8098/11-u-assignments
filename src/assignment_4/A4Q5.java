package assignment_4;

import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pures8098
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


        //say hello 
        System.out.println("Hello welcome to the automatic test marker");

        //say hello 
        System.out.println("please input your name");

        //get percentage
        Scanner input = new Scanner(System.in);

        // name test percentage
        String name = input.nextLine();

        //display name
        System.out.println("welcome " + name);

        //imput what the test is out of
        System.out.println("please input the amount that the test was out of");

        //get percentage
        Scanner input1 = new Scanner(System.in);

        // name test percentage
        String test1 = input.nextLine();

        int percentage = Integer.parseInt(test1);

        int testMark = percentage;

        //display precentage
        System.out.println("the test is out of " + test1);

        //imput mark
        System.out.println(" please input the amount that you got out of the test ");

        //get amount of test 
        double number = input.nextDouble();

        // name mark

        double mark1 = ((number / testMark) * 100);

        //display mark
        System.out.println("you got " + mark1 + "%, good job");

        //imput what the test is out of
        System.out.println("please input the amount that the second test was out of");

        // name test percentage
        double testMark2 = input.nextDouble();

        //display precentage
        System.out.println("the test is out of " + testMark2);

        //imput mark
        System.out.println(" please input the amount that you got out of the test ");

        //get amount of test 
        double number2 = input.nextDouble();

        // name mark
        double mark2 = ((number2 / testMark2) * 100);

        //display mark
        System.out.println("you got " + mark2 + "%, good job");
        
        //imput what the test is out of
        System.out.println("please input the amount that the third test was out of");

        // name test percentage
        double testMark3 = input.nextDouble();

        //display precentage
        System.out.println("the test is out of " + testMark3);

        //imput mark
        System.out.println(" please input the amount that you got out of the test ");

        //get amount of test 
        double number3 = input.nextDouble();

        // name mark
        double mark3 = ((number3 / testMark3) * 100);

        //display mark
        System.out.println("you got " + mark3 + "%, good job");
        
        //imput what the test is out of
        System.out.println("please input the amount that the fourth test was out of");

        // name test percentage
        double testMark4 = input.nextDouble();

        //display precentage
        System.out.println("the test is out of " + testMark4);

        //imput mark
        System.out.println(" please input the amount that you got out of the test ");

        //get amount of test 
        double number4 = input.nextDouble();

        // name mark
        double mark4 = ((number4 / testMark4) * 100);

        //display mark
        System.out.println("you got " + mark4 + "%, good job");
        
        //imput what the test is out of
        System.out.println("please input the amount that the fifth test was out of");

        // name test percentage
        double testMark5 = input.nextDouble();

        //display precentage
        System.out.println("the test is out of " + testMark5);

        //imput mark
        System.out.println(" please input the amount that you got out of the test ");

        //get amount of test 
        double number5 = input.nextDouble();

        // name mark
        double mark5 = ((number5 / testMark5) * 100);

        //display mark
        System.out.println("you got " + mark5 + "%, good job");
        
        //get avrage
        double allMark = ((mark5 + mark4 + mark3 + mark2 + mark1) / 5);
        
         //display avrage
        System.out.println("you got an avrage of " + allMark + "%, good job");
        










    }
}
