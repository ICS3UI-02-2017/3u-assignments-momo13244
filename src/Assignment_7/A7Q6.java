/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_7;

import java.util.Scanner;

/**
 *
 * @author Mohamad
 */
public class A7Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scan
        Scanner input =  new Scanner(System.in);
        
        // ask for the number
        System.out.println("What is the number you would like to get the last digit of?");
        
        // store the number
        int number = input.nextInt();
        
        // return the integer to the method
        lastDigit(number);
        
        // output the number
        System.out.println("The last digit is: " + lastDigit(number));
    }
    
    public static int lastDigit(int number){
  
        // get the qoutient of 10 from the number
        number = Math.abs(number % 10);
        // return the number to the main method
        return number;       
    }
    
}
