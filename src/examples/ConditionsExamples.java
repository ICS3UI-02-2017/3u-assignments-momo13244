package examples;

import becker.robots.City;
import becker.robots.RobotSE;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author elmam0030
 */
public class ConditionsExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // creat city
        City MajorThick = new City();

        //create a robot
        RobotSE bigboy = new RobotSE(MajorThick, 2, 1, Direction.EAST);

        //create a wall
        new Wall(MajorThick, 2, 5, Direction.EAST);

        //new things!
        new Thing(MajorThick, 2, 2);
        new Thing(MajorThick, 2, 4);

        // move until front is not clear
        while (bigboy.frontIsClear()) {
            //if front is clear, do this
            bigboy.move();

            // is there something to pick up?
            if (bigboy.canPickThing()) {
                bigboy.pickThing();
            }
        }
        //When fron is not clear
        bigboy.turnRight();

        // do you have one thing in your backpack
        if (bigboy.countThingsInBackpack() == 1) {
            bigboy.move();
        } else if (bigboy.countThingsInBackpack()== 2) {
            bigboy.move(2);
        } else{
            bigboy.turnAround();
        }
    }
}
