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
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // create city
        City MajorStank = new City();

        // creat robot
        RobotSE ColonelStank = new RobotSE(MajorStank, 1, 1, Direction.EAST);

        new Wall(MajorStank, 1, 1, Direction.SOUTH);
        new Wall(MajorStank, 1, 2, Direction.SOUTH);
        new Wall(MajorStank, 1, 3, Direction.SOUTH);
        new Wall(MajorStank, 1, 4, Direction.SOUTH);
        new Wall(MajorStank, 1, 5, Direction.SOUTH);
        new Wall(MajorStank, 1, 6, Direction.SOUTH);
        new Wall(MajorStank, 1, 7, Direction.SOUTH);
        new Wall(MajorStank, 1, 8, Direction.SOUTH);
        new Wall(MajorStank, 1, 9, Direction.SOUTH);
        new Wall(MajorStank, 1, 1, Direction.EAST);
        new Wall(MajorStank, 1, 2, Direction.EAST);
        new Wall(MajorStank, 1, 4, Direction.EAST);
        new Wall(MajorStank, 1, 7, Direction.EAST);
        new Thing(MajorStank, 1, 9);

        while (ColonelStank.getAvenue() != 9) {
            ColonelStank.turnLeft();
            if (ColonelStank.getStreet() == 1) {
                ColonelStank.move();
            }
            if (ColonelStank.getStreet() == 0) {
                ColonelStank.turnRight();
                ColonelStank.move();
            }

        }

    }
}
