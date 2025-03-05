/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, pages 395 - 397
 * Polymorphism: you cannot cast to an incompatible type. Same is true for the instanceof operator
 * Fish and Bird are not related through a class hierarchy, except that java.lang.Object is their parent class
 */
package beyond_classses.understanding_polymorphism;
public class Fish {
    public static void main(String[] args) {
        Fish fish = new Fish();
    //  Bird bird = (Bird)fish;     // You cannot cast incompatible types

    //  if (fish instanceof Bird)   // You cannot use instanceof with unrelated types
        {
            // Do stuff
        }
    }
}