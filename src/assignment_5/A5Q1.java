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
       
        int x = 0;
        
        while(x < 1){
        
         System.out.print("Please enter your word: ");

            Scanner words = new Scanner(System.in);

            String word = words.nextLine();
            
            String ex = "EXIT";
            
            if(word.equals(ex)){
                
                System.out.print("goodbye");
                
               break;
                
            }
            
            String translate = "";
            
            Boolean foundvowel = false; 
            
            for(int i = 0; i < word.length(); i++){
                
                // look for a vowel at spot i 
                if((word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u')  && foundvowel == false){
                    
                  translate = translate + "ub";
                  
                  translate = translate + word.charAt(i);
                  
                  foundvowel = true; 
                  
                  
                }else{
                    
                    if((word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') && foundvowel == true){
                        translate = translate + word.charAt(i);
                    }else{
                        translate = translate + word.charAt(i);
                        foundvowel = false;
                    }
                }
            
            
    }
            
            System.out.print(translate);
            x = x +1;
            
        }
        
}
}