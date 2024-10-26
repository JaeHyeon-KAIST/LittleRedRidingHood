package Play.Scene;

import Play.Play;
import Play.PlayObject.Animal.Wolf;

public class Scene3 extends Scene {
    // constructors
    public Scene3() {
        super("3. " + mplay.wolf.getName() + " goes to " +
            mplay.grandmaHouse.getName()
        );
    }

    @Override
    public void play() {
        mplay.wolf.walkTo(mplay.grandmaHouse);
        mplay.wolf.knock(mplay.grandmaHouse.getDoor());
        Play.displayNarration(mplay.grandma.getName() +
            " is knitting on the bed"
        );
        Play.displayNarration(mplay.wolf.getName() +
            " walks into grandma house"
        );
        mplay.grandma.surprised();
        mplay.grandma.runAwayTo(mplay.grandmaHouse.getCloset());
        mplay.grandma.hideIn(mplay.grandmaHouse.getCloset());
        mplay.wolf.tryToOpen(mplay.grandmaHouse.getCloset());
        mplay.littleRedRidingHood.runAwayTo(mplay.grandmaHouse);
        mplay.littleRedRidingHood.knock(mplay.grandmaHouse.getDoor());
        mplay.wolf.disguiseTo(Wolf.disguiseType.grandma);
        mplay.wolf.say("Come in.");
        Play.displayNarration(mplay.littleRedRidingHood.getName() +
            " walks into grandma house"
        );
        mplay.littleRedRidingHood.say("Good morning, " +
            "Grandma how do you feel today?"
        );
        mplay.wolf.say("Terrible. not so hot.");
        mplay.littleRedRidingHood.say("Ohh. " +
            mplay.grandma.getName() + ", What big eyes you got."
        );
        mplay.wolf.say("All the better to look you over, dear");
        mplay.littleRedRidingHood.say("Ohh. " +
            mplay.grandma.getName() + ", What a big nose you got."
        );
        mplay.wolf.say("All the better … how am I doing?");
        mplay.littleRedRidingHood.say("Ohh. " +
            mplay.grandma.getName() + ", What a big mouth you got."
        );
    }
}
