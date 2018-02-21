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
import becker.robots.Thing;

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
        
        City Origin = new City();
        
        RobotSE Gary = new RobotSE(Origin, -5, -5, Direction.SOUTH);
        
        
        // Under Street Zero
        while (Gary.getStreet() > 0){
            
            // the postive Positive sector. Bottom right of origin.
            if (Gary.getAvenue() > 0){
            
                if (Gary.getDirection() == EAST){
                    Gary.turnLeft();
                }
                if (Gary.getDirection() == SOUTH){
                    Gary.turnAround();
                }
                if (Gary.getDirection() == WEST){
                    Gary.turnRight();
                }
                if (Gary.getStreet() != 0){
                    Gary.move();
                } 
                if (Gary.getStreet() == 0){
                    Gary.turnLeft(); 
                }
            } // The positive negative sector. Bottom Left of the origin. 
            if (Gary.getAvenue() < 0){
            
                if (Gary.getDirection() == WEST){
                    Gary.turnRight();
                }
                if (Gary.getDirection() == SOUTH){
                    Gary.turnAround();
                }
                if (Gary.getDirection() == EAST){
                    Gary.turnLeft();
                }
                if (Gary.getStreet() != 0){
                    Gary.move();
                } 
                if (Gary.getStreet() == 0){
                    Gary.turnRight(); 
                }           
            }     
        }
        // Above street Zero
        while (Gary.getStreet() < 0){
            
            // The negative positive sector. Top right of origin
            if (Gary.getAvenue() > 0){
            
                if (Gary.getDirection() == EAST){
                    Gary.turnRight();
                }
                if (Gary.getDirection() == NORTH){
                    Gary.turnAround();
                }
                if (Gary.getDirection() == WEST){
                    Gary.turnLeft();
                }
                if (Gary.getStreet() != 0){
                    Gary.move();
                } 
                if (Gary.getStreet() == 0){
                    Gary.turnRight(); 
                }
        }   // The negative negative sector. Top left of origin
            if (Gary.getAvenue() < 0){
            
                if (Gary.getDirection() == WEST){
                    Gary.turnLeft();
                }
                if (Gary.getDirection() == NORTH){
                    Gary.turnAround();
                }
                if (Gary.getDirection() == EAST){
                    Gary.turnRight();
                }
                if (Gary.getStreet() != 0){
                    Gary.move();
                } 
                if (Gary.getStreet() == 0){
                    Gary.turnLeft(); 
                }
            }    
        }
        // Move to origin
        while (Gary.getAvenue() != 0){
            Gary.move();
        }
    }
}
