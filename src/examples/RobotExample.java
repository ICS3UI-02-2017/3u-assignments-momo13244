/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/**
 * learning how to use the robots-0
 * @author elmam0030
 */
public class RobotExample {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        // Create a city for gary the robot
        City kw = new City();
        
        // put a robot in kw
        RobotSE garoussa = new RobotSE(kw, 2, 3, Direction.EAST);
        
        garoussa.setLabel("G");
        
        // new colour
        garoussa.setColor(Color.PINK);
        
        // new wall
        new Wall(kw, 2, 6, Direction.WEST);
        
        // create a thing
        new Thing(kw, 2, 4);
        new Thing(kw, 2, 4);
        new Thing(kw, 2, 4);
        new Thing(kw, 2, 4);
        new Thing(kw, 2, 4);
        new Thing(kw, 2, 4);
        new Thing(kw, 2, 4);
      
        
        // move the robot forward 1 space
        garoussa.move(1);
        
        garoussa.pickThing();
        garoussa.pickThing();
        garoussa.pickThing();
        garoussa.pickThing();
        garoussa.pickThing();
        garoussa.pickThing();
        garoussa.pickThing();
        
        garoussa.turnLeft();
        
        garoussa.move(1);
        
        garoussa.turnRight();
        
        garoussa.move(3);
        
        garoussa.putThing();
        
        
                
        
        
         
                
              
             
    }
    
}
