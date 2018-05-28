/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_4;

import java.util.Scanner;

/**
 *
 * @author Mohamad
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scan
        Scanner input = new Scanner(System.in);
        // ask for the prices
        System.out.println("How much does the food for prom cost?");
        // store the prices
        int price1 = input.nextInt();
                
        System.out.println("How much does the DJ cost?");
        int price2 = input.nextInt();
        
        System.out.println("How much does it cost to rent the hall?");
        int price3 = input.nextInt();
      
        System.out.println("How much does decorations cost?");
        int price4 = input.nextInt();
        
        System.out.println("How much does it cost for staff?");
        int price5 = input.nextInt();
        
        System.out.println("How much for miscellaneous costs?");
        
        int price6 = input.nextInt();
        
        // calculate the prices
        int end = (price1 + price2 + price3 + price4 + price5 + price6);
        
        int end2 = (end / 35);
        // print final statement
        System.out.println("The total cost is " + end + ". You will need to sell " + end2 + " tickets to break even.");
        
    }
    
}
