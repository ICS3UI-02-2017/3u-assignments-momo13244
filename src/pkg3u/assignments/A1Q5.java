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

/**
 *
 * @author Mohamad
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City MajorFat = new City();
        
        RobotSE GeneralFat = new RobotSE(MajorFat, 0, 1, Direction.WEST);
        
        RobotSE ColonelFat = new RobotSE(MajorFat, 3, 3, Direction.EAST);
        
        ColonelFat.setLabel("Colenol");
        
        GeneralFat.setLabel("General");
        
        new Thing(MajorFat, 0, 0);
        
        new Thing(MajorFat, 1, 0);
        
        new Thing(MajorFat, 1, 1);
        
        new Thing(MajorFat, 1, 2);
        
        new Thing(MajorFat, 2, 2);
        
        new Wall(MajorFat, 2, 3, Direction.WEST);
        
        new Wall(MajorFat, 2, 3, Direction.NORTH);
        
        new Wall(MajorFat, 2, 3, Direction.EAST);
        
        new Wall(MajorFat, 3, 3, Direction.SOUTH);
        
        new Wall(MajorFat, 3, 3, Direction.EAST);
        
        
        ColonelFat.turnAround();
        
        GeneralFat.move();
        
        ColonelFat.move();
        
        GeneralFat.pickThing();
        
        ColonelFat.turnRight();
        
        GeneralFat.turnLeft();
        
        ColonelFat.move();
        
        GeneralFat.move();
        
        ColonelFat.pickThing();
        
        GeneralFat.pickThing();
        
        ColonelFat.move();
        
        GeneralFat.turnLeft();
        
        ColonelFat.pickThing();
        
        GeneralFat.move();
        
        ColonelFat.turnLeft();
        
        GeneralFat.pickThing();
        
        
     
        
    }
    
}
