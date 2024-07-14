package pond.duck;

import pond.goose.Goose;
import pond.shore.Bird;

public class GooseWatcher extends Bird {
    public void watch() {
        Goose goose = new Goose();
//        goose.floatInWater();   // we're not in the Goose object
    }
}
