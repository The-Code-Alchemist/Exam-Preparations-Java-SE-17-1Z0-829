/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, page 288, 289
 * default constructor example
 */
package class_design.rabbits;
public class Rabbit {
    Rabbit() {} // no-args constructor inserted by the Java compiler if not user-defined
    public static void main(String[] args) {
        new Rabbit(); // creates a new rabbit by calling the user-defined default constructor on line 8
    }
}
