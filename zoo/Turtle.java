/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, page 286, 287
 * constructor overloading example
 */
package zoo;
public class Turtle {
    private String name;
    public Turtle() {
        name = "John Doe";
    }
    public Turtle(int age) {}
    public Turtle(long age) {}
    public Turtle(String newName, String... favoriteFoods) {
        name = newName;
    }

    public static void main(String[] args) {
        new Turtle(15);     // int  constructor called
        new Turtle(15l);    // long constructor called
        Turtle turtle = new Turtle("The Code Alchemist. Yup, I'm a turtle now :-)");
        System.out.println(turtle.name);
    }
}
