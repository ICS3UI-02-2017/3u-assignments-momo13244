/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3u.assignments.assignment1;

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
        
        // Making the house for fatSenior
        new Wall(MajorFat, 1, 1, Direction.WEST);
        
        new Wall(MajorFat, 2, 1, Direction.WEST);
        
        new Wall(MajorFat, 1, 1, Direction.NORTH);
        
        new Wall(MajorFat, 1, 2, Direction.NORTH);
        
        new Wall(MajorFat, 1, 2, Direction.EAST);
        
        new Wall(MajorFat, 1, 2, Direction.SOUTH);
        
        new Wall(MajorFat, 2, 1, Direction.SOUTH);
        
        new Thing(MajorFat, 2, 2);
        // The newsPaper for coolSenior
        
        // fatSenior walking out to collect his news paper
        fatSenior.turnRight();
        
        fatSenior.move(1);
        
        fatSenior.turnLeft();
        
        fatSenior.move(1);
        
        fatSenior.turnLeft();
        
        fatSenior.move(1);
        
        fatSenior.pickThing();
        //fatSenior Got his Newspaper
        
        fatSenior.turnAround();
        
        fatSenior.move(1);
        
        fatSenior.turnRight();
        
        fatSenior.move(1);
        
        fatSenior.turnRight();
        
        fatSenior.move(1);
        
        fatSenior.turnRight();
        // fatSenior is now back home enjoying his coffee while reading newspaper
        
      
        
    }
}
