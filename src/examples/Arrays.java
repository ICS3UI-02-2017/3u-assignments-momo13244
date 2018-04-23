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
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner for input
        Scanner input = new Scanner(System.in);
        
        // Make an array to store expenses
        double[] expenses = new double[6];
        
        // Let the user know to get the costs
        System.out.println("please enter the six costs for the prompt");
        // use a for loop for input
        for (int i =0; i < expenses.length; i++){
            expenses[i] = input.nextDouble();
        }
        
        // adding all the expenses
        double sum = 0;
        for (int i = 0; i < expenses.length; i++) {
            // get the expense
            double expense = expenses[i];
            // add it to the sum
            sum = sum + expense;    
        }
        // output stuff
        System.out.println("prom costs " + sum);
        // take the sum divide by 35, always round
        
        
       
    }
}
