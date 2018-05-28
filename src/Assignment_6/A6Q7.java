/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_6;

import java.util.Scanner;

/**
 *
 * @author elmam0030
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scan
        Scanner input = new Scanner(System.in);
        
        // create the array
        int[] sieve = new int[1000];
        
        // fill the array with numbers
        for(int i = 0; i < sieve.length; i++){
            sieve[i] = i;
        }
        
        // create for loop for the sieve
        for(int g = 2; g < sieve.length; g++){
            // create for loop for the numbers to be multiplied with the prime
            for(int i = 2; i < 1000; i++){
                // multiply all numbers with the prime
                int o = i * g;
                
                // once the number hits 1000 break loop
                if (o >= 1000){
                    break;
                }
                // all numbers that are not prime are set to 0
                sieve[o] = 0;
            }           
        }
        // print the output statement
        System.out.println("All the prime numbers from 1 to 1000 are");
        // create for loop for the outputing of numbers
        for(int i = 0; i < sieve.length; i++){
            // output all the numbers besides the ones that are set to 0 (non-prime numbers)
            if(sieve[i] != 0){
            System.out.print(", " + sieve[i]);  
            }
            
        }  
        
    }
}
