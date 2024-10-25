package Play.PlayObject.Props;

import Play.Play;
import Play.PlayObject.PlayObject;

import java.util.ArrayList;

public class Bag extends PlayObject {
    private ArrayList<Weapon> mPackedWeapons = new ArrayList<>();

    public ArrayList<Weapon> getPackedWeapons() {
        return mPackedWeapons;
    }

    public void packWeapon(String who, ArrayList<Weapon> weapons) {
        for (Weapon w : weapons) {
            mPackedWeapons.add(w);
            String s = who + " packs " + w.getName() + " into the bag";
            Play.displayNarration(s);
        }
    }

    public Bag(String name) {
        super(name);
    }
}
