/**
 * @author The Code Alchemist
 * from Chapter 2: Compound Assignment Operators, page 85
 * Comparison Examples
*/
package operators;
public class NumericComparison {
    public static void main(String[] args) {
        int gibbonNumFeet = 2, wolfNumFeet = 4, ostrichNumFeet = 2;
        System.out.println(gibbonNumFeet < wolfNumFeet);
        System.out.println(gibbonNumFeet <= wolfNumFeet);
        System.out.println(gibbonNumFeet >= ostrichNumFeet);

        // false the values are the same, one is not greater than the other
        System.out.println(gibbonNumFeet > ostrichNumFeet);
    }
}
