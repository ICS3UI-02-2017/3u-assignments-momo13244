/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author Mohamad
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City Colombia = new City();
        
        RobotSE Maria = new RobotSE(Colombia, 1, 2, Direction.EAST);
        
        Maria.setLabel("Maria");      
        
        new Wall(Colombia, 1, 1, Direction.EAST);
        new Wall(Colombia, 1, 1, Direction.WEST);
        new Wall(Colombia, 1, 1, Direction.SOUTH);
        new Wall(Colombia, 1, 1, Direction.NORTH);
        new Wall(Colombia, 1, 4, Direction.NORTH);
        new Wall(Colombia, 1, 4, Direction.WEST);
        new Wall(Colombia, 1, 4, Direction.EAST);
        new Wall(Colombia, 1, 4, Direction.SOUTH);
        new Wall(Colombia, 4, 1, Direction.NORTH);
        new Wall(Colombia, 4, 1, Direction.WEST);
        new Wall(Colombia, 4, 1, Direction.EAST);
        new Wall(Colombia, 4, 1, Direction.SOUTH);
        new Wall(Colombia, 4, 4, Direction.NORTH);
        new Wall(Colombia, 4, 4, Direction.WEST);
        new Wall(Colombia, 4, 4, Direction.EAST);
        new Wall(Colombia, 4, 4, Direction.SOUTH);
        new Wall(Colombia, 3, 3, Direction.SOUTH);
        new Wall(Colombia, 3, 3, Direction.EAST);
        new Wall(Colombia, 2, 2, Direction.NORTH);
        new Wall(Colombia, 2, 2, Direction.WEST);
        new Wall(Colombia, 3, 3, Direction.SOUTH);
        new Wall(Colombia, 2, 3, Direction.EAST);
        new Wall(Colombia, 2, 3, Direction.NORTH);
        new Wall(Colombia, 3, 2, Direction.WEST);
        new Wall(Colombia, 3, 2, Direction.SOUTH);
        
        while (true){
            Maria.move();
            
            if (!Maria.frontIsClear()){
                Maria.turnLeft();
            }
            if ()
        }
        
    }
    
}
