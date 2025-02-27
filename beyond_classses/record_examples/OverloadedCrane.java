/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, page 380
 * It is possible to create overloaded constructors that take a completely different list of parameters
 */
package beyond_classses.record_examples;
public record OverloadedCrane(int numberEggs, String name) {
    public OverloadedCrane(String firstName, String lastName) {
        this(0, firstName + " " + lastName);

    }

    public OverloadedCrane(int numberEggs, String firstName, String lastName) {
        this(numberEggs + 1, firstName + " " + lastName);
        numberEggs = 10; // NO EFFECT (applies to parameter, not the instance field)
        // this.numberEggs = 20 // DOES NOT COMPILE

    }
}
