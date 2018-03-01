/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author Mohamad
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City woah2 = new City();
        // create the robot
        RobotSE momo = new RobotSE(woah2, 1, 1, Direction.EAST);
        //turn on the counter
        woah2.showThingCounts(true);       
        // create the pile of things
        new Thing(woah2, 1, 1);
        new Thing(woah2, 1, 1);
        new Thing(woah2, 1, 1);
        new Thing(woah2, 1, 1);
        new Thing(woah2, 1, 1);
        new Thing(woah2, 1, 1);
        new Thing(woah2, 1, 1);
        new Thing(woah2, 1, 1);
        new Thing(woah2, 1, 1);
        new Thing(woah2, 1, 1);
        
        // create the integer
        int numberOfMoves = 10;
        
        // Make momo moves the things      
        while (numberOfMoves > 0){
            momo.pickThing();
            momo.move();
            momo.putThing();
            momo.turnAround();
            momo.move();
            momo.turnAround();
            // make him stop when the things are moved
            numberOfMoves = numberOfMoves - 1;       
    }
        // make him move ontop the pile
        momo.move();
        
    }
}
