
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author peraa0837
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creates a city
        City kw = new City();
        //creates a robot
        Robot jet = new Robot(kw, 1, 1, Direction.EAST);

        //places down 10 things in a row
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 3);
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 5);
        new Thing(kw, 1, 6);
        new Thing(kw, 1, 7);
        new Thing(kw, 1, 8);
        new Thing(kw, 1, 9);
        new Thing(kw, 1, 10);
        new Thing(kw, 1, 11);

        //algorithm to pick 7 things up then move to end of row
        jet.move();

        while (true) {
            if (jet.countThingsInBackpack() < 7) {
                jet.pickThing();
                jet.move();


            } else {
                jet.move();
                jet.move();
                jet.move();
                break;
            }
        }
    }
}
