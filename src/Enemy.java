import java.util.ArrayList;

public class Enemy extends Sprite {
    private int x;
    private int y;
    private int direction; // 1=north, 2=east, 3=south, 4=west

    public Enemy(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    @Override
    public void setRed() {
        // turns it into the burning image
    }

    public void highlight(Grid grid) {
        // For a 9x9 grid with valid indices 0 through 8.
        if (direction == 1) { // Facing downwards
            for (int i = x + 1; i < 9; i++) {
                grid.setHighlighted(i, y);
            }
        }
        if (direction == 2) { // Facing upwards
            for (int i = x - 1; i >= 0; i--) {
                grid.setHighlighted(i, y);
            }
        }
        if (direction == 3) { // Facing rightwards
            for (int i = y + 1; i < 9; i++) {
                grid.setHighlighted(x, i);
            }
        }
        if (direction == 4) { // Facing leftwards
            for (int i = y - 1; i >= 0; i--) {
                grid.setHighlighted(x, i);
            }
        }
    }


    public int getX() { return x; }
    public int getY() { return y; }
}

/*
    0  1  2  3  4  5  6  7  8
    9  10 11 12 13 14 15 16 17
    18 19 20 21 22 23 24 25 26
    27 28 29 30 31 32 33 34 35
    36 37 38 39 40 41 42 43 44
    45 46 47 48 49 50 51 52 53
    54 55 56 57 58 59 60 61 62
    63 64 65 66 67 68 69 70 71
    72 73 74 75 76 77 78 79 80

public ArrayList<Integer> face() {
        //algorithm for figuring out which spaces it will turn red based of space and direction
        ArrayList<Integer> spacelist = new ArrayList<>();
        if (direction == 1) {
            int add = space;
            while (add > -1) {
                spacelist.add(add);
                add -= 9;
            }
        } else if (direction == 2) {
            int limit = 0;
            if (space > 71) {
                limit = 80;
            } if (space > 62) {
                limit = 71;
            } if (space > 53) {
                limit = 62;
            } if (space > 44) {
                limit = 53;
            } if (space > 35) {
                limit = 44;
            } if (space > 26) {
                limit = 35;
            } if (space > 17) {
                limit = 26;
            }if (space > 8) {
                limit = 17;
            }
            int add = space;
            while (add < 81 && ) {   // use the opposite minus
                spacelist.add(add);                  // makes no sence
                add ++;
            }
        } else if (direction == 3) {
            int add = space;
            while (add < 81) {
                spacelist.add(add);
                add += 9;
            }
        } else if (direction == 4) {
            int limit = 0;
            if (space > 71) {
                limit = 72;
            } else if (space > 62) {
                limit = 63;
            } else if (space > 53) {
                limit = 54;
            } else if (space > 44) {
                limit = 45;
            } else if (space > 35) {
                limit = 36;
            } else if (space > 26) {
                limit = 27;
            } else if (space > 17) {
                limit = 18;
            } else if (space > 8) {
                limit = 9;
            } else {
                limit = 0;
            }
            int add = space;
            while (add >= limit) {
                spacelist.add(add);
                add -= 1;
            }
        }
        ArrayList yup = new ArrayList<Integer>();
        // a mini boss enemy with direction 0 would go in all 4 directions
        return yup;
    }
 */
