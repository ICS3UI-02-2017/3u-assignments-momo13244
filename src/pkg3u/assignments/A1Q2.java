/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3u.assignments;

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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         City MajorFat = new City();
        
        RobotSE fatSenior = new RobotSE(MajorFat, 1, 2, Direction.SOUTH);
        
        new Wall(MajorFat, 1, 1, Direction.WEST);
        
        new Wall(MajorFat, 2, 1, Direction.WEST);
        
        new Wall(MajorFat, 1, 1, Direction.NORTH);
        
        new Wall(MajorFat, 1, 2, Direction.NORTH);
        
        new Wall(MajorFat, 1, 2, Direction.EAST);
        
        new Wall(MajorFat, 1, 2, Direction.SOUTH);
        
        new Wall(MajorFat, 2, 1, Direction.SOUTH);
        
        new Thing(MajorFat, 2, 2);
        
        fatSenior.turnRight();
        
        fatSenior.move(1);
        
        fatSenior.turnLeft();
        
        fatSenior.move(1);
        
        fatSenior.turnLeft();
        
        fatSenior.move(1);
        
        fatSenior.pickThing();
        
        fatSenior.turnAround();
        
        fatSenior.move(1);
        
        fatSenior.turnRight();
        
        fatSenior.move(1);
        
        fatSenior.turnRight();
        
        fatSenior.move(1);
        
        fatSenior.turnRight();
        
    }
}
