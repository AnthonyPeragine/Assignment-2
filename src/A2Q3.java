
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peraa0837
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a city
        City kw = new City();
        //create a robot
        Robot jet = new Robot(kw, 12, 4, Direction.SOUTH);
        //main program
        if (jet.getDirection() == Direction.EAST){
            jet.turnLeft();
            jet.turnLeft();
        }
        if (jet.getDirection() == Direction.SOUTH){
            jet.turnLeft();
            jet.turnLeft();
            jet.turnLeft();
        }
        while (jet.getAvenue() > 0){
            jet.move();
        }
        while (jet.getStreet() > 0){
            if (jet.getDirection() == Direction.WEST){
                jet.turnLeft();
                jet.turnLeft();
                jet.turnLeft();
            }
            jet.move();
        }
        
    }
}
