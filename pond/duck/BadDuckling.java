/**
 * @author The Code Alchemist
 * from Chapter 5: Methods, page 236 - 242
 * private members cannot be accessed from outside the class by other classes, even if they are in the same package
 */
package pond.duck;
public class BadDuckling {
    public void makeNoise() {
        var duck = new FatherDuck();
//        duck.quack();                       // will not compile with private access in pond.duck.FatherDuck
//        System.out.println(duck.noise);     // will not compile with private access in pond.duck.FatherDuck
    }
}
