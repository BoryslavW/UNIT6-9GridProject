import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Initialize game logic
        Grid grid = new Grid();
        Player player = new Player();
        grid.setPlayer(4, 4, player);

        // Create the GUI
        JFrame frame = new JFrame("Grid Game");
        GridPanel panel = new GridPanel(grid);
        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        int turns = 0;
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        while (player.living() && turns < 9) {
            grid.addEnemy1();
            grid.addEnemy2();
            grid.addEnemy3();
            grid.print();  // This will still print to the console.

            // Repaint the panel to reflect the new grid state.
            panel.repaint();

            System.out.print("Move (w/a/s/d): ");
            String move = scanner.nextLine();
            player.move(move, grid);

            if (!player.living()) {
                System.out.println("Game Over! Hit a red space.");
                break;
            }
            if (turns == 9) {
                System.out.println("You Win! Survived 9 turns.");
            }
            grid.flush();
            turns++;

            // Update the panel after flushing:
            panel.repaint();
        }
        scanner.close();
    }
}