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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Create city
      City Owensville =new City();
      //Create robot
      Robot OWEN = new Robot(Owensville, 3, 0, Direction.EAST);  
      
      //Create wall
      new Wall(Owensville, 3,2,Direction.WEST);
      new Wall(Owensville, 3,2,Direction.NORTH);
      new Wall(Owensville, 2,3,Direction.WEST);
      new Wall(Owensville, 1,3,Direction.WEST);
      new Wall(Owensville, 1,3,Direction.NORTH);
      new Wall(Owensville, 1,3,Direction.EAST);
      new Wall(Owensville, 2,4,Direction.NORTH);
      new Wall(Owensville, 2,4,Direction.EAST);
      new Wall(Owensville, 3,4,Direction.EAST);
      
      //Create thing
      new Thing(Owensville, 3,1,Direction.NORTH);
      
      //Move robot
     OWEN.move();
      
      //robot pick p thing
     OWEN.pickThing();
      
      //Robot turns left
     OWEN.turnLeft();
     
     //Move robot
     OWEN.move();
     
     //Robot turns left
     OWEN.turnLeft();
     OWEN.turnLeft();
     OWEN.turnLeft(); 
      
      //Move robot
     OWEN.move();
      
      //Robot turns left
     OWEN.turnLeft();
     
      //Move robot
     OWEN.move();
     
     //Move robot
     OWEN.move();
     
     //Robot turns left
     OWEN.turnLeft();
     OWEN.turnLeft();
     OWEN.turnLeft(); 
     
     //Move robot
     OWEN.move();
     
     //Put down object
     OWEN.putThing();
     
     //Move robot
     OWEN.move();
     
     //Robot turns left
     OWEN.turnLeft();
     OWEN.turnLeft();
     OWEN.turnLeft(); 
     
     //Move robot
     OWEN.move();
     
     //Robot turns left
     OWEN.turnLeft();
   
     //Move robot
     OWEN.move();
     
     //Robot turns left
     OWEN.turnLeft();
     OWEN.turnLeft();
     OWEN.turnLeft(); 
     
     //Move robot
     OWEN.move();
     OWEN.move();
     
     
     
     
     
     
    }
}
