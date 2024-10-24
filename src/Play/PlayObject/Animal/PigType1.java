package Play.PlayObject.Animal;

import Play.Play;

public class PigType1 extends Pig {
    public void sayWith(PigType1 pig, String str) {
        String s =
            mName + " and " + pig.getName() + " say together, \"" + str + "\"";
        Play.display(s);
    }

    public PigType1(String name, String musicalInstrument) {
        super(name, musicalInstrument);
    }
}
