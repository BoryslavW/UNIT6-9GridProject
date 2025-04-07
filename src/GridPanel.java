import javax.swing.*;
import java.awt.*;

public class GridPanel extends JPanel {
    private Grid grid;

    public GridPanel(Grid grid) {
        this.grid = grid;
        // set a preferred size (for a 9x9 grid, you may adjust accordingly)
        setPreferredSize(new Dimension(450, 450));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int squareSize = Math.min(getWidth(), getHeight()) / 9;
        // Loop through grid rows and columns (using y for row, x for column)
        for (int y = 0; y < 9; y++) {
            for (int x = 0; x < 9; x++) {
                Sprite sprite = grid.getSprite(x, y);
                Color color = Color.WHITE; // default color
                // Follow the exact same priority as your console print:
                if (sprite instanceof Player) {
                    color = Color.BLUE;
                } else if (sprite.isHighlighted()) {
                    color = Color.YELLOW;
                } else if (sprite instanceof Enemy) {
                    color = Color.GREEN;
                } else if (sprite.isRed()) {
                    color = Color.RED;
                }
                g.setColor(color);
                g.fillRect(x * squareSize, y * squareSize, squareSize, squareSize);
                // Optionally, draw the grid lines
                g.setColor(Color.BLACK);
                g.drawRect(x * squareSize, y * squareSize, squareSize, squareSize);
            }
        }
    }
}
