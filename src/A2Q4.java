
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author peraa0837
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a city
        City kw = new City();
        //create a robot
        Robot jet = new Robot(kw, 0, 0, Direction.EAST);
        //create the castle
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.SOUTH);
        new Wall(kw, 1, 1, Direction.EAST);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 2, Direction.NORTH);
        new Wall(kw, 2, 2, Direction.WEST);
        new Wall(kw, 2, 3, Direction.NORTH);
        new Wall(kw, 3, 2, Direction.WEST);
        new Wall(kw, 2, 3, Direction.EAST);
        new Wall(kw, 3, 3, Direction.EAST);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 1, 4, Direction.SOUTH);
        new Wall(kw, 1, 4, Direction.WEST);
        new Wall(kw, 4, 1, Direction.NORTH);
        new Wall(kw, 4, 1, Direction.EAST);
        new Wall(kw, 4, 1, Direction.SOUTH);
        new Wall(kw, 4, 1, Direction.WEST);
        new Wall(kw, 4, 4, Direction.NORTH);
        new Wall(kw, 4, 4, Direction.EAST);
        new Wall(kw, 4, 4, Direction.SOUTH);
        new Wall(kw, 4, 4, Direction.WEST);

        //patrol routine
        while (true) {
            while (jet.getStreet() == 0) {
                jet.move();
                if (jet.getAvenue() == 2 && jet.getStreet() == 0) {
                    jet.turnLeft();
                    jet.turnLeft();
                    jet.turnLeft();
                    jet.move();
                    jet.turnLeft();
                    jet.move();
                    jet.turnLeft();
                    jet.move();
                    jet.turnLeft();
                    jet.turnLeft();
                    jet.turnLeft();
                }
                if (jet.getAvenue() == 5 && jet.getStreet() == 0) {
                    jet.turnLeft();
                    jet.turnLeft();
                    jet.turnLeft();
                }
                while (jet.getAvenue() == 5) {
                    jet.move();
                    if (jet.getStreet() == 2 && jet.getAvenue() == 5) {
                        jet.turnLeft();
                        jet.turnLeft();
                        jet.turnLeft();
                        jet.move();
                        jet.turnLeft();
                        jet.move();
                        jet.turnLeft();
                        jet.move();
                        jet.turnLeft();
                        jet.turnLeft();
                        jet.turnLeft();
                    }
                    if(jet.getStreet() == 5){
                        jet.turnLeft();
                        jet.turnLeft();
                        jet.turnLeft(); 
                    }
                    while(jet.getStreet() == 5){
                        jet.move();
                        if(jet.getAvenue() == 3 && jet.getStreet() == 5){
                            jet.turnLeft();
                        jet.turnLeft();
                        jet.turnLeft();
                        jet.move();
                        jet.turnLeft();
                        jet.move();
                        jet.turnLeft();
                        jet.move();
                        jet.turnLeft();
                        jet.turnLeft();
                        jet.turnLeft();
                        }
                        if(jet.getAvenue() == 0){
                            jet.turnLeft();
                            jet.turnLeft();
                            jet.turnLeft();
                        }
                        while(jet.getAvenue() == 0){
                            jet.move();
                            if(jet.getStreet() == 3 && jet.getAvenue() == 0){
                                jet.turnLeft();
                        jet.turnLeft();
                        jet.turnLeft();
                        jet.move();
                        jet.turnLeft();
                        jet.move();
                        jet.turnLeft();
                        jet.move();
                        jet.turnLeft();
                        jet.turnLeft();
                        jet.turnLeft();
                            }
                            if(jet.getStreet() == 0 && jet.getAvenue() == 0){
                                jet.turnLeft();
                                jet.turnLeft();
                                jet.turnLeft();
                                
                            }
                        }
                    }
                }
            }


        }
    }
}
