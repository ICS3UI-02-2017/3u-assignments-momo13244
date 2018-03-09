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
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scan
        Scanner input = new Scanner(System.in);
        
        int playerL = 1;
        int playerA = 1;
        
        while (playerL != 100 ){
            System.out.print( "Enter sum of dice: ");
            
            playerA = input.nextInt();
            
            if (playerA < 12 && playerA > 2){
              
                playerL = (playerL + playerA);
            
                System.out.println("you are now on square: " + playerL);
            
                if (playerL == 9){
                playerL = (playerL + 25);
                }
                if (playerL == 40){
                playerL = (playerL + 24);
                }
                if (playerL == 67){
                playerL = (playerL + 19);
                }
                if (playerL == 54){
                playerL = (playerL - 35);
                }
                if (playerL == 90){
                playerL = (playerL - 42);
                }
                if (playerL == 99){
                playerL = (playerL - 22);
                }  
            }
            
            
            
        }
    }
}
