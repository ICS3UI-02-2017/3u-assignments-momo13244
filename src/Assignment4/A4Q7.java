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
        // add the integers
        int playerL = 1;
        int playerA = 1;
        
        // make the game
        while (playerL != 100 ){
            // ask for sum of dice
            System.out.print( "Enter sum of dice: ");
            // get the sum
            playerA = input.nextInt();
            // start game
            if (playerA <= 12 && playerA >= 2){
                // add sum of dice to location of player
                if (playerL < 100){
                playerL = (playerL + playerA);
                // display location of player
                System.out.println("you are now on square: " + playerL);
                // add snakes and ladders
                if (playerL == 9){
                playerL = (playerL + 25);
                System.out.println("you are now on square: " + playerL);
                }
                if (playerL == 40){
                playerL = (playerL + 24);
                System.out.println("you are now on square: " + playerL);
                }
                if (playerL == 67){
                playerL = (playerL + 19);
                System.out.println("you are now on square: " + playerL);
                }
                if (playerL == 54){
                playerL = (playerL - 35);
                System.out.println("you are now on square: " + playerL);
                }
                if (playerL == 90){
                playerL = (playerL - 42);
                System.out.println("you are now on square: " + playerL);
                }
                if (playerL == 99){
                playerL = (playerL - 22);
                System.out.println("you are now on square: " + playerL);
                }  
                // if player is on square 100 end the game.
                if (playerL == 100){
                System.out.println("you win!");
                break;
            }
                }
            if (playerA > 12 || playerA < 2){
                System.out.println("You quit!");
                break;
                }           
            
        }
    }
    }
    
}
