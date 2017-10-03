/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assingment_3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author Pures8098
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Create city
        City owensville = new City();

        //create robot
        Robot oWEN = new Robot(owensville, 1, 1, Direction.EAST, 20);

        owensville.showThingCounts(true);

        //move robot
        for (int count = 0; count < 4; count = count + 1) {
            int moveCounter = 0;

            //continue whe counter is less than 5
            while (moveCounter < 5) {
                //get oWEN to move
                oWEN.putThing();
                oWEN.move();
                //add one to move counter
                moveCounter = moveCounter + 1;
            }
            //if robot is facing east then turn and move to plant move 
            if (oWEN.getDirection() == Direction.EAST) {
                if (oWEN.getAvenue() == 6) {

                    oWEN.turnLeft();
                    oWEN.turnLeft();
                    oWEN.turnLeft();
                    oWEN.move();
                    oWEN.turnLeft();
                    oWEN.turnLeft();
                    oWEN.turnLeft();
                    oWEN.move();
                }
            }
            //if robot is facing west then turn and move to plant move 
            if (oWEN.getDirection() == Direction.WEST) {
                if (oWEN.getAvenue() == 0) {
                    oWEN.turnLeft();
                    oWEN.move();
                    oWEN.turnLeft();
                    oWEN.move();


                }
            }
        }
    }
}
