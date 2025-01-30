/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, pages 282
 * A .java source can contain as many classes, but can have at most one public class
 * Bear is the only class that can be public In this example, since it matches the name of the sourc file Bear.java
 *
 * Inner classes can be private such as BearCub on line 15
 *
 * Declaring a top-level protected or private will lead to a compiler error
 * the public class does not have to be placed in any particular order
 */
package class_design.zoo;
public class Bear {
    // inner classes can be private which will be discussed later in the next chapter: Beyond Classes
    private class BearCub {}
}
class Bird {}
class Fish {}