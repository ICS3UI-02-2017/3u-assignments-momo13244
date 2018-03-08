/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author elmam0030
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scan
        Scanner input = new Scanner(System.in);  
        // speak
        System.out.println("Please enter in 4 numbers on seperate lines");
        
        double line1 = input.nextDouble();
        
        double line2 = input.nextDouble();
        
        double line3 = input.nextDouble();
        
        double line4 = input.nextDouble();
        
        System.out.println("Your numbers were " + line1 + ", " + line2 + ", " + line3 + ", " + "and " + line4);
              
        
        
    }
}
