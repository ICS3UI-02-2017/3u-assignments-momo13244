/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quizzes;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author Mohamad
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City quiznos = new City();
        
        RobotSE stank = new RobotSE(quiznos, 4, 0, Direction.EAST);
        
        // create the staircase
        new Wall(quiznos, 4, 2, Direction.WEST);
        new Wall(quiznos, 4, 2, Direction.NORTH);
        new Wall(quiznos, 3, 3, Direction.WEST);
        new Wall(quiznos, 3, 3, Direction.NORTH);
        new Wall(quiznos, 2, 4, Direction.WEST);
        new Wall(quiznos, 2, 4, Direction.NORTH);
        new Wall(quiznos, 2, 5, Direction.EAST);
        new Wall(quiznos, 2, 5, Direction.NORTH);
        new Wall(quiznos, 3, 6, Direction.EAST);
        new Wall(quiznos, 3, 6, Direction.NORTH);
        new Wall(quiznos, 4, 7, Direction.EAST);
        new Wall(quiznos, 4, 7, Direction.NORTH);
        
        // create the lights
        new Thing(quiznos, 4, 1);
        new Thing(quiznos, 3, 2);
        new Thing(quiznos, 2, 3);
        new Thing(quiznos, 1, 4);
        
        // make him move up the staircase and pick up the lights
        stank.move();
        // pick up the first light
        stank.pickThing();
        stank.turnLeft();
        stank.move();
        stank.turnRight();
        stank.move();
        stank.pickThing();
        stank.turnLeft();
        stank.move();
        stank.turnRight();
        stank.move();
        stank.pickThing();
        stank.turnLeft();
        stank.move();
        stank.turnRight();
        stank.move();
        stank.pickThing();
        stank.move();
        // Make him put down the lights and walk down the staircase
        stank.putThing();
        stank.move();
        stank.turnRight();
        stank.move();
        stank.putThing();
        stank.turnLeft();
        stank.move();
        stank.turnRight();
        stank.move();
        stank.putThing();
        stank.turnLeft();
        stank.move();
        stank.turnRight();
        stank.move();
        stank.putThing();
        stank.turnLeft();
        stank.move();
        
        
        
    }
    
}
