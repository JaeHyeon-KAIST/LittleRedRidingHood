package Play.PlayObject.Animal;

import Play.Play;
import Play.PlayObject.PlayObject;
import Play.PlayObject.Props.WolfPants;

public class Wolf extends Animal {
    // enum
    public enum disguiseType {
        fairyQueen,
        grandma,
    }

    // field
    private disguiseType mDisguise = null;
    private WolfPants mPants = null;

    public WolfPants getPants() {
        return mPants;
    }

    // constructor
    public Wolf(String name) {
        super(name);
        mPants = new WolfPants(name + "'s pants");
    }

    // method
    public void drool() {
        String s = mName + " drools";
        Play.displayNarration(s);
    }

    public void disguiseTo(disguiseType dt) {
        mDisguise = dt;
        String s = mName + " disguises as " + mDisguise;
        Play.displayNarration(s);
    }

    public void disguiseRevealed() {
        mDisguise = null;
        String s = mName + "'s disguise is revealed";
        Play.displayNarration(s);
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

    public void chase(Animal animal) {
        String s = mName + " chases " + animal.getName();
        Play.displayNarration(s);
    }

    public void tryToOpen(PlayObject po) {
        String s = mName + " tries to open " + po.getName();
        Play.displayNarration(s);
    }

    public void sufferInPain() {
        String s = mName + " suffers in pain";
        Play.displayNarration(s);
    }

    @Override
    public void say(String something) {
        if (mDisguise != null) {
            String s =
                mName + "(disguised as " + mDisguise + ") says, \"" +
                    something + "\"";
            Play.display(s);
        } else {
            super.say(something);
        }
    }
}
