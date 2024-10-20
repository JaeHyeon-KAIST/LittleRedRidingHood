package play.animal;

public class Pig extends Animal {
  protected String mMusicalInstrument = null;

  public String getMusicalInstrument() {
    return mMusicalInstrument;
  }

  public void playMusicalInstrument() {
    String s = mName + " plays his " + mMusicalInstrument;
    System.out.println(s);
  }

  public Pig(String name, String musicalInstrument) {
    super(name);
    mMusicalInstrument = musicalInstrument;
  }
}
