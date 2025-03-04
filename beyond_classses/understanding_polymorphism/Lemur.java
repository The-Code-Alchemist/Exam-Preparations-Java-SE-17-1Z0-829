/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, pages 392 - 393
 *
 * The property of an object can take many different forms.
 * A cast is not required if the object is being reassigned to a supertype or interface.
 * Only one object, Lemur is created.
 *
 * Polymorphism enables an instance of Lemur to be reassigned or passed to a method using of it supertypes,
 * such asPrimate or HasTail
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
        // System.out.println(hasTail.age);                 //

        Primate primate = lemur;
        System.out.println(primate.hasHair());
        // System.out.println(primate.isTailStriped());     //
    }
}