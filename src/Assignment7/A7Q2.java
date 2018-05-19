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
public class A7Q2 {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scan
        Scanner input = new Scanner(System.in);
        
        // ask for the grade
        System.out.println("Enter the average: ");
        
        // Store the grade
        double grad = input.nextDouble();
        
        // initiate the procedure
        examGrade(grad);
    }
    
    public static void examGrade(double grad){
        
                        
        // create filter for grade
        if (grad < 50){
            
            System.out.println("Your mark was an " + "F"); 
        }
        if (grad >= 50 && grad < 60){
            System.out.println("Your mark was an " + "D");
        }
        if (grad >= 60 && grad < 70){
            System.out.println("Your mark was an " + "C");
        }
        if (grad >= 70 && grad < 80){
            System.out.println("Your mark was an " + "B");
        }
        if (grad >= 80){
            System.out.println("Your mark was an " + "A");           
        }
        
    }
    
}
