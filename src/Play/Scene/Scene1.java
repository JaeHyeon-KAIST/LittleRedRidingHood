package Play.Scene;

import java.util.Arrays;

public class Scene1 extends Scene {
    // constructors
    public Scene1() {
        super("1. " + mplay.littleRedRidingHood.getName() +
        " meets three pigs"
        );
    }

    @Override
    public void play() {
        mplay.littleRedRidingHood.walkTo(mplay.pigHouse);
        mplay.pig1.danceWith(mplay.pig2);
        mplay.pig1.playMusicalInstrument();
        mplay.pig2.playMusicalInstrument();
        mplay.pig3.repairHouse();
        mplay.pig1.walkToWith(mplay.littleRedRidingHood, mplay.pig2);
        mplay.pig1.sayWith(mplay.pig2, "Good morning, Miss Riding Hood!");
        mplay.littleRedRidingHood.say("Good morning! How do you do?");
        mplay.pig3.say("Good morning, Red Riding Hood!");
        mplay.pig3.repairHouse();
        mplay.pig1.say("Where are you going?");
        mplay.pig2.say("What's in the basket, something good?");
        mplay.littleRedRidingHood.say(
            "I'm bringing Grandma cakes " +
            "and wine. She's awful awful sick. " +
            "I'm in a great big hurry I need to get there quick."
        );
        mplay.pig1.sayWith(
            mplay.pig2, 
            "You can get there faster" + 
            "if you take the shortcut through the woods."
        );
        mplay.pig3.say(
            "surprised", 
            "There's danger in the woods. Be aware!" +
            " the big bad wolf is walking there. Better to be" +
            " safe than sorry. Shortcuts are not always good. " +
            "Take the long road around the forest while the " +
            "wolf is in the wood."
        );
        mplay.pig1.laugh();
        mplay.pig2.laugh();
        mplay.pig1.sayWith(
            mplay.pig2,
            "that old wolf is just a sussy. " +
            "All he does is huff and puff. We'll go with you and protect " +
            "you. Come along. We'll call his bluff."
        );
        mplay.pig1.danceWith(mplay.pig2);
        mplay.pig1.singTogether(
            mplay.pig2,
            "Who's afraid of the Big Bad " +
            "Wolf? Big Bad Wolf, Big Bad Wolf? Who's afraid of the Big Bad " +
            "Wolf?"
        );
        mplay.pig1.playMusicalInstrument();
        mplay.pig2.playMusicalInstrument();
        mplay.littleRedRidingHood.walkToWith(
            mplay.forest, mplay.pig1, mplay.pig2
        );
        mplay.pig3.clickTongue();
        mplay.pig3.repairHouse();
    }
}
