/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, page 281
 * Two classes in a single .java source file
 * Only one of a source file's classes can be public. Animal.java is public and matches the source file name
 */
package zoo;
public class Animal {
    private int age;
    public Animal(int age) {
        super();            // Refers to the constructor in java.lang.Object
        this.age = age;
    }

    protected String name;
    public int getAge() {
        return age;
    }
    public void setAge(int newAge) {
        age = newAge;
    }
}
