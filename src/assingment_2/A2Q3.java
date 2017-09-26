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
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Create city
        City Owensville = new City();
        //Create robot
        Robot OWEN = new Robot(Owensville, 4, 3, Direction.WEST);

        //move robot
        while (true) {


            if (OWEN.getDirection() == Direction.NORTH) {
                if (OWEN.getStreet() < 0) {
                    OWEN.turnLeft();
                    OWEN.turnLeft();

                } else {
                    if (OWEN.getStreet() > 0) {
                        OWEN.move();

                    }
                }
            }

            if (OWEN.getDirection() == Direction.SOUTH) {
                if (OWEN.getStreet() > 0) {
                    OWEN.turnLeft();
                    OWEN.turnLeft();

                } else {
                    if (OWEN.getStreet() < 0) {
                        OWEN.move();

                    }
                }
            }

            if (OWEN.getDirection() == Direction.WEST) {
                if (OWEN.getAvenue() > 0) {
                    OWEN.move();

                } else {
                    if (OWEN.getAvenue() < 0) {
                        OWEN.turnLeft();
                        OWEN.turnLeft();

                    }
                }
            }



            if (OWEN.getDirection() == Direction.EAST) {
                if (OWEN.getAvenue() < 0) {
                    OWEN.move();

                } else {
                    if (OWEN.getAvenue() > 0) {
                        OWEN.turnLeft();
                        OWEN.turnLeft();


                    }

                }
            }

            if (OWEN.getDirection() == Direction.NORTH) {
                if (OWEN.getStreet() == 0) {
                    if (OWEN.getAvenue() > 0) {
                        OWEN.turnLeft();
                    }

                } else {
                    if (OWEN.getStreet() == 0) {
                        if (OWEN.getAvenue() < 0) {
                            OWEN.turnLeft();
                        }


                    }
                }
            }
            if (OWEN.getDirection() == Direction.SOUTH) {
                if (OWEN.getStreet() == 0) {
                    if (OWEN.getAvenue() > 0) {
                        OWEN.turnLeft();
                    }

                } else {
                    if (OWEN.getStreet() == 0) {
                        if (OWEN.getAvenue() < 0) {
                            OWEN.turnLeft();
                        }


                    }



                }
            }
            if (OWEN.getDirection() == Direction.WEST) {
                if (OWEN.getAvenue() == 0) {
                    if (OWEN.getStreet() > 0) {
                        OWEN.turnLeft();
                    }

                } else {
                    if (OWEN.getAvenue() == 0) {
                        if (OWEN.getStreet() < 0) {
                            OWEN.turnLeft();
                        }


                    }



                }
            }
            if (OWEN.getDirection() == Direction.EAST) {
                if (OWEN.getAvenue() == 0) {
                    if (OWEN.getStreet() > 0) {
                        OWEN.turnLeft();
                    }

                } else {
                    if (OWEN.getAvenue() == 0) {
                        if (OWEN.getStreet() < 0) {
                            OWEN.turnLeft();
                        }


                    }



                }
            }


        }
    }
}
