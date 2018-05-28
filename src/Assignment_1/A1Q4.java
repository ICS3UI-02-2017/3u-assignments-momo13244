



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/**
 *
 * @author Mohamad
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City MajorFat = new City();
        // the City is created
        
        RobotSE AdmiralFat = new RobotSE(MajorFat, 0, 0, Direction.SOUTH);
        // Robot 1 is created
        
        RobotSE ViceAdmiralFat = new RobotSE(MajorFat, 0, 1, Direction.SOUTH);
        // Robot 2 is created
        
        new Wall(MajorFat, 0, 1, Direction.WEST);
        
        new Wall(MajorFat, 1, 1, Direction.WEST);
        
        new Wall(MajorFat, 1, 1, Direction.SOUTH);
        // The wall between them is created
        
        // The are moving to find eachother
        ViceAdmiralFat.move();
        
        AdmiralFat.move(2);
        
        ViceAdmiralFat.turnLeft();
        
        ViceAdmiralFat.move();
        
        ViceAdmiralFat.turnRight();
        
        ViceAdmiralFat.move();
        
        ViceAdmiralFat.turnRight();
        
        AdmiralFat.turnLeft();
        
        ViceAdmiralFat.move();
        
        AdmiralFat.move();
        // They have phased into one :)
        
    }
    
}
