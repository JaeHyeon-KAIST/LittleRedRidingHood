package Play.Scene;

import Play.Play;

public class Scene6 extends Scene {
    public Scene6() {
        super("6. " + mplay.grandma.getName() + " rescues " +
            mplay.littleRedRidingHood.getName()
        );
    }

    @Override
    public void play() {
//        mplay.littleRedRidingHood.runFrom(mplay.wolf);
//        mplay.wolf.chase(mplay.littleRedRidingHood);
        Play.displayNarration(mplay.grandma.getName() +
            " saves " + mplay.littleRedRidingHood.getName() +
            " from the wolf" + " with umbrella"
        );
//        mplay.grandma.hideIn(mplay.grandmaHouse.closet);
//        mplay.littleRedRidingHood.hideIn(mplay.grandmaHouse.closet);

//        mplay.pig1.hide(mplay.pighouse.bed);
//        mplay.pig2.hide(mplay.pighouse.bed);
//        mplay.wolf.tryToOpenTheDoor();
    }
}
