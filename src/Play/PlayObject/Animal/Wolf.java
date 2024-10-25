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

    public void walkToAnimals(Animal... animals) {
        StringBuilder s = new StringBuilder(mName);
        s.append(" walks to ");
        for (int i = 0; i < animals.length; i++) {
            s.append(animals[i].getName());
            // 마지막 동물이 아닐 때만 and 추가
            if (i < animals.length - 1) {
                s.append(" and ");
            }
        }
        Play.displayNarration(s.toString());
    }

    public void drool() {
        String s = mName + " drools";
        Play.displayNarration(s);
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
