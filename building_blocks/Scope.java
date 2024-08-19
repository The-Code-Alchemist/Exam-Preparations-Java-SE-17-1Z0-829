/**
 * @author The Code Alchemist
 * from Chapter 1: Building Blocks, page 50
 * Objects, references and garbage collections
 * Object "a" becomes eligible for gabage collection once the reference one point to object "b"
 * Object "b" exists until the main method is done executing
 */
package building_blocks;
public class Scope {
    public static void main(String[] args) {
        String one, two;
        one = new String("a");
        System.out.println(one);
        two = new String("b");
        System.out.println(two);
        one = two;
        System.out.println(one);
        String three = one;
        System.out.println(three);
        one = null;
        System.out.println(one);
    }
}