/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, page 287
 *
 * Constructor are used when creating a new object, also known as instantiation.
 * Java allocates memory for the new object. It then looks for the constructor with a matching signature and calls it.
 *
 * The default constructor is taken care of by Java when you don't create one yoursefl. It takes no arguments
 */
package class_design;
public class Turtle {
    private String name;
    // The default constructor matches the class name and takes no arguments
    public Turtle() {
        name = "John Doe";
    }
    public Turtle(int age) {}
    public Turtle(long age) {}
    public Turtle(String newName, String... favoriteFoods) {
        name = newName;
    }

    public static void main(String[] args) {
        new Turtle(15);     // int constructor called on line 15
        new Turtle(15l);    // long constructor called on line 16
        Turtle turtle = new Turtle("The Code Alchemist. Yup, I'm a turtle now :-)");
    }
}
