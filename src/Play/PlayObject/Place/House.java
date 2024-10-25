package Play.PlayObject.Place;

import Play.PlayObject.PlayObject;
import Play.PlayObject.Props.HouseCloset;
import Play.PlayObject.Props.HouseDoor;

public class House extends PlayObject {
    protected HouseDoor mDoor = null;

    public HouseDoor getDoor() {
        return mDoor;
    }

    protected HouseCloset mCloset = null;

    public HouseCloset getCloset() {
        return mCloset;
    }

    public House(String name) {
        super(name);
        mDoor = new HouseDoor(name + "'s door");
        mCloset = new HouseCloset(name + "'s closet");
    }
}
