/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author elmam0030
 */
public class ForLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        City Koonk = new City();
        
        RobotSE Gargon = new RobotSE(Koonk, 1, 1, Direction.EAST);
        
        // counted while loop
        int numberOfMoves = 5;
        // if there are still moves to do
        while(numberOfMoves > 0){
            Gargon.move();
            numberOfMoves = numberOfMoves - 1;
        }
        
        Gargon.turnAround();
        
        // counting the other way
        numberOfMoves = 0;
        while (numberOfMoves < 5){
            Gargon.move();
            numberOfMoves = numberOfMoves + 1;
        }
        
    }
}
