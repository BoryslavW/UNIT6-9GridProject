public class Sprite {
    boolean isRed = false;
    boolean high = false;

    public void setRed() {
        isRed = true;
        high = false;
    }

    public void setHighlighted() {
        high = true;
        isRed = false;
    }

    public boolean isHighlighted() {
        return high;
    }

    public boolean isRed() {
        return isRed;
    }
}
