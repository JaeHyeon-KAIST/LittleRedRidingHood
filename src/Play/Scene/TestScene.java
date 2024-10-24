package Play.Scene;

import Play.PlayObject.Animal.Wolf;

public class TestScene extends Scene {
    public TestScene() {
        super("#Test Scene");
    }

    @Override
    public void play() {
        mplay.wolf.say("Hello, I am a wolf");
        mplay.wolf.disguiseTo(Wolf.disguiseType.fairyQueen);
        mplay.wolf.say("Hello, I am a fairy queen");
        mplay.wolf.disguiseRevealed();
        mplay.wolf.say("Hello, I am a wolf");

        mplay.pig1.say("action", "some words");
        mplay.pig1.sayWith(mplay.pig2, "some words");
        mplay.pig1.sayWith(mplay.pig2, "action", "some words");
    }
}
