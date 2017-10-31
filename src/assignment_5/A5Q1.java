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
       //start at 0
        int a = 0;
        //while the word is greater than zero
        while(a < 1){
        
         System.out.print("Please enter your word: ");
        //get word
            Scanner words = new Scanner(System.in);

            String word = words.nextLine();
            //a way to end the program
            String ex = "EXIT";
            //brigadoon song
            String Brigadoon = "Brigadoon";
            
            
            if(word.equals(Brigadoon)){
                //system pints goodbye and ensds
                System.out.print("ubOh Brubigubaduboon yubour ubat schubool, wube thubink yubour vubery awubesubomube yubes wube thubink yubour cubool uboh Brubigubaduboon, ubits thube plubacube tubo bube, cubausube I rubespubect yubou uband yubou rubespubect mube, uboh Brubigubaduboon");
                
               break;
                
            }
            
            
            if(word.equals(ex)){
                //system pints goodbye and ensds
                System.out.print("goodbye");
                
               break;
                
            }
            //empty string
            String translate = "";
            
            Boolean foundvowel = false; 
            //vowel counter
            for(int i = 0; i < word.length(); i++){
                
                // look for a vowel at spot i 
                if((word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u')  && foundvowel == false){
                    //add ub
                  translate = translate + "ub";
                  
                  translate = translate + word.charAt(i);
                  
                  foundvowel = true; 
                  
                  
                }else{
                    //skip after 2 vowels
                    if((word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') && foundvowel == true){
                        translate = translate + word.charAt(i);
                    }else{
                        translate = translate + word.charAt(i);
                        foundvowel = false;
                    }
                }
            
            
    }
            
            System.out.print(translate);
            a = a +1;
            
        }
        
}
}