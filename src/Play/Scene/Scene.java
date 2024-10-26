package Play.Scene;

import Play.Play;

public abstract class Scene {
    // fields
    protected String mSceneTitle;
    protected static Play mplay;

    public static void initialize(Play p) {
        mplay = p;
    }

    // constructors
    public Scene(String title) {
        this.mSceneTitle = title;
    }

    // methods
    public void displaySceneTitle() {
        Play.display("\nScene #" + this.mSceneTitle);
    }

    public abstract void play();
}
