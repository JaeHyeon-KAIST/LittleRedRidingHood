package Play.Scene;

public class Scene4 extends Scene {
    // constructors
    public Scene4() {
        super("4. " + mplay.wolf.getName() + " chases " +
            mplay.littleRedRidingHood.getName()
        );
    }

    @Override
    public void play() {
        mplay.wolf.disguiseRevealed();
        mplay.wolf.say("You Ain't Seen the half of it!");
        mplay.littleRedRidingHood.surprised();
        mplay.littleRedRidingHood.runAwayFrom(mplay.wolf);
        mplay.wolf.chase(mplay.littleRedRidingHood);
    }
}
