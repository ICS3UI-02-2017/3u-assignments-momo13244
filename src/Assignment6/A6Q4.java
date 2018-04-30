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
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Scan
        Scanner input = new Scanner(System.in);
        
        // ask for the marks
        System.out.println("Enter in 10 marks");
                 
        // create the array
        double[] mark = new double[10];
        
        // create for loop to get all marks
        for(int g = 0; g < mark.length; g++){            
            mark[g] = input.nextDouble();
        }
        // create a for loop
        for(int i = 0; i < 10; i++){
            // create a another for loop for x+1
            for(int g = i+1; g < 10; g++){
                // assign spots of arrays to doubles
            double X = mark[i];
            double Y = mark[g];
            // if spotx is greater than spoty, switch them
            if(X > Y){
                mark[g] = X;
                mark[i] = Y;
            }
        }            
        }
        // display all the numbers
        System.out.print("The marks in ascending order are: ");
        for(int g = 0; g < mark.length; g++){            
            System.out.print(mark[g] + " ");
        }
    }
}
