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
public class A7Q3 {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scan
        Scanner input = new Scanner(System.in);
        
        // Ask for number
        System.out.println("Enter the factoring number: ");
        
        // store the number
        int factoor = input.nextInt();
        
        // initiate the procedure
        factors(factoor);
    }
    
    public static void factors(int factoor){
        
        // create a for loop to factor
        for(int i = 1; i < factoor; i++){
            // filter all numbers that have a remainder that isnt 0
            if ((factoor % i) == 0){
                // print out every number that had a remainder of 0
                System.out.print(i + ", ");
            }
        }
        System.out.print(factoor);
    }
    
}
