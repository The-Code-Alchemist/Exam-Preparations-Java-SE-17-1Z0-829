/**
 * @author The Code Alchemist
 * Chapters 4: Core APIs, page 179,
 */
public class MoreAboutArrays {
    public static void main(String[] args) {
        // the default value for the elements in this int array are set to 0
        int[] numbers = new int[3];
        int[] moreNumbers = new int[] {42, 55, 99};
        int[] evenMoreNumbers = {42, 55, 99}; //
        for (int i = 0; i <= 2; i++) {
            System.out.print(numbers[i] + " ");
            System.out.println(moreNumbers[i]);
            System.out.println(evenMoreNumbers[i]);
        }
    }
}
