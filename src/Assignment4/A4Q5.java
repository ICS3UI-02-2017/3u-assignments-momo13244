/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author Mohamad
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scan
        Scanner input = new Scanner(System.in);
        // ask for name
        System.out.println("what is your name");       
        String name = input.nextLine();
        // ask for what it was out of
        
        System.out.println("What was the first test out of?");
        // read the number
        double test1 = input.nextDouble();
        // ask for the mark
        System.out.println("What mark did you get?");
        double test1a = input.nextDouble();
        
        
        // ask for what it was out of
        System.out.println("What was the second test out of?");
        // read the number
        double test2 = input.nextDouble();
        // ask for the mark
        System.out.println("What mark did you get?");
        double test2a = input.nextDouble();
        
        
        // ask for what it was out of
        System.out.println("What was the third test out of?");
        // read the number
        double test3 = input.nextDouble();
        // ask for the mark
        System.out.println("What mark did you get?");
        double test3a = input.nextDouble();
        
        
        // ask for what it was out of
        System.out.println("What was the fourth test out of?");
        // read the number
        double test4 = input.nextDouble();
        // ask for the mark
        System.out.println("What mark did you get?");
        double test4a = input.nextDouble();
        
        
        // ask for what it was out of
        System.out.println("What was the fifth test out of?");
        // read the number
        double test5 = input.nextDouble();
        // ask for the mark
        System.out.println("What mark did you get?");
        double test5a = input.nextDouble();
        
        // calculate
        double test1m = (test1a / test1);
        double test1mm = (test1m * 100);
        
        double test2m = (test2a / test2);
        double test2mm = (test2m * 100);
        
        double test3m = (test3a / test3);
        double test3mm = (test3m * 100);
        
        double test4m = (test4a / test4);
        double test4mm = (test4m * 100);
        
        double test5m = (test5a / test5);
        double test5mm = (test5m * 100);
        
        double mark = (test1mm + test2mm + test3mm + test4mm + test5mm);
        double mark2 = (mark / 5);      
        
        System.out.println("Test Scores For " + name);        
        System.out.println("Test 1 " + test1mm + "%");
        System.out.println("Test 2 " + test2mm + "%");
        System.out.println("Test 3 " + test3mm + "%");
        System.out.println("Test 4 " + test4mm + "%");
        System.out.println("Test 5 " + test5mm + "%");
        
        System.out.println("Average: " + mark2 + "%");
        
    }
    
}
