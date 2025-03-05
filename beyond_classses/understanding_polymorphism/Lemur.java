/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, pages 392 - 395
 *
 * The property of an object can take many different forms.
 * A cast is not required if the object is being reassigned to a supertype or interface.
 * Only one object, Lemur is created. The same object exists in memory, regardless of which reference is pointing to it.
 *
 * Polymorphism enables an instance of Lemur to be reassigned or passed to a method using of it supertypes,
 * such asPrimate or HasTail.
 *
 * Casting a reference from a supertype to a subtype requires an explicit cast, line 43
 */
package beyond_classses.understanding_polymorphism;
public class Lemur extends Primate implements HasTail {
    @Override
    public boolean isTailStriped() {
        return false;
    }
    public int age = 10;

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);

        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped());

        Primate primate = lemur;
        System.out.println(primate.hasHair());

        /*
          Since all objects inherit from java.lang.Object, they can all be reassigned to it.
          Even though the Lemur object has been assigned to a reference with a different type,
          the object itself has not changed and still exist as a Lemur in memory.
          What HAS changed, is the ability to access methods within the Lemur class with the lemurAsObject reference.
          Without an explicit case back to Lemur, we no longer have access to the Lemur properties ogf the object
         */
        Object lemurAsObject = lemur;

        // Casting Objects
        Primate anotherPrimate = new Lemur();           // Implicit cast to supertype
        Lemur anotherLemur = (Lemur) anotherPrimate;    // Explicit cast to subtype gains access to all of the methods and fields in the Lemur class
     // Lemur anotherLemurAgain = anotherPrimate;       // Will not compile without an explicit cast
    }
}