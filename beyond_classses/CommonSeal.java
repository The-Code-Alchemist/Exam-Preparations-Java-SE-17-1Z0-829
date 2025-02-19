/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, page 350
 * A concrete class must override all inherted abstract methods, otherwise this class will not compile
 */
package beyond_classses;
public class CommonSeal extends HarborSeal {

    // If either of these methods is removed, this class will no longer compile. Annotations are recommended,
    @Override
    public int getTailLength() {
        return 0;
    }

    @Override
    public int getNumberOfWhiskers() {
        return 0;
    }
}