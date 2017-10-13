/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quizes;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author Pures8098
 */
public class quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //create city
        City owensville = new City();

        //create robot
        Robot oWEN = new Robot(owensville, 1, 1, Direction.EAST);


        //show amount of things
        owensville.showThingCounts(true);


        //create wall
        new Wall(owensville, 1, 1, Direction.WEST);
        new Wall(owensville, 1, 7, Direction.EAST);
        new Wall(owensville, 1, 4, Direction.NORTH);
        new Wall(owensville, 1, 4, Direction.SOUTH);
        new Wall(owensville, 1, 5, Direction.NORTH);
        new Wall(owensville, 1, 5, Direction.SOUTH);
        new Wall(owensville, 1, 6, Direction.NORTH);
        new Wall(owensville, 1, 6, Direction.SOUTH);
        new Wall(owensville, 1, 7, Direction.NORTH);
        new Wall(owensville, 1, 7, Direction.SOUTH);


        //create thing
        new Thing(owensville, 1, 4, Direction.NORTH);
        new Thing(owensville, 1, 5, Direction.NORTH);
        new Thing(owensville, 1, 6, Direction.NORTH);
        new Thing(owensville, 1, 7, Direction.NORTH);


        //move oWEN to pick up coal 4 times
        for (int count = 0; count < 4; count = count + 1) {
            //count things in backpack to make sure robot has enough coal
            while (oWEN.countThingsInBackpack() == 0) {
                if (oWEN.canPickThing()) {
                    oWEN.pickThing();

                } else {
                    //get robot to move
                    if (!(oWEN.canPickThing())) {
                        oWEN.move();

                    }
                }
            }
            //turn around when robot has enough coal
            if (oWEN.countThingsInBackpack() > 0) {
                oWEN.turnLeft();
                oWEN.turnLeft();
            }

            if (!(oWEN.frontIsClear())) {
                oWEN.turnLeft();
                oWEN.turnLeft();

            }
//get robot to move forward
            while (oWEN.frontIsClear()) {
                oWEN.move();


            }
//Get robot to drop of coal
            if (oWEN.getDirection() == Direction.WEST) {
                if (!(oWEN.frontIsClear())) {
                    oWEN.turnLeft();
                }
                oWEN.turnLeft();
                oWEN.putThing();
                oWEN.move();
            }
        }
        //Put robot back into position
        oWEN.turnLeft();
        oWEN.turnLeft();
        oWEN.move();
        oWEN.turnLeft();
        oWEN.turnLeft();
    }
}
