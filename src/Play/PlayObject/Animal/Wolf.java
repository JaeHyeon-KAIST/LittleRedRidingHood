package Play.PlayObject.Animal;

public class Wolf extends Animal {
    public enum disguiseType {
        fairyQueen,
        grandma,
    }

    private disguiseType mDisguise = null;


    public void disguiseTo(disguiseType dt) {
        mDisguise = dt;
    }

    public void disguiseRevealed() {
        mDisguise = null;
    }

    public Wolf(String name) {
        super(name);
    }
}
