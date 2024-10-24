package Play.PlayObject.Animal;

import Play.Play;

public class Wolf extends Animal {
    public enum disguiseType {
        fairyQueen,
        grandma,
    }

    private disguiseType mDisguise = null;

    public void disguiseTo(disguiseType dt) {
        mDisguise = dt;
    }

    public void disguiseRevealed() {
        mDisguise = null;
    }

    @Override
    public void say(String something) {
        if (mDisguise != null) {
            String s =
                mName + "(disguised as " + mDisguise + ") says, \"" + something +
                    "\"";
            Play.display(s);
        } else {
            super.say(something);
        }
    }

    public Wolf(String name) {
        super(name);
    }
}
