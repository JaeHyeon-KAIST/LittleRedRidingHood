package Play;

import java.util.ArrayList;
import java.util.List;

import Play.PlayObject.Animal.Human;
import Play.PlayObject.Animal.Pig;
import Play.PlayObject.House.House;
import Play.PlayObject.PlayObject;

import Play.Scene.Scene;
import Play.Scene.Scene1;

public class Play {
    protected String mPlayName = null;
    public List<Scene> mSceneList = new ArrayList<>();
    public Human littleRedRidingHood = null;
    public Pig pig1 = null;
    public Pig pig2 = null;
    public Pig pig3 = null;

    public static House pigHouse = null;

    public void displayPlayTitle() {
        display("<<" + this.mPlayName + ">>");
    }

    public static void displayNarration(String s) {
        display("[" + s + "]");
    }

    public static void display(String s) {
        System.out.println(s);
    }

    public void sayTogether(List<PlayObject> objects, String message) {
        if (objects == null || objects.isEmpty()) {
            return;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < objects.size(); i++) {
            PlayObject obj = objects.get(i);
            sb.append(obj.getName());
            if (i == objects.size() - 1) {
                sb.append(" ");
            } else {
                sb.append(" and ");
            }
        }

        sb.append("say together, \"").append(message).append("\"");
        display(sb.toString());
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
        pig1 = new Pig("Adam", "flute");
        pig2 = new Pig("Brian", "fiddle");
        pig3 = new Pig("Charles", "piano");
    }

    private void initializeProps() {
        pigHouse = new House("pig's house");
    }

    private void initializeScenes() {
        mSceneList.add(new Scene1());
    }
}
