/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import static becker.robots.Direction.EAST;
import static becker.robots.Direction.NORTH;
import static becker.robots.Direction.SOUTH;
import static becker.robots.Direction.WEST;
import becker.robots.RobotSE;

/**
 *
 * @author Mohamad
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Create City
        City ToonTown = new City();
        
        // Create Robot
        RobotSE SirFat = new RobotSE(ToonTown, -6, -7, Direction.NORTH);
        
        // Southern of the Street Axis
        while (SirFat.getStreet() > 0){
            if (SirFat.getDirection() == EAST){
                SirFat.turnLeft();
            }
            if (SirFat.getDirection() == SOUTH){
                SirFat.turnAround();
            } if (SirFat.getStreet() != 0){    
                SirFat.move();
            } if (SirFat.getStreet() == 0){
                   SirFat.turnLeft();  
                   
            // Northern of the StreetAxis
        } while (SirFat.getStreet() < 0) {
             
            if (SirFat.getDirection() == NORTH){
                SirFat.turnAround();
            }
            if (SirFat.getDirection() == WEST){
                SirFat.turnLeft();
            } 
            if (SirFat.getStreet() != 0){    
                SirFat.move();
            }if (SirFat.getStreet() == 0){
                SirFat.turnLeft();
        
    }  if (SirFat.getStreet() == 0){
          SirFat.turnLeft();
          
    }  while (SirFat.getAvenue() != 0){
        SirFat.move();
    }

    }
}
