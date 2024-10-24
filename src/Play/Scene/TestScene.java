package Play.Scene;

import Play.PlayObject.Animal.Wolf;

public class TestScene extends Scene {
    public TestScene() {
        super("#Test Scene");
    }

    @Override
    public void play() {
        mplay.wolf.disguiseTo(Wolf.disguiseType.fairyQueen);
    }
}
