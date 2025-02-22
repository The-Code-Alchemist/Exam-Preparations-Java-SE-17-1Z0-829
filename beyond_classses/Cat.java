/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, pages 356 - 357
 * default method example. This class inherits two default methods from its interfaces
 *
 * The Walk and Run interfaces are siblings in terms of how they are used.
 * It is not clear which getSpeed() method is used without explicitly overriding a specific version of the getSpeed() method
 *
 * The getSpeed() method has to be overridden, because it is unclear which getSpeed method is used
 * There are three ways to override the getSpeed(). The first way is actively overriding a duplicate method.
 * The second and third approach exhibit properties of both a static and instance method
 */
package beyond_classses;
public class Cat implements Walk, Run {

    @Override
    public int getSpeed() {
        return 1;
    }

    public int getRunSpeed() {
        return Run.super.getSpeed();
    }

    public int getWalkSpeed() {
        return Walk.super.getSpeed();
    }
}
