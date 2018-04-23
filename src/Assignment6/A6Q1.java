/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author elmam0030
 */
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scan
        Scanner input = new Scanner(System.in);
        
        // ask for number of students
        System.out.println("How many students are in the class?");       
        int i = input.nextInt();
        
        // make the array for the averages
        double[] averages = new double[i];
        // ask for the averages
        System.out.println("What are the averages?");       
        // create a forloop to store the averages
        for(int g = 0; g < averages.length; g++){
            averages[g]  = input.nextDouble();
        }
        // calculate the numbers
        double sum = 0;
        
        for(int g = 0; g < averages.length; g++){
            // take the average from one spot
            double average = averages[g];
            // add it to the sum
            sum = sum + average;
        }
        // divide the sum by the amount of students
        sum = sum / i;
        
        // display the average        
        System.out.println("The class average is " + sum);
    }
}
