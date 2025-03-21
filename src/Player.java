public class Player extends Sprite {
    private boolean alive;

    public Player() {
        alive = true;
    }

    public void die() {
        alive = false;
    }

    public boolean living() {
        return alive;
    }
}
