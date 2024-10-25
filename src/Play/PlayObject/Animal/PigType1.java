package Play.PlayObject.Animal;

import Play.Play;
import Play.PlayObject.PlayObject;

public class PigType1 extends Pig {
    public void sayWith(PigType1 pig, String str) {
        String s =
            mName + " and " + pig.getName() + " say together, \"" + str + "\"";
        Play.display(s);
    }

    public void sayWith(PigType1 pig, String action, String str) {
        String s =
            mName + " and " + pig.getName() + " [" + action + "] say " +
                "together, \"" + str + "\"";
        Play.display(s);
    }

    public void danceWith(PigType1 pig) {
        String s = mName + " and " + pig.getName() + " dance together";
        Play.displayNarration(s);
    }

    public void singTogether(PigType1 pig, String str) {
        String s = mName + " and " + mName + " sing together, \"" + str + "\"";
        Play.display(s);
    }

    public void hideTogetherIn(PigType1 pig, PlayObject po) {
        String s =
            mName + " and " + pig.getName() + " hides in " + po.getName();
        Play.displayNarration(s);
    }

    public PigType1(String name, String musicalInstrument) {
        super(name, musicalInstrument);
    }
}
