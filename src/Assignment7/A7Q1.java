/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 *
 * @author Mohamad
 */
public class A7Q1 {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scan
        Scanner input = new Scanner(System.in);
        
        // Ask for radius
        System.out.println("Enter the radius: ");
        
        // get the number
        double rad = input.nextDouble();
        
        // output the area of the circle
        System.out.println("The area of the circle is: " + (circleArea(rad)));
    }
    
    public static double circleArea(double rad){
        
        // calculate
        double circle = Math.pow(rad, 2);
        // multiply PI by the power radius
        circle = Math.PI * circle;
        // return double
        return circle;
    }
    
}
