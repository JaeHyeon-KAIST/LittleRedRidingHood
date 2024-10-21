package Play.PlayObject.Animal;

import Play.PlayObject.PlayObject;

public abstract class Animal extends PlayObject {
    protected Animal(String name) {
        super(name);
    }

    public void walkTo(PlayObject po) {
        String s = mName + " walks to " + po.getName() + ".";
        System.out.println(s);
    }

    public void runAwayTo(PlayObject po) {

        String s = null;
        if (po == null) {
            s = mName + " runs away.";
        } else {
            s = mName + " runs away to " + po.getName() + ".";
        }
        System.out.println(s);
    }

    public void say(String something) {
        String s = mName + " says, \"" + something + "\"";
        System.out.println(s);
    }
}
