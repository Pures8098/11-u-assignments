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
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Create city
        City owensville = new City();

        //create robot
        Robot oWEN = new Robot(owensville, 1, 1, Direction.EAST);

        owensville.showThingCounts(true);

        //new thing

        new Thing(owensville, 1, 2, Direction.EAST);
        new Thing(owensville, 1, 2, Direction.EAST);
        new Thing(owensville, 1, 2, Direction.EAST);
        new Thing(owensville, 1, 2, Direction.EAST);
        new Thing(owensville, 1, 2, Direction.EAST);
        new Thing(owensville, 1, 2, Direction.EAST);
        new Thing(owensville, 1, 2, Direction.EAST);
        new Thing(owensville, 1, 2, Direction.EAST);
        new Thing(owensville, 1, 2, Direction.EAST);
        new Thing(owensville, 1, 2, Direction.EAST);


        //move robot
        for (int count = 0; count < 10; count = count + 1) {

            //for picking up the things and getting into position
            while (oWEN.countThingsInBackpack() < 1) {
                oWEN.move();
                oWEN.pickThing();

            }
            //for doing commands once a certian objective has been hit with the backpack
            if (oWEN.countThingsInBackpack() >= 1) {
                oWEN.move();
                oWEN.putThing();
                oWEN.turnLeft();
                oWEN.move();
                oWEN.turnLeft();
                oWEN.move();
                oWEN.move();
                oWEN.turnLeft();
                oWEN.move();
                oWEN.turnLeft();



            }
        }
        //move afterward
        oWEN.move();
        oWEN.move();
    }
}
