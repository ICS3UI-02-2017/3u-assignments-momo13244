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
public class A7Q4 {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scan
        Scanner input = new Scanner(System.in);
        
        // ask for principle amount
        System.out.println("How much was deposited in the bank?");
        
        // Store the principle
        double principle = input.nextDouble();
        
        // ask for the interest rate
        System.out.println("How much is the interest rate?");
        
        // store the interest rate
        double interestRate = input.nextDouble();
        
        // ask for the amount of years
        System.out.println("How long where the money in the bank for?");
        
        // store the amount of years
        int year = input.nextInt();
        
        // output the compound amount of money
        System.out.println("The balance is: " + (compoundInterest(principle, interestRate, year)));
    }
    
    public static double compoundInterest(double principle, double interestRate, int year){
        
        // calculate
        double balance = 1 + interestRate;
        balance = Math.pow(balance, year);
        balance = balance * principle;
        return balance;
               
    }
}
