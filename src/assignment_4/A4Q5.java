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

        //display precentage
        System.out.println("welcome" + name  );
        
        
           //imput what the test is out of
        System.out.println("please input the amount that the test was out of");
        
        //get percentage
        Scanner input1 = new Scanner(System.in);

        // name test percentage
        String test1 = input.nextLine();

        
        
        //display precentage
        System.out.println("the test if out of" + test1  );
        
        //imput mark
        System.out.println("please input the amount that you got out of the test");
        
        //get mark
        Scanner input2 = new Scanner(System.in);
        
        //get amount of test 
        double number = input.nextDouble();
        
        // name mark
         double mark1 = Math.ceil((number / number )*100);

        //display mark
        System.out.println("you got" + mark1 + " good job");

        
    }
}

