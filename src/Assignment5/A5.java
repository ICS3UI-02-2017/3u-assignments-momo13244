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
            // sanatize the input
            origWord = origWord.toLowerCase();
            
            // Scan if the word starts with a vowel
            if (origWord.startsWith("a") ||
                    origWord.startsWith("e") || 
                    origWord.startsWith("i") || 
                    origWord.startsWith("o") ||
                    origWord.startsWith("u")) {
                        // add the ub
                        String transWord = ("ub" + origWord);
                        System.out.println(transWord);
            }else{
                // Look for a vowel in the work
                int length = origWord.length();
                // make a for loop to check the character
                for (int i = 0; i < length; i++){
                    // check for vowels
                    if (origWord.charAt(i) == 'a' ||
                            origWord.charAt(i) == 'e' ||
                            origWord.charAt(i) == 'i' ||
                            origWord.charAt(i) == 'o' ||
                            origWord.charAt(i) == 'u'){
                    // break the word apart at the vowel
                        String start = origWord.substring(0, i);
                        String end = origWord.substring(i);
                                              
                        String transword = (start + "ub" + end);
                        System.out.println(transword);
                        
                        break;
                }
                }
            }           
        } 
    }
}
