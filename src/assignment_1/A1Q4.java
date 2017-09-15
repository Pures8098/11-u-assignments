/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author Pures8098
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Create city
      City Owensville =new City();
      //Create robot
      Robot OWEN = new Robot(Owensville, 0, 0, Direction.SOUTH);
      Robot Sunsar = new Robot(Owensville, 0, 1, Direction.SOUTH);
      
      //Create wall
      new Wall(Owensville, 0,1,Direction.WEST);
      new Wall(Owensville, 1,1,Direction.WEST);
      new Wall(Owensville, 1,1,Direction.SOUTH);
      
      //Move robots 
      Sunsar.move();
      OWEN.move();
      
      //Sunsar turn left 
      Sunsar.turnLeft();
      
      //Move Sunsar 
      Sunsar.move();
      
      //Sunsar turn left 
      Sunsar.turnLeft();
      Sunsar.turnLeft();
      Sunsar.turnLeft();
      
      //Move robots 
      Sunsar.move();
      OWEN.move();
      
      //Sunsar turn left 
      Sunsar.turnLeft();
      Sunsar.turnLeft();
      Sunsar.turnLeft();
      
      //owen turn left
      OWEN.turnLeft();
      
      //Move robots 
      Sunsar.move();
      OWEN.move();
      
      
    }
}
