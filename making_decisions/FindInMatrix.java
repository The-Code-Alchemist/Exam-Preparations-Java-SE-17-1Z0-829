/**
 * @author The Code Alchemist
 * Chapter 3: Making Decisions, page 133, 134
 * Two-dimensional arrays combined with a labeled for loop
 * Labels are NOT part of the exam
 */
package making_decisions;
public class FindInMatrix {
    public static void main(String[] args) {
        int[][] list = {{1, 13}, {5, 2}, {2, 2}};
        int searchValue = 2;
        int positionX = -1;
        int positionY = -1;
        PARENT_LOOP: for(int i = 0; i < list.length; i++) {
            for(int j = 0; j < list[i].length; j++) {
                if(list[i][j] == searchValue) {
                    positionX = i;
                    positionY = j;
                    break PARENT_LOOP; // terminates the entire for loop at the first match
                    /**
                     * if break is used instead of the previous line, would only exit if the condition was met
                     * The program will now only exit the inner loop when the condition was met
                     */
//                    break;
                }
            }
        }
        if(positionX == -1 || positionY == -1) {
            System.out.println("Value " + searchValue + "not found");
        } else {
            System.out.println("Value " + searchValue + " found at: " + "(" + positionX + ", " + positionY + ") ") ;
        }
    }
}