package Play;

import java.util.ArrayList;
import java.util.List;

import Play.PlayObject.Animal.Human;
import Play.PlayObject.Animal.PigType1;
import Play.PlayObject.Animal.PigType2;
import Play.PlayObject.Animal.Wolf;
import Play.PlayObject.Place.House;
import Play.PlayObject.Place.Forest;

import Play.PlayObject.Props.Popcorn;
import Play.PlayObject.Props.Weapon;
import Play.Scene.Scene;
import Play.Scene.Scene1;
import Play.Scene.Scene2;
import Play.Scene.Scene3;
import Play.Scene.Scene4;
import Play.Scene.Scene5;
import Play.Scene.Scene6;
import Play.Scene.Scene7;
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

    public House pigHouse = null;
    public House grandmaHouse = null;
    public Forest forest = null;

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
        littleRedRidingHood = new Human("Little Red Riding Hood", "piano");
        grandma = new Human("Grandma");
        pig1 = new PigType1("Adam", "flute");
        pig2 = new PigType1("Brian", "fiddle");
        pig3 = new PigType2("Charles", "piano");
        wolf = new Wolf("Wolf");
    }

    private void initializeProps() {
        pigHouse = new House("pig's house",
            new Popcorn("Popcorn"),
            new Weapon("Exe")
        );
        grandmaHouse = new House("grandma's house",
            new Weapon("Coal")
        );
        forest = new Forest("forest");
    }

    private void initializeScenes() {
        mSceneList.add(new Scene1());
        mSceneList.add(new Scene2());
        mSceneList.add(new Scene3());
        mSceneList.add(new Scene4());
        mSceneList.add(new Scene5());
        mSceneList.add(new Scene6());
        mSceneList.add(new Scene7());
        mSceneList.add(new TestScene());
    }
}
