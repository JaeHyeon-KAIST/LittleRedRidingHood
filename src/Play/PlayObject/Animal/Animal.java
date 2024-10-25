package Play.PlayObject.Animal;

import Play.Play;
import Play.PlayObject.PlayObject;
import Play.PlayObject.Props.MusicalInstrument;

public abstract class Animal extends PlayObject {
    protected MusicalInstrument mMusicalInstrument = null;

    public void playMusicalInstrument() {
        if (mMusicalInstrument == null) {
            return;
        }
        String s = mName + " plays his " + mMusicalInstrument.getName();
        Play.displayNarration(s);
    }

    public void walkTo(PlayObject po) {
        String s = mName + " walks to " + po.getName();
        Play.displayNarration(s);
    }

    public void walkToWith(PlayObject place, Animal... animals) {
        StringBuilder s = new StringBuilder(mName);
        for (Animal a : animals) {
            s.append(" and ").append(a.getName());
        }
        s.append(" walk to ");
        s.append(place.getName());

        Play.displayNarration(s.toString());
    }

    public void runAwayTo(PlayObject po) {
        String s = null;
        if (po == null) {
            s = mName + " runs away";
        } else {
            s = mName + " runs away to " + po.getName();
        }
        Play.displayNarration(s);
    }

    public void runAwayToWith(PlayObject po, Animal... animals) {
        StringBuilder s = new StringBuilder(mName);
        for (Animal a : animals) {
            s.append(" and ").append(a.getName());
        }
        s.append(" run away to ");
        s.append(po.getName());

        Play.displayNarration(s.toString());
    }

    public void say(String something) {
        String s = mName + " says, \"" + something + "\"";
        Play.display(s);
    }

    public void say(String action, String something) {
        String s = mName + " (" + action + ") says, \"" + something + "\"";
        Play.display(s);
    }

    public void laugh() {
        String s = mName + " laughs";
        Play.displayNarration(s);
    }

    public void surprised() {
        String s = mName + " is surprised";
        Play.displayNarration(s);
    }

    public void surprisedWith(Animal... animals) {
        StringBuilder s = new StringBuilder(mName);
        for (Animal a : animals) {
            s.append(" and ").append(a.getName());
        }
        s.append(" are surprised");
        Play.displayNarration(s.toString());
    }

    public void knock(PlayObject po) {
        String s = mName + " knocks " + po.getName();
        Play.displayNarration(s);
    }

    protected Animal(String name) {
        super(name);
    }

    protected Animal(String name, MusicalInstrument musicalInstrument) {
        super(name);
        mMusicalInstrument = musicalInstrument;
    }
}
