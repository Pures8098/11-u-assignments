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
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Create city
        City Owensville = new City();
        //Create robot
        Robot OWEN = new Robot(Owensville, 1, 1, Direction.EAST);


        //Create thing
        new Thing(Owensville, 1, 2, Direction.NORTH);
        new Thing(Owensville, 1, 3, Direction.NORTH);
        new Thing(Owensville, 1, 4, Direction.NORTH);
        new Thing(Owensville, 1, 5, Direction.NORTH);
        new Thing(Owensville, 1, 6, Direction.NORTH);
        new Thing(Owensville, 1, 7, Direction.NORTH);
        new Thing(Owensville, 1, 8, Direction.NORTH);
        new Thing(Owensville, 1, 9, Direction.NORTH);
        new Thing(Owensville, 1, 10, Direction.NORTH);
        new Thing(Owensville, 1, 11, Direction.NORTH);

          
            //Robot counts items in backpack
            while(OWEN.countThingsInBackpack() < 7) {
            OWEN.move();
            OWEN.pickThing();
                
            
         
            }
            OWEN.move();
            OWEN.move();
            OWEN.move();
            OWEN.move();
            }
    }
 

    