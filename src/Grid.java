public class Grid {
    Sprite[][] yup;

    public Grid () {
        yup = new Sprite[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                yup[i][j] = new Sprite();
            }
        }
    }

    public void setThing(int x, int y, Sprite add) {
        yup[x][y] = add;
    }
}
