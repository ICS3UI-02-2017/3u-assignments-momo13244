/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author Mohamad
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create the city
        City woah3 = new City();
        // create the robot
        RobotSE momo = new RobotSE(woah3, 1, 1, Direction.EAST,20);
        
        // create the integer
        int numberOfSeeds = 20;
        // make him plant his crops
        while (numberOfSeeds > 0){
            if (!momo.canPickThing()){
                // take away one integer everytime a seed is placed
                momo.putThing();                
                numberOfSeeds = numberOfSeeds -1;
            }
            // make him move
            momo.move();
            if (momo.getAvenue() == 5){
                momo.turnRight();               
            }
            if (momo.getAvenue() == 1){
                momo.turnLeft();
            }          
        }       
    }
    
}
