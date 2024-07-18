/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, page 284, 285
 * super reference
 */
package zoo;
public class Crocodile extends Reptile {
    protected int speed = 20;   // without this field, line 15 shows 10
    public int getSpeed() {
        return speed;           // super.speed calls the speed value from Reptile
    }
    public int getSuperSpeed() {
        return super.speed;
    }
    public static void main(String[] args) {
        var croc = new Crocodile();
        System.out.println(croc);
        System.out.println(croc.getSpeed());        // 20
        System.out.println(croc.getSuperSpeed());   // 10
    }
}