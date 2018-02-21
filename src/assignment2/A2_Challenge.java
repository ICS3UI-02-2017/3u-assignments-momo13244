/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author elmam0030
 */
public class A2_Challenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create a city
        City MyDriveway = new City();
        
        // create 2 robots
        RobotSE Gargoon = new RobotSE(MyDriveway, 0, 2, Direction.SOUTH);
        RobotSE Monmoon = new RobotSE(MyDriveway, 0, 2, Direction.SOUTH);
        
        //Create the Driveway
        new Wall(MyDriveway, 0, 0, Direction.WEST);
        new Wall(MyDriveway, 1, 0, Direction.WEST);
        new Wall(MyDriveway, 2, 0, Direction.WEST);
        new Wall(MyDriveway, 3, 0, Direction.WEST);
        new Wall(MyDriveway, 4, 0, Direction.WEST);
        new Wall(MyDriveway, 5, 0, Direction.WEST);
        new Wall(MyDriveway, 6, 0, Direction.WEST);
        new Wall(MyDriveway, 7, 0, Direction.WEST);
        new Wall(MyDriveway, 8, 0, Direction.WEST);
        new Wall(MyDriveway, 9, 0, Direction.WEST);
        
        new Wall(MyDriveway, 0, 1, Direction.EAST);
        new Wall(MyDriveway, 2, 1, Direction.EAST);
        new Wall(MyDriveway, 3, 1, Direction.EAST);
        new Wall(MyDriveway, 4, 1, Direction.EAST);
        new Wall(MyDriveway, 5, 1, Direction.EAST);
        new Wall(MyDriveway, 6, 1, Direction.EAST);
        new Wall(MyDriveway, 7, 1, Direction.EAST);
        new Wall(MyDriveway, 8, 1, Direction.EAST);
        new Wall(MyDriveway, 9, 1, Direction.EAST);
        new Wall(MyDriveway, 1, 1, Direction.EAST);
        
        new Wall(MyDriveway, 0, 2, Direction.EAST);
        new Wall(MyDriveway, 1, 3, Direction.NORTH);
        new Wall(MyDriveway, 1, 4, Direction.NORTH);
        new Wall(MyDriveway, 1, 5, Direction.NORTH);
        new Wall(MyDriveway, 1, 6, Direction.NORTH);
        new Wall(MyDriveway, 1, 6, Direction.EAST);
        new Wall(MyDriveway, 2, 6, Direction.EAST);
        new Wall(MyDriveway, 4, 5, Direction.EAST);
        new Wall(MyDriveway, 7, 7, Direction.EAST);
        new Wall(MyDriveway, 8, 7, Direction.EAST);
       
        new Wall(MyDriveway, 2, 3, Direction.SOUTH);
        new Wall(MyDriveway, 2, 4, Direction.SOUTH);
        new Wall(MyDriveway, 2, 5, Direction.SOUTH);
        new Wall(MyDriveway, 2, 6, Direction.SOUTH);
        new Wall(MyDriveway, 3, 2, Direction.EAST);
        new Wall(MyDriveway, 4, 3, Direction.NORTH);
        new Wall(MyDriveway, 4, 4, Direction.NORTH);
        new Wall(MyDriveway, 4, 5, Direction.NORTH);
        new Wall(MyDriveway, 4, 3, Direction.SOUTH);
        new Wall(MyDriveway, 4, 4, Direction.SOUTH);
        new Wall(MyDriveway, 4, 5, Direction.SOUTH);
        new Wall(MyDriveway, 5, 2, Direction.EAST);
        
        new Wall(MyDriveway, 6, 2, Direction.EAST);
        new Wall(MyDriveway, 7, 3, Direction.NORTH);
        new Wall(MyDriveway, 7, 4, Direction.NORTH);
        new Wall(MyDriveway, 7, 5, Direction.NORTH);
        new Wall(MyDriveway, 7, 6, Direction.NORTH);
        new Wall(MyDriveway, 7, 7, Direction.NORTH);
        new Wall(MyDriveway, 8, 3, Direction.SOUTH);
        new Wall(MyDriveway, 8, 4, Direction.SOUTH);
        new Wall(MyDriveway, 8, 5, Direction.SOUTH);
        new Wall(MyDriveway, 8, 6, Direction.SOUTH);
        new Wall(MyDriveway, 8, 7, Direction.SOUTH);
        new Wall(MyDriveway, 9, 2, Direction.SOUTH);
        new Wall(MyDriveway, 9, 2, Direction.EAST);
        
        
        // create the snow
        new Thing(MyDriveway, 0, 1);
        new Thing(MyDriveway, 1, 0);
        new Thing(MyDriveway, 2, 0);
        new Thing(MyDriveway, 3, 0);
        new Thing(MyDriveway, 7, 2);
        new Thing(MyDriveway, 7, 7);
        new Thing(MyDriveway, 8, 3);
        new Thing(MyDriveway, 8, 4);
        new Thing(MyDriveway, 8, 6);
        new Thing(MyDriveway, 4, 0);
        new Thing(MyDriveway, 5, 1);
        new Thing(MyDriveway, 7, 0);
        new Thing(MyDriveway, 7, 1);
        new Thing(MyDriveway, 4, 4);
        new Thing(MyDriveway, 7, 3);
        new Thing(MyDriveway, 9, 3);
        new Thing(MyDriveway, 9, 4);
        new Thing(MyDriveway, 9, 6);
        new Thing(MyDriveway, 6, 4);
        new Thing(MyDriveway, 6, 6);
        new Thing(MyDriveway, 8, 1);
        new Thing(MyDriveway, 9, 0);
        new Thing(MyDriveway, 9, 1);
        new Thing(MyDriveway, 1, 3);
        new Thing(MyDriveway, 1, 2);
        new Thing(MyDriveway, 1, 4);
        new Thing(MyDriveway, 5, 5);
        new Thing(MyDriveway, 5, 7);
        new Thing(MyDriveway, 4, 6);
        new Thing(MyDriveway, 0, 6);
        new Thing(MyDriveway, 1, 5);
        new Thing(MyDriveway, 2, 2);
        new Thing(MyDriveway, 2, 4);
        new Thing(MyDriveway, 2, 6);
        new Thing(MyDriveway, 4, 3);
        new Thing(MyDriveway, 4, 2);
        new Thing(MyDriveway, 4, 7);
        new Thing(MyDriveway, 3, 4);
        new Thing(MyDriveway, 3, 6);
        new Thing(MyDriveway, 1, 7);
        new Thing(MyDriveway, 0, 3);
        new Thing(MyDriveway, 0, 4);
        new Thing(MyDriveway, 3, 1);
               
        // Make him clean the driveway
        while (Gargoon.getStreet() != 9){
            Gargoon.move();
            if ()
        }
        
        
        
        
        
    }
}
