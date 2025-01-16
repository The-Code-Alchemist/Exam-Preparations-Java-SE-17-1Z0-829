/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, page 277
 * Inheritance example
 */
package class_design;

public class Jaguar extends BigCat {
    public Jaguar() {
        size = 10.2;    // field inherited from: class_design.BigCat
    }
    public void printDetails() {
        System.out.println(size);
    }

    public static void main(String[] args) {
        var j = new Jaguar();
        j.printDetails();
    }
}
