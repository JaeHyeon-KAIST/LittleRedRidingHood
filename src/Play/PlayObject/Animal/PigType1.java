package Play.PlayObject.Animal;

import Play.Play;
import Play.PlayObject.PlayObject;
import Play.PlayObject.Props.MusicalInstrument;

public class PigType1 extends Animal {
    // constructor
    public PigType1(String name, MusicalInstrument musicalInstrument) {
        super(name, musicalInstrument);
    }

    // do with another pig together : say, dance, sing, hide, shack hands
    public void sayWith(PigType1 pig, String str) {
        String s =
            mName + " and " + pig.getName() + " say together, \"" + str + "\"";
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

    public void shackHandsWith(PigType1 pig) {
        String s = mName + " shack hands with " + pig.getName();
        Play.displayNarration(s);
    }
}
