import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;




/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3u.assignments;

import becker.robots.City;
import becker.robots.Direction;

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
        
        RobotSE fatjunior = new RobotSE(MajorFat, 0, 2, Direction.WEST);
        
        new Wall(MajorFat, 1, 1, Direction.WEST);
        
        new Wall(MajorFat, 1, 1, Direction.NORTH);
        
        new Wall(MajorFat, 1, 2, Direction.NORTH);
        
        new Wall(MajorFat, 1, 2, Direction.EAST);
        
        new Wall(MajorFat, 2, 2, Direction.EAST);
        
        new Wall(MajorFat, 2, 2, Direction.SOUTH);
        
        new Wall(MajorFat, 2, 1, Direction.SOUTH);
        
        new Wall(MajorFat, 2, 1, Direction.WEST);
        
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
    