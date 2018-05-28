/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author elmam0030
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // create city
        City MajorStank = new City();

        // create robot
        RobotSE ColonelStank = new RobotSE(MajorStank, 1, 1, Direction.EAST);

        // create things
        new Thing(MajorStank, 1, 2);
        new Thing(MajorStank, 1, 3);
        new Thing(MajorStank, 1, 4);
        new Thing(MajorStank, 1, 5);
        new Thing(MajorStank, 1, 6);
        new Thing(MajorStank, 1, 7);
        new Thing(MajorStank, 1, 8);
        new Thing(MajorStank, 1, 9);
        new Thing(MajorStank, 1, 10);
        new Thing(MajorStank, 1, 11);

        // make this boy move
        while (ColonelStank.getAvenue() != 12) {
            ColonelStank.move();
            if (ColonelStank.countThingsInBackpack() < 7) {
                ColonelStank.pickThing();
            } else {
                if (ColonelStank.countThingsInBackpack() > 7){
                    
            }
          }
        }
    }
}
