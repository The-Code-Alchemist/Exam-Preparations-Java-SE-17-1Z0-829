public class ExceptionDemo {
    public static void main(String[] args) {
        int i = 12;
        int j = 2;
        try {
            int result = i / (j - 2);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();    // Helpful during app development, you don't want the end user to see it
        }   // the application runs after catching the Exception
    }
}
