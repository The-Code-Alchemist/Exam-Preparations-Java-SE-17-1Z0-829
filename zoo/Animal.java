/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, page 281, 293, 294, 297
 * Initializing Objects
 */
package zoo;
public class Animal {

    static {
        System.out.print("A"); // executed first as a superclass
    }

    private int age;
    protected String name;

    public Animal(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }

    public Animal(int age) {
        super();            // Refers to the constructor in java.lang.Object
        this.age = age;
        this.name = null;   // although name is not passed into this constructor, it can be assigned a value
    }
    public int getAge() {
        return age;
    }
    public void setAge(int newAge) {
        age = newAge;
    }
}
