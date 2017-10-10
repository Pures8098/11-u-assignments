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
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //say hello please write your name here
        System.out.println("Hello please write your name here:");

        //create a Scanner for input
        Scanner input = new Scanner(System.in);

        // name variable
        String firstName = input.nextLine();

        //output the variable to the screen
        System.out.println("Hello " + firstName + " how are you today");
    }
}
