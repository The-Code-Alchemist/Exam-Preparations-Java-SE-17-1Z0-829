package pond.goose;

import pond.shore.Bird;

public class Gosling extends Bird {
    public void swim() {
        floatInWater();
        System.out.println(text);
    }

    public static void main(String[] args) {
        new Gosling().swim();
    }
}
