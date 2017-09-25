/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assingment_2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author Pures8098
 */
public class A2Q2 {

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
    }
}
