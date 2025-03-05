/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, page 396
 * If the Wolf class were final, the ClassCastException on line 22 would not occur.
 * The code would not compile to begin with, because the compiler knows there are no possible subclasses of Wolf
 */
package beyond_classses.understanding_polymorphism;

interface Canine{}
interface Dog {}
class Wolf implements Canine {}     // Try this class by making it final

public class BadCasts {
    public static void main(String[] args) {
        Wolf wolfy = new Wolf();

        // Wolf implements Canine, so this cast is allowed
        Canine goodWolf = (Canine) wolfy;

        // Dog and Wolf are not related. ClassCastException is thrown at runtime
        // Remove the cast or let the Wolf class implement the Dog interface
        Dog badWolf = (Dog) wolfy;
    }
}
