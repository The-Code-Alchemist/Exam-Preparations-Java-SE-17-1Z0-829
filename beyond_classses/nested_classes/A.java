/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, pages 384 - 385
 * Referencing the members of an inner class
 * It resembles package structures
 */
package beyond_classses.nested_classes;
public class A {
    private int x = 10;
    // Nested class
    class B {
        private int x = 20;
        // This class is nested even further
        class C {
            private int x = 30;
            public void allTheX() {
                System.out.println(x);          // 30 - x within class C
                System.out.println(this.x);     // 30 - x within class C
                System.out.println(B.this.x);   // 20 - x within class B
                System.out.println(A.this.x);   // 10 - x within class A
            }
        }
    }
    public static void main(String[] args) {
        A a = new A();      // Instantiates the outer most class A

        // equivalent to: B b = a.new B();
        A.B b = a.new B();  // Instantiates class B

        // equivalent to: B.C c = b.new B();
        A.B.C c = b.new C();  // Instantiates class C, A.B.C is necessary to specify C
        c.allTheX();
    }
}