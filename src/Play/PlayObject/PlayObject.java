package Play.PlayObject;

public abstract class PlayObject {
    protected String mName = null;

    public String getName() {
        return mName;
    }

    protected PlayObject(String name) {
        mName = name;
    }
}
