/**
 * @author The Code Alchemist
 * from Chapter 2: Compound Assignment Operators, pages 88
 * Logical operator examples
 */
package operators;
public class LogicalOperators {
    public static void main(String[] args) {
        boolean eyesClosed = true;
        boolean breathingSlowly = true;

        boolean resting = eyesClosed | breathingSlowly;
        System.out.println(resting);
        boolean asleep  = eyesClosed & breathingSlowly;
        System.out.println(asleep);
        boolean awake   = eyesClosed ^ breathingSlowly;
        System.out.println(awake);  // will be true if one of the operand is false
    }
}