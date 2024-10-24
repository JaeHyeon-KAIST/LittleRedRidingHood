package Play;

import java.util.ArrayList;
import java.util.List;

import Play.PlayObject.Animal.Human;
import Play.PlayObject.Animal.PigType1;
import Play.PlayObject.Animal.PigType2;
import Play.PlayObject.Animal.Wolf;
import Play.PlayObject.House.House;

import Play.Scene.Scene;
import Play.Scene.Scene1;
import Play.Scene.Scene2;
import Play.Scene.Scene3;
import Play.Scene.Scene4;
import Play.Scene.Scene5;
import Play.Scene.TestScene;

public class Play {
    protected String mPlayName = null;
    public List<Scene> mSceneList = new ArrayList<>();
    public Human littleRedRidingHood = null;
    public Human grandma = null;
    public PigType1 pig1 = null;
    public PigType1 pig2 = null;
    public PigType2 pig3 = null;
    public Wolf wolf = null;

    public static House pigHouse = null;
    public static House grandmaHouse = null;

    public void displayPlayTitle() {
        display("<<" + this.mPlayName + ">>");
    }

    public static void displayNarration(String s) {
        display("[" + s + "]");
    }

    public static void display(String s) {
        System.out.println(s);
    }

    public Play(String name) {
        mPlayName = name;

        initializeActors();
        initializeProps();

        Scene.initialize(this);
        initializeScenes();
    }

    private void initializeActors() {
        littleRedRidingHood = new Human("Little Red Riding Hood");
        grandma = new Human("Grandma");
        pig1 = new PigType1("Adam", "flute");
        pig2 = new PigType1("Brian", "fiddle");
        pig3 = new PigType2("Charles", "piano");
        wolf = new Wolf("Wolf");
    }

    private void initializeProps() {
        pigHouse = new House("pig's house");
        grandmaHouse = new House("grandma's house");
    }

    private void initializeScenes() {
        mSceneList.add(new Scene1());
        mSceneList.add(new Scene2());
        mSceneList.add(new Scene3());
        mSceneList.add(new Scene4());
        mSceneList.add(new Scene5());
        mSceneList.add(new TestScene());
    }
}
