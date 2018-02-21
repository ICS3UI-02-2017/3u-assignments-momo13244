/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
 * @author Mohamad
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // create City
        City MajorStank = new City();
        
        RobotSE MajorOof = new RobotSE(MajorStank, 4, 1, Direction.EAST);
        
        new Wall(MajorStank, 4, 1, Direction.SOUTH);
        new Wall(MajorStank, 4, 2, Direction.SOUTH);
        new Wall(MajorStank, 4, 3, Direction.SOUTH);
        new Wall(MajorStank, 4, 4, Direction.SOUTH);
        new Wall(MajorStank, 4, 5, Direction.SOUTH);
        new Wall(MajorStank, 4, 6, Direction.SOUTH);
        new Wall(MajorStank, 4, 7, Direction.SOUTH);
        new Wall(MajorStank, 4, 8, Direction.SOUTH);
        new Wall(MajorStank, 4, 9, Direction.SOUTH);
        new Wall(MajorStank, 4, 1, Direction.EAST);
        new Wall(MajorStank, 4, 2, Direction.EAST);
        new Wall(MajorStank, 4, 4, Direction.EAST);
        new Wall(MajorStank, 4, 7, Direction.EAST);
       
        new Thing(MajorStank, 4, 9);

        while(MajorOof.getAvenue() != 9){
            
        if (!MajorOof.frontIsClear()){
            MajorOof.turnLeft();
        } else if (MajorOof.frontIsClear()){
            MajorOof.move();
        } if (MajorOof.getStreet() <= 3){
            MajorOof.turnRight();
              
        }
            
        }
        
        
    }
}


