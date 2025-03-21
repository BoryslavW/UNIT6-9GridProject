public class Enemy extends Sprite {
    int direction;

    // 1 east
    // 2 north
    // 3 west
    // 4 south

    public void Enemy(int d) {
        direction = d;
    }

    public int face() {
        // returns which way they are facing
        return direction;
    }

}
