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

        mplay.pig1.say("action", "some words");
    }
}
