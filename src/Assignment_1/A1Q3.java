




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_1;

import becker.robots.City;
import java.util.Set;

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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City MajorFat = new City();
        // Creating the city Majorcool
        
        RobotSE fatElder = new RobotSE(MajorFat, 3, 0, Direction.EAST);
        // Creating coolElder
        
        new Thing(MajorFat, 3, 1);
        // The Flag is Created

        new Wall(MajorFat, 3, 2, Direction.WEST);
        
        new Wall(MajorFat, 3, 2, Direction.NORTH);
                
        new Wall(MajorFat, 2, 3, Direction.WEST);
        
        new Wall(MajorFat, 1, 3, Direction.WEST);
        
        new Wall(MajorFat, 1, 3, Direction.NORTH);
        
        new Wall(MajorFat, 1, 3, Direction.EAST);
        
        new Wall(MajorFat, 2, 4, Direction.NORTH);
        
        new Wall(MajorFat, 2, 4, Direction.EAST);
        
        new Wall(MajorFat, 3, 4, Direction.EAST);
        // The mountain is created
        
        
        fatElder.move(1);
        
        fatElder.pickThing();
        // CoolElder picks up the flag
        
        fatElder.turnLeft();
        
        fatElder.move();
        
        fatElder.turnRight();
        
        fatElder.move();
        
        fatElder.turnLeft();
        
        fatElder.move(2);
        
        fatElder.turnRight();
        
        fatElder.move();
        
        fatElder.putThing();
        // CoolElder Places the flag ontop the mountain
        
        fatElder.move();
        
        fatElder.turnRight();
        
        fatElder.move();
        
        fatElder.turnLeft();
        
        fatElder.move();
        
        fatElder.turnRight();
        
        fatElder.move(2);
        
        fatElder.turnLeft();
        // coolElder has climbed down the mountain
        
        
        
        
        
        

    }
    
}
