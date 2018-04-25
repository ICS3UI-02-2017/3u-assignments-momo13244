/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

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
        
        System.out.println("enter the marks");
        
        for(int g = 0; g < room.length; g++){            
            room[g] = input.nextDouble();
        }
        
        Arrays.sort(room);
        double sum = 0;
        for(int g = 0; g < room.length; g++){            
            sum = sum + room[g];
        }
        
        sum = sum/i;
        
        System.out.println("The lowest mark in the class is " + room[0]);
        System.out.println("The highest mark in the class is " + room[i]);
        System.out.println("The class average is " + room[i]);
   
    }
}
