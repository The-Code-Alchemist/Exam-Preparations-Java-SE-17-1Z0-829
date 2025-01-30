/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, pages 285 - 286
 * this and super example of variables used and their scope
 *
 * label is accessible through t
 */

package class_design.zoo;
class Insect {
    protected int numberOfLegs = 4;
    String label = "buggy";
}

public class Beetle extends Insect {
    protected int numberOfLegs = 6;
    short age = 3;
    String label = "subclass " + super.label;
    public void printData() {
        System.out.println(this.label);         // subclass buggy
        System.out.println(super.label);        // buggy
        System.out.println(this.age);           // 3
//        System.out.println(super.age);        // will not compile, age only in subclass
        System.out.println(numberOfLegs);       // 6
        System.out.println(this.numberOfLegs);  // 6 - same as the previous example, but more explicit
        System.out.println(super.numberOfLegs); // 4 - from the Insect class
    }
    public static void main(String[] args) {
        new Beetle().printData();               // the Beetle object calls printData as it is instantiated
    }
}