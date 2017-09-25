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
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Create city
        City Owensville = new City();
        //Create robot
        Robot OWEN = new Robot(Owensville, 1, 2, Direction.EAST);

        //Create wall
        new Wall(Owensville, 1, 1, Direction.NORTH);
        new Wall(Owensville, 1, 1, Direction.EAST);
        new Wall(Owensville, 1, 1, Direction.WEST);
        new Wall(Owensville, 1, 1, Direction.SOUTH);
        new Wall(Owensville, 1, 4, Direction.NORTH);
        new Wall(Owensville, 1, 4, Direction.EAST);
        new Wall(Owensville, 1, 4, Direction.WEST);
        new Wall(Owensville, 1, 4, Direction.SOUTH);
        new Wall(Owensville, 4, 1, Direction.NORTH);
        new Wall(Owensville, 4, 1, Direction.EAST);
        new Wall(Owensville, 4, 1, Direction.WEST);
        new Wall(Owensville, 4, 1, Direction.SOUTH);
        new Wall(Owensville, 4, 4, Direction.NORTH);
        new Wall(Owensville, 4, 4, Direction.EAST);
        new Wall(Owensville, 4, 4, Direction.WEST);
        new Wall(Owensville, 4, 4, Direction.SOUTH);
        new Wall(Owensville, 2, 2, Direction.NORTH);
        new Wall(Owensville, 2, 1, Direction.EAST);
        new Wall(Owensville, 2, 4, Direction.WEST);
        new Wall(Owensville, 3, 2, Direction.SOUTH);
        new Wall(Owensville, 2, 3, Direction.NORTH);
        new Wall(Owensville, 3, 1, Direction.EAST);
        new Wall(Owensville, 3, 4, Direction.WEST);
        new Wall(Owensville, 3, 3, Direction.SOUTH);
        
        
        //Move robot
        
        while(true){
        
        if (OWEN.frontIsClear()){
        OWEN.move();
        
        
        }else{
        if (!(OWEN.frontIsClear())){
        OWEN.turnLeft();
        OWEN.move();
        OWEN.turnLeft();
        OWEN.turnLeft();
        OWEN.turnLeft();
        OWEN.move();
        OWEN.move();
        OWEN.turnLeft();
        OWEN.turnLeft();
        OWEN.turnLeft();
        OWEN.move();
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
