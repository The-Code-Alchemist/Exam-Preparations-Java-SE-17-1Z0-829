/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, pages 379 - 380
 *
 * Compact constructor give you the opportunity to apply transformations to any of the input values
 * They cannot, however, modify the fields of the record
 */
package beyond_classses.record_examples;
public record AnotherCrane(int numberEggs, String name) {
    public AnotherCrane {
        if (name == null || name.length() < 1)
            throw new IllegalArgumentException();
        name = name.substring(0, 1).toUpperCase()
                + name.substring(1).toLowerCase();

        numberEggs = 10;
        // this.numberEggs = 10; // cannot assign a final variable to numberEggs, will not compile
    }
}