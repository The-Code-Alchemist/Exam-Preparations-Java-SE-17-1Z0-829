/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, page 369
 * This sealed class extends another sealed class Mammal, and permits Zebra which will extend it.
 */
package beyond_classses.sealed_classes.sealed_subclass;
public sealed class Equine extends Mammal permits Zebra {}