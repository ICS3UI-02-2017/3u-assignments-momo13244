/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_4;

import java.util.Scanner;

/**
 *
 * @author Mohamad
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scan
        Scanner input = new Scanner(System.in);
        // ask for measurement
        System.out.println("Please enter the measurement in inches you wish to convert");
        // read measurement
        double inches = input.nextInt();
        
        // make the calculator
        double answer = (inches * 2.54);
        
        System.out.println("Your Inches converted is " + answer + " cm");
        
        
        
    }
    
}
