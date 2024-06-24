/**
 * @author The Code Alchemist
 * Chapters 4: Core APIs, page 179, 180, 181, 182, 183
 */
public class MoreAboutArrays {
    public static void main(String[] args) {
        // the default value for the elements in this int array are set to 0
        int[] numbers = new int[3];
        int[] moreNumbers = new int[] {42, 55, 99};
        int[] evenMoreNumbers = {42, 55, 99};       // does exactly the same as the line above
        for (int i = 0; i <= 2; i++) {
            System.out.print(numbers[i] + " ");
            System.out.println(moreNumbers[i]);
            System.out.println(evenMoreNumbers[i]);
        }

        String[] bugs = {"cricket", "", ""};
        String[] alias = bugs;
        for (int i = 0; i <= 2; i++) {
            System.out.print(bugs.equals(alias) + " ");
            System.out.print((bugs == alias) + " ");
            System.out.print(bugs.toString() + " ");
            System.out.println(alias.toString());
        }

        // Defining multiple String arrays of multiple dimensions are defined here
        String one[], two[][], three[][][];

        // Arrays
        String[] strings = { "stringValue" };
        Object[] objects = strings;                     // No casting needed, Object is a broader type than String
        String[] againStrings = (String[]) objects;     // Casting required for more specific types
//      againStrings[0] = new StringBuilder();          // Will not compile as it is
        againStrings[0] = String.valueOf(new StringBuilder());
        againStrings[0] = new String();

        String[] mammals = {"monkey", "chimp", "donkey"};
        System.out.println(mammals.length);
        System.out.println(mammals[0]);
        System.out.println(mammals[1]);
        System.out.println(mammals[2]);

        var birds = new String[6];
        System.out.println(birds);          // reference to the String array birds
        System.out.println(birds.length);   // 6
    }
}
