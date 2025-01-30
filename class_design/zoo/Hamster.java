/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, page 289 - 291
 * Calling overloaded constructor with this() - more on that later
 */
package class_design.zoo;
public class Hamster {
    private String color;
    private int weight;

    // First constructor
    public Hamster(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    // Second constructor
    public Hamster(int weight) {

        // The following line would this constructor indefinitely like an infinite loop. Java picks up on that and does not compile
//      this(1);
        this.weight = weight;
        color = "Brown";
    }
}
