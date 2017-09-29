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
        City Owensville = new City();

        //create robot
        Robot OWEN = new Robot(Owensville, 1, 1, Direction.EAST);

        Owensville.showThingCounts(true);

        //new thing

        new Thing(Owensville, 1, 2, Direction.EAST);
        new Thing(Owensville, 1, 2, Direction.EAST);
        new Thing(Owensville, 1, 2, Direction.EAST);
        new Thing(Owensville, 1, 2, Direction.EAST);
        new Thing(Owensville, 1, 2, Direction.EAST);
        new Thing(Owensville, 1, 2, Direction.EAST);
        new Thing(Owensville, 1, 2, Direction.EAST);
        new Thing(Owensville, 1, 2, Direction.EAST);
        new Thing(Owensville, 1, 2, Direction.EAST);
        new Thing(Owensville, 1, 2, Direction.EAST);


        //move robot
        for (int count = 0; count < 10; count = count + 1) {


            while (OWEN.countThingsInBackpack() < 1) {
                OWEN.move();
                OWEN.pickThing();

            }

            if (OWEN.countThingsInBackpack() >= 1) {
                OWEN.move();
                OWEN.putThing();
                OWEN.turnLeft();
                OWEN.move();
                OWEN.turnLeft();
                OWEN.move();
                OWEN.move();
                OWEN.turnLeft();
                OWEN.move();
                OWEN.turnLeft();



            }
        }

        OWEN.move();
        OWEN.move();
    }
}
