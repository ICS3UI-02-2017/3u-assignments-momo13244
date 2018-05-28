/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_6;

import java.util.Scanner;

/**
 *
 * @author Mohamad
 */
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scan
        Scanner input = new Scanner(System.in);
        // ask for number of people
        System.out.println("How many heights will be recorded?");
        // store number into integer       
        int i = input.nextInt();  
        
        // create array to store heights
        double[] heights = new double[i];
        // ask for heights
        System.out.println("What are the heights? In centimetres please.");
        // create a loop to input heights
        for(int g = 0; g < heights.length; g++){
            heights[g] = input.nextDouble();
        }
        // create a forloop
        for(int g = 0; g < heights.length; g++){
            // if the height is above 170 print the number
            if(heights[g] > 170){
                System.out.print(heights[g] + "  ");               
            }
        }     
    }    
}
