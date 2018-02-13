import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3u.assignments;

import becker.robots.City;
import java.util.Set;

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
        
        RobotSE fatElder = new RobotSE(MajorFat, 3, 0, Direction.EAST)
        
        new Thing(MajorFat, 3, 1);

        new Wall(MajorFat, 3, 2, Direction.WEST);
        
        new Wall(MajorFat, 3, 2, Direction.NORTH);
                
        new Wall(MajorFat, 2, 3, Direction.WEST);
        
        new Wall(MajorFat, 1, 3, Direction.WEST);
        
        new Wall(MajorFat, 1, 3, Direction.NORTH);
        
        new Wall(MajorFat, 1, 3, Direction.EAST);
        
        new Wall(MajorFat, 2, 4, Direction.NORTH);
        
        new Wall(MajorFat, 2, 4, Direction.EAST);
        
        new Wall(MajorFat, 3, 4, Direction.EAST);
        
        fatElder.move(1);
        
        fatElder.pickThing();
        
        fatElder.turnLeft();
        
        fatElder.move();
        
        fatElder.turnRight();
        
        fatElder.move();
        
        fatElder.turnLeft();
        
        fatElder.move(2);
        
        fatElder.turnRight();
        
        fatElder.move();
        
        fatElder.putThing();
        
        fatElder.move();
        
        fatElder.turnRight();
        
        fatElder.move();
        
        fatElder.turnLeft();
        
        fatElder.move();
        
        fatElder.turnRight();
        
        fatElder.move(2);
        
        fatElder.turnLeft();
        
        
        
        
        
        

    }
    
}
