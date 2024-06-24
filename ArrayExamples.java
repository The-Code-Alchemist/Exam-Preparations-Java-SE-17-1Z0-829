/**
 * @author The Code Alchemist
 * From Java SE 17 Fundamentals, Looping and Arrays
 * Chapters 3: Making Decisions, page 131, 132
 */
public class ArrayExamples {
    public static void main(String[] args) {

        float[] theVals = new float[3];
        theVals[0] = 10.0F;
        theVals[1] = 20.0F;
        theVals[2] = 15.0F;

        float sum = 0.0F;
        for(int index = 0; index <theVals.length; index++) {
            sum += theVals[index];
        }
        System.out.println(sum);

        // revisit after reading
        sum = 0;
        float[] moreVals = {10F, 20F, 15F};
        for (float currentVal: moreVals) {
            sum += currentVal;
        }
        System.out.println(sum);

        // Chapter 3: Making Decisions, page 131
        int[][] myComplexArray = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7 , 12, 7}};

        /* OUTER_LOOP: */ for(int[] mySimpleArray : myComplexArray) {
           /* INNER_LOOP: */ for(int i = 0; i < mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i] + "\t");
            }
            System.out.println();

        }

        int hungryHippopotamus = 8;
        while (hungryHippopotamus > 0) {
            do {
                hungryHippopotamus -= 2;
            } while (hungryHippopotamus > 5);
            hungryHippopotamus--;
            System.out.print(hungryHippopotamus + ", ");
        } // 3, 0

        int frog = 15;
        BAD_IDEA: if (frog > 10)
        EVEN_WORSE_IDEA: {
            frog ++;
        }
    }
}
