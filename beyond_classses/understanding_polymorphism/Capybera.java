/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, page 397
 * There is a way of preventing a ClassCastException using the instanceof operator. Line 14
 * Line 17 throws the ClassCastException
 */
package beyond_classses.understanding_polymorphism;

class Rodent {}

public class Capybera extends Rodent {
    public static void main(String[] args) {
        Rodent rodent = new Rodent();
        if(rodent instanceof Capybera) {
            // Do stuff
        }
        var capybera = (Capybera)rodent;    // ClassCastException
    }
}