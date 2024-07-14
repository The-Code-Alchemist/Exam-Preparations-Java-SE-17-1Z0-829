package pond.goose;

import pond.shore.Bird;

public class Goose extends Bird {
    public void helpGooseSwim() {
        Goose other = new Goose();
        other.floatInWater();
        System.out.println(other.text);
    }
    public void helpOtherGooseSwim() {
        Bird other = new Bird();
//        other.floatInWater();           // method not accessible through base class
//        System.out.println(other.text); // same is true for fields
    }
}
