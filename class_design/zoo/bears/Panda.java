/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, pages 311 - 312
 * Hiding static methods: the eat method in bear is hidden by the eat method in Panda
 * N.B the eat mehod is NOY overridden!
 */
package class_design.zoo.bears;
public class Panda extends Bear {
    public static void eat() {
        System.out.println("Panda is chewing");
    }
    public static void main(String[] args) {
        /**
         * Panda is chewing
         * Bear is eating - if the eat() method is removed on line 8
         */
        eat();
    }
}
