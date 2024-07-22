/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, page 292
 *
 */
package zoo;
public class Zebra extends Animal {
    public Zebra(int age) {
        super(age);         // Refers to the constructor in Animal, its superclass
    }
    public Zebra() {
        this(4);
    }
}
