package Play.Scene;

import Play.Play;
import Play.PlayObject.Animal.Wolf;

public class Scene2 extends Scene {
    public Scene2() {
        super("2. " + mplay.littleRedRidingHood.getName() + " meets " +
                mplay.wolf.getName() + " with " +
                mplay.pig1.getName() + " and " + mplay.pig2.getName()
        );
    }

    @Override
    public void play() {
        Play.displayNarration(mplay.wolf.getName() +
                " hide behind the tree"
        );
//        mplay.wolf.walkTo(mplay.pig1); + pig2 + LRRH
//        mplay.wolf.laugh();
//        mplay.wolf.mouthWatering();
        Play.displayNarration(mplay.wolf.getName() +
                " climbs tree"
        );
        mplay.wolf.say("I’ll get them.");
        mplay.wolf.disguiseTo(Wolf.disguiseType.fairyQueen);
//        mplay.pig1.surprised();
//        mplay.pig2.surprised();
//        mplay.littleRedRidingHood.surprised();
        mplay.wolf.say("I'm goldilox the fairy queen. " +
                "Spirit of the woods is mine."
        );
        Play.displayNarration(mplay.wolf.getName() +
                " flies hanging from a tree"
        );
        mplay.wolf.say("you better fly from tree to tree " +
                "come come my dears you're safe with me."
        );
        Play.displayNarration(mplay.wolf.getName() +
                " flies hanging from a tree"
        );
        Play.displayNarration("The branch of the tree the wolf " +
                "was hanging on broke"
        );
        mplay.wolf.disguiseRevealed();
//        mplay.pig1.surprised();
//        mplay.pig2.surprised();
//        mplay.littleRedRidingHood.surprised();
        mplay.pig1.runAwayTo(mplay.pigHouse);
        mplay.pig2.runAwayTo(mplay.pigHouse);
//        mplay.littleRedRidingHood.runAwayTo(mplay.forest);
        mplay.wolf.say("Curses.");
        Play.displayNarration(mplay.wolf.getName() +
                " comes up with a good idea"
        );
        mplay.pig1.runAwayTo(mplay.pigHouse);
        mplay.pig2.runAwayTo(mplay.pigHouse);
    }
}
