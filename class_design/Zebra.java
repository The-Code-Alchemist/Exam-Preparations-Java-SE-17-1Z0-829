/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, page 292
 *
 */
package class_design;
public class Zebra extends Animal {
    public Zebra(int age) {
        super(age);         // Refers to the constructor in Animal, its direct superclass
    }
    public Zebra() {
        this(4);        // Refers to the constructor in this class on line 8 with int argument
    }
}
