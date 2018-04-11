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
        // scan
        Scanner input = new Scanner(System.in);
        // Create and repeat the translator
        while (true){

            // Ask for word
            System.out.println("Enter word you would like to translate ");
            // make a string
            String origWord = input.nextLine();
            //create a string
            String translate = " " + origWord;
            //sanitize the input
            origWord = origWord.toLowerCase();
            // check to see if word starts with vowel
            if (origWord.startsWith("a") || 
                    origWord.startsWith("e") || 
                    origWord.startsWith("i") || 
                    origWord.startsWith("o") || 
                    origWord.startsWith("u")) {
                // put in the ub at the end of the word
                String translate2 = "ub" + origWord;
                System.out.println(origWord + " in Ubbi Dubbi is " + translate2);
            } else {
                //count how many letters are in the word 
                int length = translate.length();
                // create a for loop for the translator
                for (int i = 0; i < length; i++) {
                    // Create filter for vowels
                    if (translate.charAt(i) == 'e' || 
                            translate.charAt(i) == 'a' || 
                            translate.charAt(i) == 'i' || 
                            translate.charAt(i) == 'u' || 
                            translate.charAt(i) == 'o') {
                        // if 2 vowels are consecutive only put on ub
                        if (!(translate.charAt(i - 2) == 'e' 
                                || translate.charAt(i - 2) == 'a' 
                                || translate.charAt(i - 2) == 'i' 
                                || translate.charAt(i - 2) == 'u' 
                                || translate.charAt(i - 2) == 'o')) {
                            // create the substring 
                            String start = translate.substring(0, i);
                            String end = translate.substring(i);
                            // Add the ubs
                            translate = start + "ub" + end;
                            // add added length of ubs
                            length = translate.length();
                            // Checks letter for the next 3 positions
                            i = i + 3;
                        }
                    }
                }
                // Output the translated word 
                System.out.println(origWord + " In ubbi dubbi is " + translate + ".");
                //done translating so break the loop
                break;
            }
        }
    }
}
