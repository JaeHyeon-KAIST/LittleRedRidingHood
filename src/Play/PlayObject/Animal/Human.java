package Play.PlayObject.Animal;

import Play.Play;
import Play.PlayObject.PlayObject;

public class Human extends Animal {
    public void hideIn(PlayObject po) {
        String s = mName + " hides in " + po.getName();
        Play.displayNarration(s);
    }

    public void runAwayFrom(PlayObject po) {
        String s = mName + " runs away from " + po.getName();
        Play.displayNarration(s);
    }

    public Human(String name) {
        super(name);
    }
}
