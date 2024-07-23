package zoo;

public class Seal extends Mammal{
    public Seal() {
        // explicit call to the parent constructor
        // this call will not compile without the age parameter
        super(6);
    }
}
