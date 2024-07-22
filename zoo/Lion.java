/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, page 281
 * Lion moved to its own class
 */
package zoo;
public class Lion extends Animal {
    public Lion(int age) {
        super(age);
    }

    protected void setProperties(int age, String n) {
        setAge(age);    // Indirectly accesses the age field in Animal
        name = n;
    }
    public void roar() {
        System.out.println(name + ", age " + getAge() + ", says: Roar!");
    }
    public static void main(String[] args) {
        var lion = new Lion(1);
        lion.setProperties(3, "kion");
        lion.roar();
    }
}