
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author peraa0837
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creates city
        City kw = new City();
        //creates a robot
        Robot jet = new Robot(kw, 1, 1, Direction.EAST);
        //creates the finish line
        new Thing(kw, 1, 10);
        //Creates the walls of the race course
        new Wall(kw, 1, 1, Direction.SOUTH);
        new Wall(kw, 1, 2, Direction.SOUTH);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 1, 3, Direction.SOUTH);
        new Wall(kw, 1, 4, Direction.SOUTH);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 1, 5, Direction.SOUTH);
        new Wall(kw, 1, 6, Direction.SOUTH);
        new Wall(kw, 1, 7, Direction.SOUTH);
        new Wall(kw, 1, 7, Direction.EAST);
        new Wall(kw, 1, 8, Direction.SOUTH);
        new Wall(kw, 1, 9, Direction.SOUTH);
        new Wall(kw, 1, 10, Direction.SOUTH);

        //creates the algorithm to run the race
        while (!jet.canPickThing()) {


            while (jet.frontIsClear()) {
                jet.move();
                if (jet.canPickThing()) {
                    break;
                }


            }
            //jumps a hurdle
            if (!jet.frontIsClear()) {
                jet.turnLeft();
                jet.move();
                jet.turnLeft();
                jet.turnLeft();
                jet.turnLeft();
                jet.move();
                jet.turnLeft();
                jet.turnLeft();
                jet.turnLeft();
                jet.move();
                jet.turnLeft();

            }


        }

    }
}
