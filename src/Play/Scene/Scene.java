package Play.Scene;

import Play.Play;

public abstract class Scene {
    protected String mSceneTitle;
    protected static Play mplay;

    public static void initialize(Play p) {
        mplay = p;
    }

    public void displaySceneTitle() {
        Play.display(this.mSceneTitle);
    }

    public abstract void play();

    public Scene(String title) {
        this.mSceneTitle = title;
    }
}
