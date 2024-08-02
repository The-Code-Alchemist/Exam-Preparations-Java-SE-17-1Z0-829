/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, page 285
 * this and super example of variables used and their scope
 */
package zoo;

public class Beetle extends Insect {
    protected int numberOfLegs = 6;
    short age = 3;
    public void printData() {
        System.out.println(this.label);
        System.out.println(super.label);
        System.out.println(this.age);
//        System.out.println(super.age);  // will not compile, age only in subclass
        System.out.println(numberOfLegs);
        System.out.println(super.numberOfLegs);
    }
    public static void main(String[] args) {
        new Beetle().printData();
    }
}