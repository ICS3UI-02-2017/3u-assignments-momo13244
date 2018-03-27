/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import java.util.Scanner;

/**
 *
 * @author elmam0030
 */
public class UbbiDubbi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true){
            // get the word to translate
            System.out.println("Enter word to translate");
            String origWord = input.nextLine();
            // sanitize the input
            origWord = origWord.toLowerCase();
            
            // do we start with a vowel
            if(origWord.startsWith("a") || origWord.startsWith("e") || origWord.startsWith("i") || origWord.startsWith("o") || origWord.startsWith("u")){
                // stick ay on the end
                String transWord = origWord + "ay";
                System.out.println(origWord + " in pig latin is " + transWord);
            }else{
                // walk down the world looking for the vowel
                int Length = origWord.length();
                // use a for loop to go through the character
                for(int i =0; i < Length; i++){
                    // look at the character. at postion i is it a vowel?
                    if(origWord.charAt(i) == 'a' || origWord.charAt(i) == 'e' || origWord.charAt(i) == 'i' || origWord.charAt(i) == 'o' || origWord.charAt(i) == 'u'){
                        //  i is the position of the vowel
                        // break the word at the vowel
                        String start = origWord.substring(0, i);
                        String end = origWord.substring(i);
                        
                        // compute translated word
                        String transword = end + start + "ay";
                        System.out.println(origWord + "in pig latin" + transword);
                        
                        // done looking so stop the for loop 
                        break;
                    }
                }
            }
        }
    }
}
