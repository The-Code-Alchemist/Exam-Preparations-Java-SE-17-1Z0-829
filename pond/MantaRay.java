package pond;

public class MantaRay {
    private String name = "Sammy";
    public static void first() {
        System.out.println("first");
    }
    public static void second() {
        System.out.println("second");
    }
    public void third() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        first();
        second();
//        third();  // instance method can't be called from a static method
    }
}
