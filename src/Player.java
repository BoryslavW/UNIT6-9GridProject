public class Player extends Sprite {
    private boolean alive;
    private int x;
    private int y;

    public Player() {
        alive = true;
        x = 4;
        y = 4;
    }

    public void gameOver() {
        alive = false;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void move(String way) {
        if (way.equals("w")) {
            y -= 1;
        }
        else if (way.equals("a")) {
            x -= 1;
        }
        else if (way.equals("s")) {
            y++;
        }
        else if (way.equals("d")) {
            x++;
        }
        else {
            System.out.println("Real smart, you didn't move at all");
        }
    }


    public boolean living() {
        return alive;
    }
}
