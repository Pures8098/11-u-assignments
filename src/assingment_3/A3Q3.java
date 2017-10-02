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
        City Owensville = new City();

        //create robot
        Robot OWEN = new Robot(Owensville, 1, 1, Direction.EAST, 20);

        Owensville.showThingCounts(true);

        //move robot
            for (int count = 0; count < 4; count = count + 1) {
                int moveCounter = 0;

                //continue whe counter is less than 5
                while (moveCounter < 5) {
                    //get OWEN to move
                    OWEN.putThing();
                    OWEN.move();
                    //add one to move counter
                    moveCounter = moveCounter + 1;
                }
                if (OWEN.getDirection() == Direction.EAST) {
                    if (OWEN.getAvenue() == 6) {

                        OWEN.turnLeft();
                        OWEN.turnLeft();
                        OWEN.turnLeft();
                        OWEN.move();
                        OWEN.turnLeft();
                        OWEN.turnLeft();
                        OWEN.turnLeft();
                        OWEN.move();
                    }
                }

                if (OWEN.getDirection() == Direction.WEST) {
                    if (OWEN.getAvenue() == 0) {
                        OWEN.turnLeft();
                        OWEN.move();
                        OWEN.turnLeft();
                        OWEN.move();


                    }
                }
            }
        }
    }

