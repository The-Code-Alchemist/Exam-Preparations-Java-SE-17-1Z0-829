/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, pages 281 - 282
 * Animal is the parent class in this package
 */
package class_design.zoo;

public class Animal {
    private int age;
    protected String name;

    public int getAge() {
        return age;
    }
    public void setAge(int newAge) {
        age = newAge;
    }
}
