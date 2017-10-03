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
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //create city
        City owensville = new City();

        //create robot
        Robot oWEN = new Robot(owensville, 0, 3, Direction.WEST);

        //create wall
        new Wall(owensville, 1, 2, Direction.NORTH);
        new Wall(owensville, 1, 1, Direction.NORTH);
        new Wall(owensville, 2, 2, Direction.SOUTH);
        new Wall(owensville, 2, 1, Direction.SOUTH);
        new Wall(owensville, 1, 1, Direction.WEST);
        new Wall(owensville, 2, 1, Direction.WEST);
        new Wall(owensville, 1, 2, Direction.EAST);
        new Wall(owensville, 2, 2, Direction.EAST);

        //move robot
        //create and move mounting variable

        for (int count = 0; count < 8; count = count + 1) {

            int moveCounter = 0;

            //continue whe counter is less than ten
            while (moveCounter < 3) {
                //get oWEN to move
                oWEN.move();
                //add one to move counter
                moveCounter = moveCounter + 1;

            }
            //turn the corner after moved 3 spaces
            oWEN.turnLeft();

        }




    }
}
