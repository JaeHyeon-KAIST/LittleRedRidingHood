package Play.PlayObject.Animal;

import Play.Play;
import Play.PlayObject.PlayObject;

import java.util.List;

public abstract class Animal extends PlayObject {
    protected Animal(String name) {
        super(name);
    }

    public void walkTo(PlayObject po) {
        String s = mName + " walks to " + po.getName();
        Play.displayNarration(s);
    }

    public void walkToWith(List<PlayObject> poList, PlayObject place) {
        StringBuilder s = new StringBuilder(mName);
        for (PlayObject po : poList) {
            s.append(" and ").append(po.getName());
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

    public void say(String something) {
        String s = mName + " says, \"" + something + "\"";
        Play.display(s);
    }

    public void say(String action, String something) {
        String s = mName + " [" + action + "] says, \"" + something + "\"";
        Play.display(s);
    }

    public void laugh() {
        String s = mName + " laughs";
        Play.displayNarration(s);
    }
}
