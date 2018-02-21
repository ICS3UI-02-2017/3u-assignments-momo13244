/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

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
        
        City MyDriveway = new City();
        
        RobotSE Gargoon = new RobotSE(MyDriveway, 1, 1, Direction.EAST);
        
    }
}
