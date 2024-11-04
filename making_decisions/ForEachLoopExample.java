/**
 * @author The Code Alchemist
 * from Chapter 3: Making Decisions, page 129-130
 * The enhanced for loop, also known as the for-each loop is a specialized structure designed to
 * iterate over arrays and various Collection Framework classes or interfaces that implement or extend that Collection
 * interface.
 * Map is not supported in a for-each loop, although Map includes methods that returns Collection instances
 */
package making_decisions;

import java.util.List;

public class ForEachLoopExample {
    public static void main(String[] args) {
        String[] names = {"The"," ","Code", " ", "Alchemist", " ", "preparing for the 1Z0-829 exam: Java SE 17", "\n"};
        // This method prints a String array using a regular fopr loop
        printNameRegularForLoop(names);
        // This method prints a String array using a for-each loop, also known as the enhanced for loop
        printNameEnhacedForLoop(names);

        // a new line for each element
        printNames(List.of(names));
    }

    public static void printNameRegularForLoop(String[] names) {
        for (int counter = 0; counter < names.length ; counter++) {
            System.out.print(names[counter]);
        }
    }

    /**
     * @param names
     * The for-each loop is composed of an initialization section and an object to be iterated over
     * The right side must be one of the following:
     * 1. A built-in Java array, or
     * 2. An object whose type implements java.lang.Iterable. A collection of items such as
     *      java.lang.List or java.lang.Set
     */
    public static void printNameEnhacedForLoop(String[] names) {
        for (var name : names) {
            System.out.print(name);
        }
    }

    public static void printNames(List<String> names) {
        for(var name : names) {
            System.out.println(name);
        }
    }
}

