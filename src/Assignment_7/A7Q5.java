/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_7;

import java.util.Scanner;

/**
 *
 * @author Mohamad
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scan
        Scanner input =  new Scanner(System.in);
        
        // ask for how many lines will be printed
        System.out.println("How many lines would you like to be printed? ");
        
        // store the number of lines
        int numOfLines = input.nextInt();
        
        // return the number of lines to chaotic
        chaotic(numOfLines);
    }
    
    public static void chaotic(int numOfLines){
        
        
        // create for loop for the chaotic procedure
       for(int i = 0; i < numOfLines; i++){
           
           // create the random number generator
          int randNum = (int)(Math.random()*(5 - 1 + 1))+ 1;

           // if the number equals 1 print 1 asteriks and so on
           if(randNum == 1){
               System.out.println("*");
           }
           if(randNum == 2){
               System.out.println("**");
           }
           if(randNum == 3){
               System.out.println("***");
           }
           if(randNum == 4){
               System.out.println("****");
           }
           if(randNum == 5){
               System.out.println("*****");
           }
       } 
    }
    
}
