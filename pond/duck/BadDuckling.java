/**
 * @author The Code Alchemist
 * from Chapter 5: Methods, page 235 - 242
 */
package pond.duck;
public class BadDuckling {
    public void makeNoise() {   // will not compile with private access
        var duck = new FatherDuck();
        duck.quack();
        System.out.println(duck.noise);
    }
}
