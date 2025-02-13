/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, page 278 - 280
 *
 * This class inherits java.lang.Object ecplicitly
 * Every class implicitly extends java.lang.Object
 *
 * java.lang.Object is the only class without a parent class
 *
 * Field size (line 16) is not accessible here, because class_design.zoo.panthera.BigCat is not inherited
 */
package class_design;

public class Spider extends Object {
    public void printDetails() {
//        System.out.println(size);
    }
}
