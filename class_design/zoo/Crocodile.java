/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, pages 284 - 285
 * super reference
 *
 * A variable can be defined in both a parent class and a child class
 */
package class_design.zoo;

public class Crocodile extends Reptile {
    protected int speed = 20;   // without this field, line 16 shows 10
    public int getSpeed() {
        return speed;
    }
    public int getThisSpeed() {
        return this.speed;      // calling the speed field on the current object
    }
    public int getSuperSpeed() {
        return super.speed;     // super.speed calls the speed value from Reptile, Crocodile's parent class
    }
    public static void main(String[] args) {
        var croc = new Crocodile();
        System.out.println(croc);                       // just the reference itself
        System.out.println(croc.getSpeed());            // 20 field
        System.out.println(croc.getThisSpeed());        // 20 current object
        System.out.println(croc.getSuperSpeed());       // 10
    }
}
