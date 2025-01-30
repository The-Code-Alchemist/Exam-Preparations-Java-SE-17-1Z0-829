/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, page 288, 289
 * default constructor example
 */
package class_design.rabbits;
public class RabbitsMultiply {
    public static void main(String[] args) {
        var r1 = new Rabbit1();         // calls the default constructor
        var r2 = new Rabbit2();         // calls user-defined constructor
        var r3 = new Rabbit3(true);  // calls user-defined constructor
        var r4 = new Rabbit4();         // will not compile with a private constructor, package-private will work
    }
}
