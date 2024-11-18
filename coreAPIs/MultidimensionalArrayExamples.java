/**
 * @author The Code Alchemist
 * Chapters 4: Core APIs, pages 188 - 190
 * Multidimensional arrays are arrays within arrays
 */
package coreAPIs;
public class MultidimensionalArrayExamples {
    public static void main(String[] args) {

        // Declaring 2D arrays
        int[][] vars1;
        int vars2 [][];
        int[] vars3 [];

        // A 2D array followed by a 3D array, declared on the same line
        int[] vars4 [], space [][];

        // You can declare the size of your multidimensional array in the declaration
        String [][] rectangle = new String[3][2];
        rectangle [0][1] = "set";   // the rest of the String values are set to null

        int [][] differentSizes = {{1,4}, {3}, {9, 8, 7}};

        int [][] arguments = new int[4][];
        arguments[0] = new int[5];
        arguments[1] = new int[3];

        // We have two loops here: i goes through the subarray for twoD
        var twoD = new int[3][2];
        for(int i = 0; i < twoD.length; i++) {
            // This loop looks at how many elements are in the second-level array
            for(int j = 0; j < twoD[i].length; j++) {
                // The inner loop prints the element and leaves a space for readability
                System.out.print(twoD[i][j] + " "); // print element
            System.out.println();                   // time for a new row
            }
        }
        System.out.println("");

        // The previous multidimensional array using enhanced for loops
        for(int[] inner : twoD) {
            for(int num : inner) {
                System.out.print(num + " ");        // print element
            System.out.println();                   // time for a new row
            }
        }
    }
}
