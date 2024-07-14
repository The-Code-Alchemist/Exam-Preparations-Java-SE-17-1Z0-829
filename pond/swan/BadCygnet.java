/**
 * @author The Code Alchemist
 * from Chapter 5: Methods, page 235 - 242
 */
package pond.swan;
import pond.duck.MotherDuck;
public class BadCygnet extends MotherDuck {
    public void makeNoise() {
        var duck = new MotherDuck();
        duck.quack();
//        System.out.println(duck.noise);
    }
}
