import java.util.ArrayList;

public class Grid {
    Sprite[][] yup;
    ArrayList<Integer> cooked = new ArrayList<>();

    public Grid () {
        yup = new Sprite[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                yup[i][j] = new Sprite();
            }
        }
    }

    public void highlight() {
        int count = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (cooked.contains(count)) {
                    yup[i][j].highlight();
                }
                count++;
            }
        }
    }

    public void burn() {
        int count = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (cooked.contains(count) && yup[i][j] instanceof Player) {
                    ((Player) yup[i][j]).gameOver();
                }
                count++;
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

    public void setPlayer(int x, int y, Player add) {
        yup[x][y] = add;
    }

    public void moveplayer(int x, int y, Player again) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (yup[i][j] instanceof Player) {
                    yup[i][j] = new Sprite();
                }
            }
        }
        setPlayer(x, y, again);
    }

    public void setEnemy(int x, int y, Enemy add) {
        for (int i = 0; i < add.face().size(); i++) {
            cooked.add(add.face().get(i));
        }
    }
}
