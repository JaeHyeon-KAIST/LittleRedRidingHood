package Play.Scene;

import java.util.Arrays;

public class Scene1 extends Scene {
    public Scene1() {
        super("#1 Little Red Riding Hood meets three pigs");
    }

    @Override
    public void play() {
        mplay.littleRedRidingHood.walkTo(mplay.pigHouse);
        mplay.pig1.playMusicalInstrument();
        mplay.pig2.playMusicalInstrument();

        mplay.sayTogether(Arrays.asList(mplay.pig1, mplay.pig2),
            "morning, Little Red Riding Hood!"
        );
        mplay.littleRedRidingHood.say("Good morning, how do you do?");
        mplay.pig3.say("Good morning, Miss Riding Hood!");
        mplay.pig1.say("Where are you going, Red Riding Hood?");
        mplay.pig2.say("What's in the basket, something good?");
        mplay.littleRedRidingHood.say("I'm bringing Grandma cakes " +
            "and wine. She's awful awful sick. " +
            "I'm in a great big hurry I need to get there quick."
        );
    }
}
