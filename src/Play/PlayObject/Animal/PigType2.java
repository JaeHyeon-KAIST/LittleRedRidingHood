package Play.PlayObject.Animal;

import Play.Play;
import Play.PlayObject.PlayObject;
import Play.PlayObject.Props.Bag;
import Play.PlayObject.Props.Weapon;

import java.util.ArrayList;

public class PigType2 extends Animal {
    private Bag mBag = null;

    public Bag getBag() {
        return mBag;
    }

    public void packBag(ArrayList<Weapon> weapons) {
        mBag.packWeapon(mName, weapons);
    }

    public void repairHouse() {
        Play.displayNarration(mName + " repairs the house");
    }

    public void clickTongue() {
        Play.displayNarration(mName + " clicks tongue");
    }

    public void runTo(PlayObject po) {
        String s = mName + " runs to " + po.getName();
        Play.displayNarration(s);
    }

    public PigType2(String name, String musicalInstrument) {
        super(name, musicalInstrument);
        mBag = new Bag(name + "'s bag");
    }
}
