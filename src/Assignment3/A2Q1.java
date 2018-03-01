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
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create the city
        City woah = new City();
        // creat the robot
        RobotSE momo = new RobotSE(woah, 0, 2, Direction.WEST);
        // creat the square
        new Wall(woah, 1, 1, Direction.WEST);
        new Wall(woah, 1, 1, Direction.NORTH);
        new Wall(woah, 2, 1, Direction.WEST);
        new Wall(woah, 2, 1, Direction.SOUTH);
        new Wall(woah, 2, 2, Direction.SOUTH);
        new Wall(woah, 1, 2, Direction.NORTH);
        new Wall(woah, 1, 2, Direction.EAST);
        new Wall(woah, 2, 2, Direction.EAST);
        
        // create the integer
        int numberOfRotations = 2;
        // make momo move around and stop at 2 rotations
        while (numberOfRotations > 0){
            momo.move(2);
            momo.turnLeft();
            momo.move(3);
            momo.turnLeft();
            momo.move(3);
            momo.turnLeft();
            momo.move(3);
            momo.turnLeft();
            momo.move();
            // take one away everytime completed a rotation
            numberOfRotations = numberOfRotations - 1;
        }
        
    }
    
}
