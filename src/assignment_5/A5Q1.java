/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_5;

import java.util.Scanner;

/**
 *
 * @author Pures8098
 */
public class A5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println("please enter a word");

        String word = input.nextLine();

        word = word.toLowerCase();

        String translated = "";

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == 'a' || word.charAt(i) == ('e') || word.charAt(i) == ('i') || word.charAt(i) == ('o') || word.charAt(i) == ('u')) {

                String front = word.substring(0, i);

                String ending = word.substring(i);

                translated = front + "ub" + ending;
                        
                System.out.println("the Ubbi Dubbi word is " + translated);


            }
        }
    }
}