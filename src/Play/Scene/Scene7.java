package Play.Scene;

import Play.Play;

public class Scene7 extends Scene {
    public Scene7() {
        super("7. " + mplay.pig3.getName() + " chases out " +
                mplay.wolf.getName() + " from " + mplay.grandmaHouse.getName()
        );
    }

    @Override
    public void play() {
//        mplay.pig3.runTo(mplay.grandmaHouse);
        mplay.wolf.say("Open the door and let me in.");
//        mplay.wolf.tryToOpenTheDoor();
//        mplay.pig3.sneakInto(mplay.grandmaHouse);
//        mplay.pig3.pourInto(mplay.popcorn, mplay.wolf.pants);
//        mplay.pig3.pourInto(mplay.coal, mplay.wolf.pants);
//        mplay.wolf.sufferInPain();
//        mplay.wolf.runAwayTo(mplay.forest);
//        mplay.pig1.shackHandsWith(mplay.pig2);
        mplay.pig1.playMusicalInstrument();
        mplay.pig2.playMusicalInstrument();
        mplay.pig3.playMusicalInstrument();
//        mplay.littleRedRidingHood.playMusicalInstrument();
        Play.displayNarration(mplay.grandma.getName() +
                " is knitting on the chair"
        );
//        mplay.pig1.dance();
//        mplay.pig2.dance();
//        mplay.pig1.sing("Who's afraid of the Big Bad Wolf? " +
//                "Big Bad Wolf, Big Bad Wolf? Who's afraid of the " +
//                "Big Bad Wolf? He’s afraid existed."
//        );
//        mplay.pig2.sing("Who's afraid of the Big Bad Wolf? " +
//                "Big Bad Wolf, Big Bad Wolf? Who's afraid of the " +
//                "Big Bad Wolf? He’s afraid existed."
//        );
    }
}
