/**
 * @author The Code Alchemist
 * from Chapter 5: Methods, page 237 - 242
 */
package pond.duck;
public class GoodDuckling {
    public void makeNoise() {
        var duck  = new MotherDuck();
        duck.quack();                       // field from pond.duck.MotherDuck - package access is OK
        System.out.println(duck.noise);     // field from pond.duck.MotherDuck - package access is OK
    }
}
