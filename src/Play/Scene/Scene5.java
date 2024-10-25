package Play.Scene;

public class Scene5 extends Scene {
    public Scene5() {
        super("5. " + mplay.pig3.getName() + " goes to rescue " +
            mplay.littleRedRidingHood.getName()
        );
    }

    @Override
    public void play() {
        mplay.pig1.hideTogetherIn(mplay.pig2, mplay.pigHouse.getBed());
        mplay.pig1.sayWith(mplay.pig2, "The wolf. He got her.");
        mplay.pig3.surprised();
        mplay.pig3.packBag(mplay.pigHouse.getHouseWeapons());
        mplay.pig3.runTo(mplay.grandmaHouse);
        mplay.pig1.walkTo(mplay.grandmaHouse);
        mplay.pig2.walkTo(mplay.grandmaHouse);
    }
}
