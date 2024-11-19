package Play.Scene;

import Play.Play;
import Play.PlayObject.Props.Popcorn;

public class Scene7 extends Scene {
    // constructors
    public Scene7() {
        super(
            "7. " + mplay.pig3.getName() + " chases out " +
            mplay.wolf.getName() + " from " + mplay.grandmaHouse.getName()
        );
    }

    @Override
    public void play() {
        mplay.pig3.runTo(mplay.grandmaHouse);
        mplay.wolf.say("Open the door and let me in.");
        mplay.wolf.tryToOpen(mplay.grandmaHouse.getCloset());
        mplay.pig3.sneakInto(mplay.grandmaHouse);
        Popcorn mPopcorn = (Popcorn) mplay.pig3.getBag().getWeapon("Popcorn");
        mplay.pig3.pourInto(mPopcorn, mplay.wolf.getPants());
        mplay.pig3.pourInto(
            mplay.grandmaHouse.getHouseWeapons().get(0),
            mplay.wolf.getPants()
        );
        mPopcorn.gotHeated();
        mplay.wolf.sufferInPain();
        mplay.wolf.runAwayTo(mplay.forest);
        mplay.pig1.shackHandsWith(mplay.pig2);
        mplay.pig1.playMusicalInstrument();
        mplay.pig2.playMusicalInstrument();
        mplay.pig3.playMusicalInstrument();
        mplay.littleRedRidingHood.playMusicalInstrument();
        Play.displayNarration(
            mplay.grandma.getName() +
            " is knitting on the chair"
        );
        mplay.pig1.danceWith(mplay.pig2);
        mplay.pig1.singTogether(
            mplay.pig2, "Who's afraid of the Big Bad " +
            "Wolf? Big Bad Wolf, Big Bad Wolf? Who's afraid of the " +
            "Big Bad Wolf? He’s afraid existed."
        );
    }
}
