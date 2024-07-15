/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, page 277
 * Inheritance example
 */
package zoo;
public class Jaguar extends BigCat {
    public Jaguar() {
        size = 10.2;
    }
    public void printDetails() {
        System.out.println(size);
    }
}
