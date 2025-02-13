/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, pages 313 - 314
 * Hiding variables: a hidden variable occurs when a child class defines a variable with the same name as
 * an inherited variable defined in the parent class
 */
package class_design.zoo.carnivores;
class Carnivore {
    protected boolean hasFur = false;
}
public class Meerkat extends Carnivore {
    protected boolean hasFur = true;

    public static void main(String[] args) {
        Meerkat m = new Meerkat();
        Carnivore c = m;
        // Both variables m and c exist independently of each other
        System.out.println(c.hasFur);   // false
        System.out.println(m.hasFur);   // true
    }
}
