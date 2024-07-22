/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, page 289 - 291
 * Calling overloaded constructor with this()
 */
package zoo;
public class Hamster {
    private String color;
    private int weight;
    public Hamster(int weight, String color) { // First constructor
        this.weight = weight;
        this.color = color;
    }
    public Hamster(int weight) { // Second constructor
        this.weight = weight;
        color = "Brown";
    }
}
