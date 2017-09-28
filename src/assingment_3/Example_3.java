/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assingment_3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author Pures8098
 */
public class Example_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //create city
        //Create city
        City Owensville = new City();

        //create robot
        Robot OWEN = new Robot(Owensville, 1, 1, Direction.EAST);

        //create and move mounting variable
        int moveCounter = 0;

        //continue whe counter is less than ten
        while (moveCounter < 10) {
            //get OWEN to move
            OWEN.move();
            //add one to move counter
            moveCounter = moveCounter + 1;

        }
    }
}
