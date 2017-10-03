/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assingment_3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author Pures8098
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create city
        City owensville = new City();

        //Create Robot
        Robot oWEN = new Robot(owensville, 3, 3, Direction.SOUTH);

        //create wall
        new Wall(owensville, 1, 1, Direction.WEST);
        new Wall(owensville, 2, 1, Direction.WEST);
        new Wall(owensville, 1, 1, Direction.NORTH);
        new Wall(owensville, 1, 2, Direction.NORTH);
        new Wall(owensville, 2, 1, Direction.SOUTH);
        new Wall(owensville, 2, 2, Direction.SOUTH);
        new Wall(owensville, 2, 2, Direction.EAST);
        new Wall(owensville, 1, 2, Direction.EAST);
        new Wall(owensville, 1, 4, Direction.WEST);
        new Wall(owensville, 2, 4, Direction.WEST);
        new Wall(owensville, 1, 4, Direction.NORTH);
        new Wall(owensville, 1, 5, Direction.NORTH);
        new Wall(owensville, 2, 4, Direction.SOUTH);
        new Wall(owensville, 2, 5, Direction.SOUTH);
        new Wall(owensville, 2, 5, Direction.EAST);
        new Wall(owensville, 1, 5, Direction.EAST);
        new Wall(owensville, 4, 1, Direction.WEST);
        new Wall(owensville, 5, 1, Direction.WEST);
        new Wall(owensville, 4, 1, Direction.NORTH);
        new Wall(owensville, 4, 2, Direction.NORTH);
        new Wall(owensville, 5, 1, Direction.SOUTH);
        new Wall(owensville, 5, 2, Direction.SOUTH);
        new Wall(owensville, 5, 2, Direction.EAST);
        new Wall(owensville, 4, 2, Direction.EAST);
        new Wall(owensville, 4, 4, Direction.WEST);
        new Wall(owensville, 5, 4, Direction.WEST);
        new Wall(owensville, 4, 4, Direction.NORTH);
        new Wall(owensville, 4, 5, Direction.NORTH);
        new Wall(owensville, 5, 4, Direction.SOUTH);
        new Wall(owensville, 5, 5, Direction.SOUTH);
        new Wall(owensville, 5, 5, Direction.EAST);
        new Wall(owensville, 4, 5, Direction.EAST);

        //move robot
       for (int sunsar = 0; sunsar < 4; sunsar = sunsar + 1) 
           
       {

            for (int count = 0; count < 3; count = count + 1) {
                int moveCounter = 0;

                //continue whe counter is less than 3
                while (moveCounter < 3) {
                    oWEN.move();

                    //add one to move counter
                    moveCounter = moveCounter + 1;
                }
                //turn corner
                oWEN.turnLeft();

            }
            //robot moves through open area
            oWEN.move();
            oWEN.move();
            oWEN.move();
        }
    }
}
