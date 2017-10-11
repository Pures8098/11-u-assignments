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
public class A4Q4 {

/**
 *
 * @author Pures8098
 */


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


        //say hello and imput amenitie
        System.out.println("Hello welcome to the automatic prom expenses to tickets converter");

        //say hello and imput amenitie
        System.out.println("please enter the amount of money spent on food");

        //get amenitie
        Scanner input = new Scanner(System.in);

        //get amount of money 
        double number = input.nextDouble();

        //calculate ticket
        double ticket = Math.ceil(number / 35);

        //output the variable to the screen
        System.out.println(" For food you will need " + ticket + " tickets to break even ");




        

        //say hello and imput amenitie
        System.out.println("please enter the amount of money spent on a DJ ");

        //get amenitie
        Scanner input2 = new Scanner(System.in);

        //get amount of money 
        double number3 = input.nextDouble();

        //calculate ticket
        double ticket2 = Math.ceil(number3 / 35);

        //output the variable to the screen
        System.out.println(" For a DJ  you will need " + ticket2 + " tickets to break even ");



      
        //say hello and imput amenitie
        System.out.println("please enter the amount of money spent on renting the hall");

        //get amenitie
        Scanner input3 = new Scanner(System.in);

        //get amount of money 
        double number4 = input.nextDouble();

        //calculate ticket
        double ticket3 = Math.ceil(number4 / 35);

        //output the variable to the screen
        System.out.println(" For renting the hall you will need " + ticket3 + " tickets to break even ");


        

        //say hello and imput amenitie
        System.out.println("please enter the amount of money spent on decorations");

        //get amenitie
        Scanner input4 = new Scanner(System.in);

        //get amount of money 
        double number5 = input.nextDouble();

        //calculate ticket
        double ticket4 = Math.ceil(number5 / 35);

        //output the variable to the screen
        System.out.println(" For decorations you will need " + ticket4 + " tickets to break even ");


        //say hello and imput amenitie
        System.out.println("please enter the amount of money spent on staff");

        //get amenitie
        Scanner input5 = new Scanner(System.in);

        //get amount of money 
        double number7 = input.nextDouble();

        //calculate ticket
        double ticket6 = Math.ceil(number7 / 35);

        //output the variable to the screen
        System.out.println(" For staff you will need " + ticket6 + " tickets to break even ");


       
        //say hello and imput amenitie
        System.out.println("please enter the amount of money spent on miscellaneous costs");

        //get amenitie
        Scanner input6 = new Scanner(System.in);

        //get amount of money 
        double number6 = input.nextDouble();

        //calculate ticket
        double ticket5 = Math.ceil(number6 / 35);

        //output the variable to the screen
        System.out.println(" For miscellaneous costs you will need " + ticket5 + " tickets to break even ");


        
        //calculate all tickets
        double allTicket = Math.ceil(ticket + ticket2 + ticket3 + ticket4 + ticket5 + ticket6);

        //output the totsl to the screen
        System.out.println(" For the entire total you will need " + allTicket + "  tickets to break even ");
    }
}
