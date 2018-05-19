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
               
    }
    
    public static int allDigitsOdd(int number){
        
        // if the number ends with an even number then it is false
        if ((number % 2) == 0){
            System.out.println("False");
        }
        
        // filter the number by dividing it by ten and checking each number if it even then there will be no remainder
        if ((number % 2) != 0){           
           while (number > 1){
           // remove the last digit by dividing by ten
           number = number / 10;
                // if the number is even then print false and break the loop
                if ((number % 2) == 0){
                    System.out.println("False");
                    break;           
                }
            }
            // since the number hase been checked for even numbers then it is true
            System.out.println("True");
        }
        return 0;
    }
}
