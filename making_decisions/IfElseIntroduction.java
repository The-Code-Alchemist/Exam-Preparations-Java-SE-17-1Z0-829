/**
 * @author The Code Alchemist
 * From Java SE 17 Fundamentals, if-else examples
 * Chapters 3: Making Decisions, pages 104, 105, 106
 */
package making_decisions;
public class IfElseIntroduction {
    public static void main(String[] args) {
        int hourOfDay = 9, morningGreetCount = 0;
        if(hourOfDay < 11)  // this condition MUST have a boolean value, no ther types allowed
            System.out.println("Good morning");
            morningGreetCount++;    // independent of the if statement above
        /** will not compile, because the previous line is not part of the if statement */
        // else { System.out.println("Good afternoon"); }

        if(hourOfDay < 11) {
            System.out.println("Good Morning");
            morningGreetCount++;                    // will be executed as long as the if condition is met
            System.out.println(morningGreetCount);  // will be executed as long as the if condition is met
        } else if (hourOfDay >= 11) {
            System.out.println("Good Afternoon");
        } else {    // executed if neither the if nor the else if block is executed
            System.out.println("Good Evening");
        }
    }
}