import Play.Play;
import Play.Scene.Scene;

public class LRRH {
    private static Play mPlay = null;

    public static void main(String[] args) {
        mPlay = new Play("The Big Bad Wolf with Little Red Riding Hood");

        mPlay.displayPlayTitle();

        for (Scene scene : mPlay.mSceneList) {
            scene.displaySceneTitle();
            scene.play();
        }
    }
}
