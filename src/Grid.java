import java.util.ArrayList;

public class Grid {
    private Sprite[][] grid = new Sprite[9][9];
    private Enemy[] enemies = new Enemy[3]; // Simple fixed array
    private int enemyCount = 3;

    public Grid() {
        for (int y = 0; y < 9; y++) {
            for (int x = 0; x < 9; x++) {
                grid[x][y] = new Sprite();
            }
        }
        enemies[0] = new Enemy(0, 0, 2); // East
        enemies[1] = new Enemy(8, 0, 4); // West
        enemies[2] = new Enemy(4, 8, 1); // North
        for (int i = 0; i < enemyCount; i++) {
            grid[enemies[i].getX()][enemies[i].getY()] = enemies[i];
        }
    }

    public void setPlayer(int x, int y, Player player) {
        grid[x][y] = player;
    }

    public void movePlayer(int oldX, int oldY, int newX, int newY) {
        grid[oldX][oldY] = new Sprite();
        grid[newX][newY] = grid[oldX][oldY]; // Temp swap
        grid[oldX][oldY] = new Sprite();
        grid[newX][newY] = (Player) grid[newX][newY]; // Player moves
    }

    public void highlight(int x, int y) {
        if (!(grid[x][y] instanceof Enemy) && !(grid[x][y] instanceof Player)) {
            grid[x][y].setRed(true); // Highlight only if not occupied
        }
    }

    public void updateEnemies() {
        // Turn current highlights red
        for (int y = 0; y < 9; y++) {
            for (int x = 0; x < 9; x++) {
                if (grid[x][y].isRed()) {
                    grid[x][y].setRed(true);
                }
            }
        }
        // New highlights
        for (int i = 0; i < enemyCount; i++) {
            if (enemies[i] != null) {
                enemies[i].highlight(this);
            }
        }
        // Remove one enemy
        if (enemyCount > 0) {
            for (int i = 0; i < enemyCount; i++) {
                if (enemies[i] != null) {
                    grid[enemies[i].getX()][enemies[i].getY()] = new Sprite();
                    enemies[i] = null;
                    enemyCount--;
                    break; // Remove first non-null enemy
                }
            }
        }
    }

    public Sprite getSprite(int x, int y) {
        return grid[x][y];
    }

    public void print() {
        for (int y = 0; y < 9; y++) {
            for (int x = 0; x < 9; x++) {
                if (grid[x][y] instanceof Player) System.out.print("P ");
                else if (grid[x][y] instanceof Enemy) System.out.print("E ");
                else if (grid[x][y].isRed()) System.out.print("R ");
                else System.out.print(". ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
