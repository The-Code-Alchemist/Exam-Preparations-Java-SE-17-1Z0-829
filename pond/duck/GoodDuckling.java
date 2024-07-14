/**
 * @author The Code Alchemist
 * from Chapter 5: Methods, page 235 - 242
 */
package pond.duck;
public class GoodDuckling {
    public void makeNoise() {
        var duck  = new MotherDuck();
        duck.quack();
        System.out.println(duck.noise);
    }
}
