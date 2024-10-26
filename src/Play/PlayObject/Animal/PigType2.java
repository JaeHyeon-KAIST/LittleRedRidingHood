package Play.PlayObject.Animal;

import Play.Play;
import Play.PlayObject.PlayObject;
import Play.PlayObject.Props.Bag;
import Play.PlayObject.Props.MusicalInstrument;
import Play.PlayObject.Props.Weapon;

import java.util.ArrayList;

public class PigType2 extends Animal {
    // field
    private Bag mBag = null;
    public Bag getBag() {
        return mBag;
    }

    // constructor
    public PigType2(String name, MusicalInstrument musicalInstrument) {
        super(name, musicalInstrument);
        mBag = new Bag(name + "'s bag");
    }

    // method
    public void repairHouse() {
        Play.displayNarration(mName + " repairs the house");
    }

    public void clickTongue() {
        Play.displayNarration(mName + " clicks tongue");
    }

    public void packBag(ArrayList<Weapon> weapons) {
        mBag.packWeapon(mName, weapons);
    }

    public void runTo(PlayObject po) {
        String s = mName + " runs to " + po.getName();
        Play.displayNarration(s);
    }

    public void sneakInto(PlayObject po) {
        String s = mName + " sneaks into " + po.getName();
        Play.displayNarration(s);
    }

    public void pourInto(PlayObject what, PlayObject where) {
        String s =
            mName + " pours " + what.getName() + " into " + where.getName();
        Play.displayNarration(s);
    }
}
