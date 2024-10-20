import play.PlayObject;
import play.animal.Human;
import play.animal.Pig;
import play.house.House;

import java.util.Arrays;
import java.util.List;

public class LRRH {
  private static Human littleRedRidingHood = null;
  private static Pig pig1 = null;
  private static Pig pig2 = null;
  private static Pig pig3 = null;

  private static House pigHouse = null;

  private static void display(String s) {
    System.out.println(s);
  }

  public static void main(String[] args) {
    // prepare actors
    littleRedRidingHood = new Human("Little Red Riding Hood");
    pig1 = new Pig("Adam", "flute");
    pig2 = new Pig("Brian", "fiddle");
    pig3 = new Pig("Charles", "piano");

    pigHouse = new House("pig's house");

    // display the title
    display("<<The Three Little Pigs>>");

    scene1();
  }

  private static void SayTogether(List<PlayObject> objects, String message) {
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
    System.out.println(sb.toString());
  }

  private static void scene1() {
    display("\n==== Little Red Riding Hood meets three pigs.");
    littleRedRidingHood.walkTo(pigHouse);
    pig1.playMusicalInstrument();
    pig2.playMusicalInstrument();

    SayTogether(Arrays.asList(pig1, pig2), "Good morning, Little Red Riding Hood!");
    littleRedRidingHood.say("Good morning, how do you do?");
    pig3.say("Good morning, Miss Riding Hood!");
    pig1.say("Where are you going, Red Riding Hood?");
    pig2.say("What's in the basket, something good?");
    littleRedRidingHood.say("I’m bringing Grandma cakes and wine. She’s awful awful sick. I'm in a great big hurry I need to get there quick.");

  }
}
