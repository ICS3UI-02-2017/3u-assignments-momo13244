/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import becker.robots.City;
import becker.robots.Direction;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/**
 *
 * @author elmam0030
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        City MajorFat = new City();
        // Making The city for majorCool
        
        RobotSE fatjunior = new RobotSE(MajorFat, 0, 2, Direction.WEST);
        // Creating cooljunior
      
        // The building Cooljunior is walking around
        new Wall(MajorFat, 1, 1, Direction.WEST);
        
        new Wall(MajorFat, 1, 1, Direction.NORTH);
        
        new Wall(MajorFat, 1, 2, Direction.NORTH);
        
        new Wall(MajorFat, 1, 2, Direction.EAST);
        
        new Wall(MajorFat, 2, 2, Direction.EAST);
        
        new Wall(MajorFat, 2, 2, Direction.SOUTH);
        
        new Wall(MajorFat, 2, 1, Direction.SOUTH);
        
        new Wall(MajorFat, 2, 1, Direction.WEST);
        
        // The way Cooljunior is gonna walk around the building
        fatjunior.move(2);
        
        fatjunior.turnLeft();
        
        fatjunior.move(3);
        
        fatjunior.turnLeft();
        
        fatjunior.move(3);
        
        fatjunior.turnLeft();
        
        fatjunior.move(3);
        
        fatjunior.turnLeft();
        
        fatjunior.move(1);
        
        
                
        
    }
}
    