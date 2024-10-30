/**
 * @author The Code Alchemist
 * From Java SE 17 Fundamentals, if-else equivalency example
 * if statements on lines 13 and 18 are equivalent, because there is only one statement being executed
 * braces are necessary if a block of statements is executed. Once the if condition is met of course such as line 13
 * Chapters 3: Making Decisions, page 103
 */
package making_decisions;

public class IfElseEquivalency {
    public static void main(String[] args) {
        int x = 0;

        if(x < 1) {
            x++;
        }
        System.out.println(x);

        if(x == 1)
            x--;
        System.out.println(x);
    }
}
