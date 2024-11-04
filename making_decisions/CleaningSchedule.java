/**
 * @author The Code Alchemist
 * Chapter 3: Making Decisions, page 135, 136
 * A continue statement in a for loop
 *
 * The loop will return control to the parent loop any time the first value is 'b' or if the second value is '2'
 */
package making_decisions;
public class CleaningSchedule {
    public static void main(String[] args) {
        CLEANING: for(char stables = 'a'; stables <= 'd'; stables++) {
            for (int leopard = 1; leopard < 4; leopard++) {
                if(stables == 'b' || leopard == '2') {
                    continue CLEANING;
                }
                System.out.println("Cleaning: " + stables + ", " + leopard);
            }
        }
    }
}