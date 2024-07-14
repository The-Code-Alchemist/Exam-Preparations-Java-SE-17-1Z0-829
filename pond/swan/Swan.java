package pond.swan;

import pond.shore.Bird;

public class Swan extends Bird {
    public void swim() {
        floatInWater();
        System.out.println(text);
    }
    public void helpOtherSwanSwim() {
        Swan other = new Swan();
        other.floatInWater();
        System.out.println(other.text);
    }

    public void helpOtherBirdSwim() {
        Bird other = new Bird();
//        other.floatInWater();           // method not accessible through base class
//        System.out.println(other.text); // same is true for fields
    }
}
