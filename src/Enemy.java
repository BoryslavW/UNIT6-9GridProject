import java.util.ArrayList;

public class Enemy extends Sprite {
    int direction;
    int space;

    // 1 north
    // 2 east
    // 3 south
    // 4 west

    public void Enemy(int d, int space) {
        direction = d;
        this.space = space;
    }

    public ArrayList face() {
        //algorithm for figuring out which spaces it will turn red based of space and direction
        ArrayList<Integer> spacelist = new ArrayList<>();
        if (direction == 1) {
            int add = space;
            while (add > -1) {
                spacelist.add(add);
                add -= 9;
            }
        } else if (direction == 2) {
            int add = space;
            while (add < 81 &&) {   // use the opposite minus
                spacelist.add(add);                  // makes no sence
                add -= 9;
            }
        } else if (direction == 3) {
            int add = space;
            while (add < 81) {
                spacelist.add(add);
                add += 9;
            }
        } else if (direction == 4) {

        }
        ArrayList yup = new ArrayList<Integer>();
        // a mini boss enemy with direction 0 would go in all 4 directions
        return yup;
    }

    public static int getY(int which) {
        if (which == 1) {
            return (int) (Math.random() * 9) + 1;
        } else if (which == 2) {
            return (int) (Math.random() * 9) + 10;
        } else {
            return (int) (Math.random() * 9) + 19;
        }
    }

    public static int getX(int which) {
        if (which == 1) {
            return (int) (Math.random() * 9) + 1;
        } else if (which == 2) {
            return (int) (Math.random() * 9) + 10;
        } else {
            return (int) (Math.random() * 9) + 19;
        }
    }
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

 */
