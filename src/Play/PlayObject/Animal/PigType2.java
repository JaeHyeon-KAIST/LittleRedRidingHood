package Play.PlayObject.Animal;

import Play.Play;

public class PigType2 extends Pig {
    public void repairHouse() {
        Play.displayNarration(mName + " repairs the house");
    }

    public PigType2(String name, String musicalInstrument) {
        super(name, musicalInstrument);
    }
}
