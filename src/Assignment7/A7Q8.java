/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 *
 * @author Mohamad
 */
public class A7Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scan
        Scanner input =  new Scanner(System.in);
        
        // ask for the number
        System.out.println("Enter a number that you would like to be checked if it is odd or even:");
        
        // store the number
        int number = input.nextInt();
        
        // return the integer to the method
        allDigitsOdd(number);
        
        // output the number
        System.out.println("");
    }
    
    public static int allDigitsOdd(int number){
        
        // if number is even print false
        if ((number % 2) == 0 ){
            System.out.println("False");
        }
        // if then number is odd then print true
        if ((number % 2) != 0){        
            System.out.println("True");  
        }       
        // return the number to the main method
        return number;       
    }
    
}
