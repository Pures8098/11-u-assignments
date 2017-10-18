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
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //say hello 
        System.out.println("hello and welcome to snakes and ladders");
        System.out.println("please input your roll");

        //get name
        Scanner input = new Scanner(System.in);

        // name, roll
        int roll = input.nextInt();
//dice numbers
        while (roll < 2 || roll > 12) {

            System.out.println("roll again");
            roll = input.nextInt();

        }
        //counter for game tou count up to 100 
        for (int count = 1 + roll; count != 100; count = count + roll) {

            System.out.println("you got a " + count);
            roll = input.nextInt();
            while (roll < 2 || roll > 12) {

                System.out.println("sorry you quit");
                roll = input.nextInt();

            }
            //snake
            if (count == 54) {
                int count2 = input.nextInt();
                count2 = count - 35;
                count = count2;
                System.out.println("you got a " + count);
            }
            //snake
            if (count == 90) {
                int count3 = input.nextInt();
                count3 = count - 42;
                count = count3;
                System.out.println("you got a " + count);
            }
            //snake
            if (count == 99) {
                int count4 = input.nextInt();
                count4 = count - 22;
                count = count4;
                System.out.println("you got a " + count);
            }
            //ladder
            if (count == 9) {
                int count5 = input.nextInt();
                count5 = count + 25;
                count = count5;
                System.out.println("you got a " + count);
            }
            //ladder
            if (count == 40) {
                int count6 = input.nextInt();
                count6 = count + 24;
                count = count6;
                System.out.println("you got a " + count);
            }
            //ladder
            if (count == 67) {
                int count7 = input.nextInt();
                count7 = count + 19;
                count = count7;
                System.out.println("you got a " + count);
            }
        }
        //You won
        System.out.println("you win!");
    }
}