package Play.PlayObject.Animal;

import Play.Play;
import Play.PlayObject.PlayObject;
import Play.PlayObject.Props.MusicalInstrument;

public class Human extends Animal {
    // constructor
    public Human(String name) {
        super(name);
    }

    public Human(String name, MusicalInstrument musicalInstrument) {
        super(name, musicalInstrument);
    }

    // method
    public void hideIn(PlayObject po) {
        String s = mName + " hides in " + po.getName();
        Play.displayNarration(s);
    }

    public void runAwayFrom(PlayObject po) {
        String s = mName + " runs away from " + po.getName();
        Play.displayNarration(s);
    }
}
