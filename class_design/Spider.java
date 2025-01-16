/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, page 278
 * Inheritance gone wrong example
 *
 * Field size is not accessible here, because class_design.BigCat is not inherited
 *
 * Every class implicitly extends java.lang.Object
 * This class explicitly extends java.lang.Object
 */
package class_design;

public class Spider extends Object {
    public void printDetails() {
//        System.out.println(size);     // not accessible here, Spider does not extend BigCat
    }
}
