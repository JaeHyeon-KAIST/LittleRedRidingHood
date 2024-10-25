package Play.Scene;

import Play.Play;
import Play.PlayObject.Animal.Wolf;

public class Scene4 extends Scene {
    public Scene4() {
        super("4. " + mplay.wolf.getName() + " chases " +
            mplay.littleRedRidingHood.getName()
        );
    }

    @Override
    public void play() {
        mplay.wolf.disguiseRevealed();
        mplay.wolf.say("You Ain't Seen the half of a ???");
//        mplay.littleRedRidingHood.surprised();
//        mplay.littleRedRidingHood.runFrom(mplay.wolf);
//        mplay.wolf.chase(mplay.littleRedRidingHood);
    }
}
