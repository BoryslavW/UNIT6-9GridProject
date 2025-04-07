public class Player extends Sprite {
    private int x, y;
    private boolean alive;
    public Player() {
        x = 4;
        y = 4;
        alive = true;
    }

    public void move(String way, Grid grid) {

        int newX = x;
        int newY = y;

        if (way.equals("w")) newY--;
        else if (way.equals("a")) newX--;
        else if (way.equals("s")) newY++;
        else if (way.equals("d")) newX++;
        if (grid.getSprite(newX, newY).isHighlighted()) {
            alive = false;
        }

        if (newX >= 0 && newX < 9 && newY >= 0 && newY < 9) {
            grid.movePlayer(x, y, newX, newY);
            x = newX;
            y = newY;
            if (grid.getSprite(newX, newY).isHighlighted()) {
                alive = false;
            }
        }
        else {
            System.out.println("Real smart, you stayed still.");
        }
    }

    public boolean living() {
        return alive;
    }

    public int getX() { return x; }
    public int getY() { return y; }
}