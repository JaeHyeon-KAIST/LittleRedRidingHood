package Play.PlayObject;

public abstract class PlayObject {
    // field
    protected String mName = null;

    public String getName() {
        return mName;
    }

    // constructor
    protected PlayObject(String name) {
        mName = name;
    }
}
