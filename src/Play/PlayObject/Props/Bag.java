package Play.PlayObject.Props;

import Play.Play;
import Play.PlayObject.PlayObject;

import java.util.ArrayList;

public class Bag extends PlayObject {
    // field
    private ArrayList<Weapon> mPackedWeapons = new ArrayList<>();

    public ArrayList<Weapon> getPackedWeapons() {
        return mPackedWeapons;
    }

    // constructor
    public Bag(String name) {
        super(name);
    }

    // method
    public Weapon getWeapon(String weaponName) {
        for (int i = 0; i < mPackedWeapons.size(); i++) {
            if (mPackedWeapons.get(i).getName().equals(weaponName)) {
                return mPackedWeapons.remove(i);
            }
        }
        return null;
    }

    public void packWeapon(String who, ArrayList<Weapon> weapons) {
        for (Weapon w : weapons) {
            mPackedWeapons.add(w);
            String s = who + " packs " + w.getName() + " into the bag";
            Play.displayNarration(s);
        }
    }
}
