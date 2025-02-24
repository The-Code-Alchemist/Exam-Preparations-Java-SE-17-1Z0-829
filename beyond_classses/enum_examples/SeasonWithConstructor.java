/**
 *  Enums are used for a finite set of values whose types are known at compile time
 *
 *  enum values are comma separated with an optional semicolon ; at the end for simple enums
 *  A simple enum is one that only contains a list of values
 *
 *  A complex enum, on the other hand, has additional elements
 *
 *  All enum constructor are implicitly private with the modifier being optional/redundant
 *  An enum constructor will not compile with the public or protected modifiers
 */
package beyond_classses.enum_examples;
public enum SeasonWithConstructor {
    // The semicolon ; at the end is required when you are dealing with a complex enum
    WINTER("Low"), SPRING("Medium"), SUMMER("Hig"), FALL("Medium");
    private final String expectedVisitors;

    // All enum constructors are implicitly private, this modifier is
    private SeasonWithConstructor(String expectedVisitors) {
        this.expectedVisitors = expectedVisitors;
    }
    public void printExpectedVisitors() {
        System.out.println(expectedVisitors);
    }
}
