/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, pages 376
 * A record is a data-only or data carrier class which reduce boilerplate code.
 * Records are always public and final
 * Records separate data from operations and cannot extend classes
 *
 * Have a look at this record, it creates the data prviously handled by the CranePOJO class in a single line (11)
 */
package beyond_classses.record_examples;
public record Crane(int numberEggs, String name) {}