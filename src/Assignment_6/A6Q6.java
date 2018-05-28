/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_6;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author elmam0030
 */
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scan
        Scanner input = new Scanner(System.in);
        
        // ask for the size of the classroom
        System.out.println("What is the size of the classroom?");
        
        // get number
        int i = input.nextInt();
                 
        // create the classroom
        double[] room = new double[i];
        // ask for the marks
        System.out.println("enter the marks");
        // make for loop to collect the marks
        for(int g = 0; g < room.length; g++){            
            room[g] = input.nextDouble();
        }
        // sort the array from lowest to highest
        Arrays.sort(room);
        // create a double for the sum
        double sum = 0;
        // create for loop to add all marks together
        for(int g = 0; g < room.length; g++){            
            sum = sum + room[g];
        }
        // divide marks sum by the amount of marks
        sum = sum/i;
        // display all marks
        System.out.println("The lowest mark in the class is " + room[0] + "%");
        System.out.println("The highest mark in the class is " + room[i - 1] + "%");
        System.out.println("The class average is " + sum + "%");
   
    }
}
