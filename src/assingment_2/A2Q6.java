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
public class A2Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create city
        City Owensville = new City();
        //Create robot
        Robot OWEN = new Robot(Owensville, 0, 2, Direction.SOUTH);

        //Create wall

        new Wall(Owensville, 0, 2, Direction.WEST);
        new Wall(Owensville, 0, 3, Direction.WEST);
        new Wall(Owensville, 1, 2, Direction.WEST);
        new Wall(Owensville, 2, 2, Direction.WEST);
        new Wall(Owensville, 3, 2, Direction.WEST);
        new Wall(Owensville, 4, 2, Direction.WEST);
        new Wall(Owensville, 5, 2, Direction.WEST);
        new Wall(Owensville, 6, 2, Direction.WEST);
        new Wall(Owensville, 7, 2, Direction.WEST);
        new Wall(Owensville, 8, 2, Direction.WEST);
        new Wall(Owensville, 9, 2, Direction.WEST);
        new Wall(Owensville, 0, 3, Direction.SOUTH);
        new Wall(Owensville, 0, 4, Direction.SOUTH);
        new Wall(Owensville, 0, 5, Direction.SOUTH);
        new Wall(Owensville, 0, 6, Direction.SOUTH);
        new Wall(Owensville, 2, 3, Direction.SOUTH);
        new Wall(Owensville, 2, 4, Direction.SOUTH);
        new Wall(Owensville, 2, 5, Direction.SOUTH);
        new Wall(Owensville, 2, 6, Direction.SOUTH);
        new Wall(Owensville, 2, 7, Direction.WEST);
        new Wall(Owensville, 1, 7, Direction.WEST);
        new Wall(Owensville, 3, 3, Direction.WEST);
        new Wall(Owensville, 3, 3, Direction.SOUTH);
        new Wall(Owensville, 3, 4, Direction.SOUTH);
        new Wall(Owensville, 3, 5, Direction.SOUTH);
        new Wall(Owensville, 4, 3, Direction.SOUTH);
        new Wall(Owensville, 4, 4, Direction.SOUTH);
        new Wall(Owensville, 4, 5, Direction.SOUTH);
        new Wall(Owensville, 4, 6, Direction.WEST);
        new Wall(Owensville, 5, 3, Direction.WEST);
        new Wall(Owensville, 6, 3, Direction.WEST);
        new Wall(Owensville, 8, 3, Direction.SOUTH);
        new Wall(Owensville, 8, 4, Direction.SOUTH);
        new Wall(Owensville, 8, 5, Direction.SOUTH);
        new Wall(Owensville, 8, 6, Direction.SOUTH);
        new Wall(Owensville, 8, 7, Direction.SOUTH);
        new Wall(Owensville, 6, 3, Direction.SOUTH);
        new Wall(Owensville, 6, 4, Direction.SOUTH);
        new Wall(Owensville, 6, 5, Direction.SOUTH);
        new Wall(Owensville, 6, 6, Direction.SOUTH);
        new Wall(Owensville, 6, 7, Direction.SOUTH);
        new Wall(Owensville, 7, 8, Direction.WEST);
        new Wall(Owensville, 8, 8, Direction.WEST);
        new Wall(Owensville, 9, 3, Direction.WEST);
        new Wall(Owensville, 9, 2, Direction.SOUTH);


        //create thing
        new Thing(Owensville, 1, 2, Direction.WEST);
        new Thing(Owensville, 1, 3, Direction.WEST);
        new Thing(Owensville, 1, 4, Direction.WEST);
        new Thing(Owensville, 1, 5, Direction.WEST);
        new Thing(Owensville, 2, 2, Direction.WEST);
        new Thing(Owensville, 2, 4, Direction.WEST);
        new Thing(Owensville, 2, 6, Direction.WEST);
        new Thing(Owensville, 4, 2, Direction.WEST);
        new Thing(Owensville, 4, 3, Direction.WEST);
        new Thing(Owensville, 4, 4, Direction.WEST);
        new Thing(Owensville, 7, 2, Direction.WEST);
        new Thing(Owensville, 7, 3, Direction.WEST);
        new Thing(Owensville, 7, 7, Direction.WEST);
        new Thing(Owensville, 8, 3, Direction.WEST);
        new Thing(Owensville, 8, 4, Direction.WEST);
        new Thing(Owensville, 8, 6, Direction.WEST);

        //Move robot
        while (true) {
            
            if (OWEN.canPickThing()){
            OWEN.pickThing();
            }
            
            if (OWEN.frontIsClear()){
            OWEN.move();
            
            }else{
            if(!(OWEN.frontIsClear())){    
            OWEN.turnLeft();
            OWEN.turnLeft();
            OWEN.turnLeft();
        }
            }
        }
    }
}
