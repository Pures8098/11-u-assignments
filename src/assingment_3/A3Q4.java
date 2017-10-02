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
        City Owensville = new City();

        //Create Robot
        Robot OWEN = new Robot(Owensville, 3, 3, Direction.SOUTH);

        //create wall
        new Wall(Owensville, 1, 1, Direction.WEST);
        new Wall(Owensville, 2, 1, Direction.WEST);
        new Wall(Owensville, 1, 1, Direction.NORTH);
        new Wall(Owensville, 1, 2, Direction.NORTH);
        new Wall(Owensville, 2, 1, Direction.SOUTH);
        new Wall(Owensville, 2, 2, Direction.SOUTH);
        new Wall(Owensville, 2, 2, Direction.EAST);
        new Wall(Owensville, 1, 2, Direction.EAST);
        new Wall(Owensville, 1, 4, Direction.WEST);
        new Wall(Owensville, 2, 4, Direction.WEST);
        new Wall(Owensville, 1, 4, Direction.NORTH);
        new Wall(Owensville, 1, 5, Direction.NORTH);
        new Wall(Owensville, 2, 4, Direction.SOUTH);
        new Wall(Owensville, 2, 5, Direction.SOUTH);
        new Wall(Owensville, 2, 5, Direction.EAST);
        new Wall(Owensville, 1, 5, Direction.EAST);
        new Wall(Owensville, 4, 1, Direction.WEST);
        new Wall(Owensville, 5, 1, Direction.WEST);
        new Wall(Owensville, 4, 1, Direction.NORTH);
        new Wall(Owensville, 4, 2, Direction.NORTH);
        new Wall(Owensville, 5, 1, Direction.SOUTH);
        new Wall(Owensville, 5, 2, Direction.SOUTH);
        new Wall(Owensville, 5, 2, Direction.EAST);
        new Wall(Owensville, 4, 2, Direction.EAST);
        new Wall(Owensville, 4, 4, Direction.WEST);
        new Wall(Owensville, 5, 4, Direction.WEST);
        new Wall(Owensville, 4, 4, Direction.NORTH);
        new Wall(Owensville, 4, 5, Direction.NORTH);
        new Wall(Owensville, 5, 4, Direction.SOUTH);
        new Wall(Owensville, 5, 5, Direction.SOUTH);
        new Wall(Owensville, 5, 5, Direction.EAST);
        new Wall(Owensville, 4, 5, Direction.EAST);

        //move robot
       for (int Sunsar = 0; Sunsar < 4; Sunsar = Sunsar + 1) 
           
       {

            for (int count = 0; count < 3; count = count + 1) {
                int moveCounter = 0;

                //continue whe counter is less than 3
                while (moveCounter < 3) {
                    OWEN.move();

                    //add one to move counter
                    moveCounter = moveCounter + 1;
                }
                OWEN.turnLeft();

            }
            OWEN.move();
            OWEN.move();
            OWEN.move();
        }
    }
}
