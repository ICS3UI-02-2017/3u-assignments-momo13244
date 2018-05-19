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
public class A7Q7 {

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
        firstDigit(number);
        
        // output the number
        System.out.println("The first digit is: " + firstDigit(number));
    }
    
    public static int firstDigit(int number){
  
        // turn the integer into a postiive if it is negative
        if (number < 0 ){
            number = number * -1;
        }
        
        // divide the number by 10 until it there is only 1 number left
        while (number >= 10){
            number =  number / 10;
        }
        
        // return the number to the main method
        return number;       
    }
    
}
