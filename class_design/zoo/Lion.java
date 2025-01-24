/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, pages 281 - 282
 * Lion is a child class of Animal
 *
 * This class cannot be public if it is in another source file that is already public such as Animal.java
 */
package class_design.zoo;

public class Lion extends Animal {
    protected void setProperties(int age, String n) {
        setAge(age);                // Indirectly accesses the age field in Animal with this setter
        name = n;                   // Directly accessible from Animal through inheritance
    }
    public void roar() {
        System.out.println(name + ", age " + getAge() + ", says: Roar!");
//      System.out.println(age);    // age is not accessible directly due to private access in Animal
    }
    public static void main(String[] args) {
        var lion = new Lion();
        lion.setProperties(3, "kion");
        lion.roar();
    }
}