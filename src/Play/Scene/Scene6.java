package Play.Scene;

import Play.Play;

public class Scene6 extends Scene {
    // constructors
    public Scene6() {
        super(
            "6. " + mplay.grandma.getName() + " rescues " +
            mplay.littleRedRidingHood.getName()
        );
    }

    @Override
    public void play() {
        mplay.littleRedRidingHood.runAwayFrom(mplay.wolf);
        mplay.wolf.chase(mplay.littleRedRidingHood);
        Play.displayNarration(
            mplay.grandma.getName() +
            " saves " + mplay.littleRedRidingHood.getName() +
            " from the wolf" + " with umbrella"
        );
        mplay.littleRedRidingHood.hideIn(mplay.grandmaHouse.getCloset());
        mplay.wolf.tryToOpen(mplay.grandmaHouse.getCloset());
    }
}
