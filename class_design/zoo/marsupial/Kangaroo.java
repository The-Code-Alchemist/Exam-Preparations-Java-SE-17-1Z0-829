/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, pages 305 - 306
 * Overriding example: this is the child class overriding the getAverageWeight() method in Marsupial
 *
 * If the call to the parent class super were to be removed on line 12,
 * the overridden method getAverageWeight() would attempt to call itself indefinitely - causing a StackOverflowException
 */
package class_design.zoo.marsupial;
public class Kangaroo extends Marsupial {
    @Override
    public double getAverageWeight() {
        return super.getAverageWeight() + 20;   // Method from parent class Marsupial overridden
    }
    public static void main(String[] args) {
        System.out.println(new Marsupial().getAverageWeight());     // 50.0
        System.out.println(new Kangaroo().getAverageWeight());      // 70.0
    }
}
