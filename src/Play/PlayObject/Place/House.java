package Play.PlayObject.Place;

import Play.PlayObject.PlayObject;
import Play.PlayObject.Props.HouseBed;
import Play.PlayObject.Props.HouseCloset;
import Play.PlayObject.Props.HouseDoor;
import Play.PlayObject.Props.Weapon;

import java.util.ArrayList;
import java.util.Arrays;

public class House extends PlayObject {
    protected HouseDoor mDoor = null;

    public HouseDoor getDoor() {
        return mDoor;
    }

    protected HouseCloset mCloset = null;

    public HouseCloset getCloset() {
        return mCloset;
    }

    protected HouseBed mBed = null;

    public HouseBed getBed() {
        return mBed;
    }

    protected ArrayList<Weapon> mHouseWeapons = new ArrayList<>();

    public ArrayList<Weapon> getHouseWeapons() {
        return mHouseWeapons;
    }

    public House(String name, Weapon... weapons) {
        super(name);
        mDoor = new HouseDoor(name + "'s door");
        mCloset = new HouseCloset(name + "'s closet");
        mBed = new HouseBed(name + "'s bed");
        if (weapons != null) {
            mHouseWeapons.addAll(Arrays.asList(weapons));
        }
    }
}
