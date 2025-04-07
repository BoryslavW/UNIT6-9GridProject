public class Grid {
    private Sprite[][] grid = new Sprite[9][9];

    public Grid() {
        for (int y = 0; y < 9; y++) {
            for (int x = 0; x < 9; x++) {
                grid[x][y] = new Sprite();
            }
        }
    }

    public void addEnemy1() {
        int x = 0;
        int y = 0;
        int direction = 0;
        boolean done = false;
        while (!done) {
            x = (int) (Math.random() * 8) + 1;
            y = (int) (Math.random() * 8) + 1;
            direction = (int) (Math.random() * 4) + 1;
            if (!(grid[x][y] instanceof Player)) {
                done = true;
            }
        }
            Enemy enemy1 = new Enemy(x, y, direction);
            grid[x][y] = enemy1;
            enemy1.highlight(this);

    }

    public void addEnemy2() {
        int x = 0;
        int y = 0;
        int direction = 0;
        boolean done = false;
        while (!done) {
            x = (int) (Math.random() * 8) + 1;
            y = (int) (Math.random() * 8) + 1;
            direction = (int) (Math.random() * 4) + 1;
            if (!(grid[x][y] instanceof Player || grid[x][y] instanceof Enemy)) {
                done = true;
            }
        }
        Enemy enemy1 = new Enemy(x, y, direction);
        grid[x][y] = enemy1;
        enemy1.highlight(this);

    }

    public void addEnemy3() {
        int x = 0;
        int y = 0;
        int direction = 0;
        boolean done = false;
        while (!done) {
            x = (int) (Math.random() * 8) + 1;
            y = (int) (Math.random() * 8) + 1;
            direction = (int) (Math.random() * 4) + 1;
            if (!(grid[x][y] instanceof Player || grid[x][y] instanceof Enemy)) {
                done = true;
            }
        }
        Enemy enemy1 = new Enemy(x, y, direction);
        grid[x][y] = enemy1;
        enemy1.highlight(this);

    }

    public boolean isHighlighted(int x, int y) {
        return grid[x][9 - y].isHighlighted();
    }

    public void setPlayer(int x, int y, Player player) {
        grid[x][y] = player;
    }

    public void movePlayer(int oldX, int oldY, int newX, int newY) {
        grid[oldX][oldY] = new Sprite();
        grid[newX][newY] = new Player();
    }

    public void highlight(int x, int y) {
        if (!(grid[x][y] instanceof Enemy) && !(grid[x][y] instanceof Player)) {
            grid[x][y].setRed();
        }
    }

    public void flush() {
        for (int y = 0; y < 9; y++) {
            for (int x = 0; x < 9; x++) {
                if (grid[x][y].isRed()) {
                    grid[x][y] = new Sprite();
                }
                if (grid[x][y] instanceof Enemy) {
                    grid[x][y] = new Sprite();
                }
                if (grid[x][y].isHighlighted() && grid[x][y] instanceof Player) {
                    grid[x][y].setRed();
                }
                if (grid[x][y].isHighlighted()) {
                    grid[x][y].setRed();
                }
            }
        }
    }

    public Sprite getSprite(int x, int y) {
        return grid[x][y];
    }

    public void setHighlighted(int x, int y) {
        grid[x][y].setHighlighted();
    }

    public void print() {
        for (int y = 0; y < 9; y++) {
            for (int x = 0; x < 9; x++) {
                if (grid[x][y] instanceof Player) {
                    System.out.print("P ");
                }
                else if (grid[x][y].isHighlighted()) {
                    System.out.print("H ");
                }
                else if (grid[x][y] instanceof Enemy) {
                    System.out.print("E ");
                }
                else if (grid[x][y].isRed()) {
                    System.out.print("R ");
                }
                else System.out.print(". ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
