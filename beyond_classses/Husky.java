/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, page 352
 * Unlike interfaces, abstract classes use explicit modifiers
 */
package beyond_classses;
abstract class Husky {
    // This method will no longer compile if it becomes concrete by removing the abstract modifier
    abstract void play();
}