/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, pages 376, 378
 * A record is a data-only or data carrier class which reduce boilerplate code.
 * Records are implicitly public and final
 * Records separate data from operations and cannot extend classes
 *
 * Have a look at this record, it creates the data prviously handled by the CranePOJO class in a single line (11)
 *
 * Records can implement regular or sealed interfaces, but they need to implement its abstract methods
 */
package beyond_classses.record_examples;
public record Crane(int numberEggs, String name) implements Bird {

    // The long constructor automatically inserted by the Java compiler
    public Crane(int numberEggs, String name) {
        // Since each field is fina
        if (numberEggs < 0) throw new IllegalArgumentException();
        this.numberEggs = numberEggs;
        this.name = name;
    }
}