/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;

import java.util.Scanner;

/**
 *
 * @author elmam0030
 */
public class A5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Create and repeat the translator
        while (true){
            // ask for the word and store it
            System.out.println("Enter the word you would like to translate");
            String origWord = input.nextLine();
            // sanatize the input\
            origWord = origWord.toLowerCase();
            
            // Scan if the word starts with a vowel
            if (origWord.startsWith("a") ||
                    origWord.startsWith("e") || 
                    origWord.startsWith("i") || 
                    origWord.startsWith("o") ||
                    origWord.startsWith("u")); {
                        // add the ub
                        origWord.startsWith("Ub");
                        System.out.println(origWord);
            }
                
        }
        
        
        
        
    }
}
