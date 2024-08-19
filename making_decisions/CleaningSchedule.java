/**
 * @author The Code Alchemist
 * Chapter 3: Making Decisions, page 135, 136
 * Two-dimensional arrays combined with a continue statement in a for loop
 */
package making_decisions;
public class CleaningSchedule {
    public static void main(String[] args) {
        CLEANING: for(char stables = 'a'; stables <= 'd'; stables++) {
            for (int leopard = 1; leopard < 4; leopard++) {
                if(stables == 'b' || leopard == '2') {
                    continue CLEANING;
                }
                System.out.println("Cleaning: " + stables + ", " +leopard);
            }
        }
    }
}