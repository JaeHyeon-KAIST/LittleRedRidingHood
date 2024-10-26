package Play.PlayObject.Props;

import Play.Play;

public class Popcorn extends Weapon {
    // constructor
    public Popcorn(String name) {
        super(name);
    }

    // method
    public void gotHeated() {
        String s = getName() + " got heated and popped";
        Play.displayNarration(s);
    }
}
