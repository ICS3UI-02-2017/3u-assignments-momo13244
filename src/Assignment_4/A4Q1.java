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
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scan
        Scanner input = new Scanner(System.in);
        // ask for their name
        System.out.println("Hey, what is your name?");
        // read their name
        String name = input.nextLine();
        // greet
        System.out.println("hello " + name + " how was your day?");
        
    }
    
}
