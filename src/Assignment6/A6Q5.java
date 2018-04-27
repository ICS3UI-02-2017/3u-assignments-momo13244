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
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Scan
        Scanner input = new Scanner(System.in);
        
        // ask for how many marks will be recorded
        System.out.println("How many marks will be recorded?");
        
        // collect the number
        int fun = input.nextInt();
        
        // ask for the marks
        System.out.println("Enter in the marks");
                 
        // create the array
        double[] mark = new double[fun];
        
        // create for loop to get all marks
        for(int g = 0; g < mark.length; g++){            
            mark[g] = input.nextDouble();
        }
        // create a for loop
        for(int i = 0; i < mark.length; i++){
            
            // create a another for loop for x+1
            for(int g = i+1; g < mark.length; g++){
                
            // assign spots of arrays to doubles
            double spotX = mark[i];
            double spotY = mark[g];
            
            // if spotx is greater than spoty, switch them
            if(spotX > spotY){
                mark[g] = spotX;
                mark[i] = spotY;
                
                }
            }            
        }
        
        
        // display all the numbers
        System.out.print("The marks in ascending order are: ");
        
        
        for(int g = 0; g < mark.length; g++){ 
            
            System.out.print(mark[g] + " ");
        }
        
        int non = mark.length / 2;
        System.out.println(non);
        
        
        
        
    }
}
