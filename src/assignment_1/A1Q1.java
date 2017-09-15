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
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   // TODO code application logic here
        //Create city
      City Owensville =new City();
      //Create robot
      Robot OWEN = new Robot(Owensville, 0, 2, Direction.WEST);
    
      //Create wall
      new Wall(Owensville, 1,1,Direction.NORTH);
    new Wall(Owensville, 1,2,Direction.NORTH);
    new Wall(Owensville, 1,1,Direction.WEST);
    new Wall(Owensville, 2,1,Direction.WEST);
    new Wall(Owensville, 1,2,Direction.EAST);
    new Wall(Owensville, 2,2,Direction.EAST);
    new Wall(Owensville, 2,1,Direction.SOUTH);
    new Wall(Owensville, 2,2,Direction.SOUTH);
    
    //Move robot
    OWEN.move();
    OWEN.move();
    
    //Turn robot left
    OWEN.turnLeft();
    
    //Move robot 
    OWEN.move();
    OWEN.move();
    OWEN.move();
    
    //Turn robot left
    OWEN.turnLeft();
    
    //Move robot 
    OWEN.move();
    OWEN.move();
    OWEN.move();
    
     //Turn robot left
    OWEN.turnLeft();
    
    //Move robot 
    OWEN.move();
    OWEN.move();
    OWEN.move();
    
    //Turn robot left
    OWEN.turnLeft();
    
    //Move robot 
    OWEN.move();
    
    
    }
}
