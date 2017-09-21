/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assingment_2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author Pures8098
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Create city
        City Owensville = new City();
        //Create robot
        Robot OWEN = new Robot(Owensville, 3, 0, Direction.EAST);

        //Create wall
        new Wall(Owensville, 3, 0, Direction.SOUTH);
        new Wall(Owensville, 3, 1, Direction.SOUTH);
        new Wall(Owensville, 3, 2, Direction.SOUTH);
        new Wall(Owensville, 3, 3, Direction.SOUTH);
        new Wall(Owensville, 3, 4, Direction.SOUTH);
        new Wall(Owensville, 3, 5, Direction.SOUTH);
        new Wall(Owensville, 3, 6, Direction.SOUTH);
        new Wall(Owensville, 3, 7, Direction.SOUTH);
        new Wall(Owensville, 3, 8, Direction.SOUTH);
        new Wall(Owensville, 3, 0, Direction.EAST);
        new Wall(Owensville, 3, 1, Direction.EAST);
        new Wall(Owensville, 3, 3, Direction.EAST);
        new Wall(Owensville, 3, 6, Direction.EAST);

        //Create thing
        new Thing(Owensville, 3, 8, Direction.SOUTH);

        //Move robot

        while (OWEN.countThingsInBackpack() == 0) {
          
            if (OWEN.canPickThing())
            OWEN.pickThing();
                
            if (OWEN.frontIsClear()) {
                OWEN.move();
              
                
            } else {
                if (!(OWEN.frontIsClear())) {
                    OWEN.turnLeft();
                    OWEN.move();
                    OWEN.turnLeft();
                    OWEN.turnLeft();
                    OWEN.turnLeft();
                    OWEN.move();
                    OWEN.turnLeft();
                    OWEN.turnLeft();
                    OWEN.turnLeft();
                    OWEN.move();
                    OWEN.turnLeft();
                }

            }
        }

















    }
}
