/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author Pures8098
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

         //Create city
      City Owensville =new City();
      //Create robot
      Robot OWEN = new Robot(Owensville, 0, 1, Direction.WEST);
      Robot Sunsar = new Robot(Owensville, 3, 3, Direction.EAST);
      
      //Create wall
      new Wall(Owensville, 2,3,Direction.NORTH);
      new Wall(Owensville, 2,3,Direction.EAST);
      new Wall(Owensville, 3,3,Direction.EAST);
      new Wall(Owensville, 2,3,Direction.WEST);
      new Wall(Owensville, 3,3,Direction.SOUTH);
      
      //create thing
      
      new Thing (Owensville, 0,0,Direction.NORTH);
      new Thing (Owensville, 1,0,Direction.NORTH);
      new Thing (Owensville, 1,1,Direction.NORTH);
      new Thing (Owensville, 1,2,Direction.NORTH);
      new Thing (Owensville, 2,2,Direction.NORTH);
      
      //Lable robots
      Robot Sunsar = new robot(Owensville, 3, 3, Direction.EAST);
      
      
      
      
      
      
      
      
      
    }
}
