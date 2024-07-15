/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, page 281
 * Two classes in a single .java source file
 * Only one of these classes can be public. Animal.java is public and matches the source file name
 */
package zoo;
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

class Lion extends Animal {
    protected void setProperties(int age, String n) {
        setAge(age);    // indirectly accesses the age field in Animal
        name = n;
    }
    public void roar() {
        System.out.println(name + ", age " + getAge() + ", says: Roar!");
    }
    public static void main(String[] args) {
        var lion = new Lion();
        lion.setProperties(3, "kion");
        lion.roar();
    }
}
