/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_6;

/**
 *
 * @author Pures8098
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create array
        int a[] = new int[1001];
        //loop 1000 times for prime numbers
        for (int i = 2; i < a.length; i++) {
            boolean primeNum = true;
            a[i] = i;
            //check if prime number
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primeNum = false;
                    break;
                }
            }
            //get prime numbers
            if (primeNum) {
                //print prime numbers 
                System.out.println("these are the prime numbers ");
                System.out.println(i);
            }
        }
    }
}