/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author Mohamad
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create the city
        City woah4 = new City();
        // create the robot
        RobotSE momo = new RobotSE(woah4, 3, 3, Direction.SOUTH);
        
        // create the squares
        new Wall(woah4, 1, 1, Direction.WEST);
        new Wall(woah4, 2, 1, Direction.WEST);
        new Wall(woah4, 1, 2, Direction.NORTH);
        new Wall(woah4, 2, 2, Direction.EAST);
        new Wall(woah4, 1, 1, Direction.NORTH);
        new Wall(woah4, 2, 2, Direction.SOUTH);
        new Wall(woah4, 1, 2, Direction.EAST);
        new Wall(woah4, 2, 2, Direction.SOUTH);
        new Wall(woah4, 2, 1, Direction.SOUTH);
        
        new Wall(woah4, 1, 4, Direction.WEST);
        new Wall(woah4, 2, 4, Direction.WEST);
        new Wall(woah4, 1, 5, Direction.NORTH);
        new Wall(woah4, 2, 5, Direction.EAST);
        new Wall(woah4, 1, 4, Direction.NORTH);
        new Wall(woah4, 2, 5, Direction.SOUTH);
        new Wall(woah4, 1, 5, Direction.EAST);
        new Wall(woah4, 2, 5, Direction.SOUTH);
        new Wall(woah4, 2, 4, Direction.SOUTH);
        
        new Wall(woah4, 4, 4, Direction.WEST);
        new Wall(woah4, 5, 4, Direction.WEST);
        new Wall(woah4, 4, 5, Direction.NORTH);
        new Wall(woah4, 5, 5, Direction.EAST);
        new Wall(woah4, 4, 4, Direction.NORTH);
        new Wall(woah4, 5, 5, Direction.SOUTH);
        new Wall(woah4, 4, 5, Direction.EAST);
        new Wall(woah4, 5, 5, Direction.SOUTH);
        new Wall(woah4, 5, 4, Direction.SOUTH);
        
        new Wall(woah4, 4, 1, Direction.WEST);
        new Wall(woah4, 5, 1, Direction.WEST);
        new Wall(woah4, 4, 2, Direction.NORTH);
        new Wall(woah4, 5, 2, Direction.EAST);
        new Wall(woah4, 4, 1, Direction.NORTH);
        new Wall(woah4, 5, 2, Direction.SOUTH);
        new Wall(woah4, 4, 2, Direction.EAST);
        new Wall(woah4, 5, 2, Direction.SOUTH);
        new Wall(woah4, 5, 1, Direction.SOUTH);
        
        // make him move
        int numberOfRotations = 4;
        while (numberOfRotations > 0){            
            momo.move(3);
            momo.turnLeft();
            momo.move(3);
            momo.turnLeft();
            momo.move(3);
            momo.turnLeft();
            momo.move(3);
            numberOfRotations = numberOfRotations - 1;
            
        }
    }
    
    
}

