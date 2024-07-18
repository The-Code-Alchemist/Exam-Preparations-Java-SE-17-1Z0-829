/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, page 286, 287
 * constructor introduction
 */
package zoo.rabbits;
public class Bunny {
    /**
     * A constructor is a special method that matches the class' name' and initializes newly created objects
     * A constructor has no return type, not even void
     */
    public Bunny() {
        System.out.println("hop");
    }

    // will not even compile, since the name doesn't even match the class' case-sensitive name
    // public bunny() {}

    // not a constructor, just a void method that happens to have the same name as the class
    public void Bunny() {}
}
