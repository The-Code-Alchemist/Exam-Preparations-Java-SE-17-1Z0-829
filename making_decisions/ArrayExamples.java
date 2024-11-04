/**
 * @author The Code Alchemist
 * From Java SE 17 Fundamentals, Nested loops and Arrays (single and two-dimensional)
 */
package making_decisions;
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
    }
}
