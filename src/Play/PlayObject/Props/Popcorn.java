package Play.PlayObject.Props;

import Play.Play;

public class Popcorn extends Weapon {
    public void gotHeated() {
        String s = getName() + " got heated and popped";
        Play.displayNarration(s);
    }

    public Popcorn(String name) {
        super(name);
    }
}
