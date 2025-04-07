import javax.swing.*;
import java.awt.*;

public class GridPanel extends JPanel {
    private Grid grid;

    public GridPanel(Grid grid) {
        this.grid = grid;

        setPreferredSize(new Dimension(450, 450));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int squareSize = Math.min(getWidth(), getHeight()) / 9;

        for (int y = 0; y < 9; y++) {
            for (int x = 0; x < 9; x++) {
                Sprite sprite = grid.getSprite(x, y);
                Color color = Color.WHITE; // default color

                if (sprite instanceof Player) {
                    color = Color.BLUE;
                } else if (sprite instanceof Enemy) {
                    color = Color.GREEN;
                } else if(sprite.isHighlighted()) {
                    color = Color.YELLOW;
                }  else if (sprite.isRed()) {
                    color = Color.RED;
                }
                g.setColor(color);
                g.fillRect(x * squareSize, y * squareSize, squareSize, squareSize);
                g.setColor(Color.BLACK);
                g.drawRect(x * squareSize, y * squareSize, squareSize, squareSize);
            }
        }
    }
}
