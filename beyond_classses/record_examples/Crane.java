/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, pages 374 - 375
 * This class is a simple POJO - Plain Old Java Object - example with two fields.
 * A Java Bean is a POJO with some additional rules applied.
 */
package beyond_classses.record_examples;
public class Crane {
    private final int numberEggs;

    private final String name;
    public Crane(int numberEggs, String name) {
        if(numberEggs > 0) this.numberEggs = numberEggs;   // guard condition
        else throw new IllegalArgumentException();
        this.name = name;
    }
    public int getNumberEggs() {
        return numberEggs;
    }

    public String getName() {
        return name;
    }
}
