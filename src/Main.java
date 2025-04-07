public class Main {
    public static void main(String[] args) {
        Grid grid = new Grid();
        Player player = new Player();
        grid.setPlayer(4, 4, player);

        int turns = 0;
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        while (player.living() && turns < 9) {
            grid.print(); // Show state
            System.out.print("Move (w/a/s/d): ");
            String move = scanner.nextLine();
            player.move(move, grid);

            grid.updateEnemies();
            turns++;
            if (!player.living()) {
                System.out.println("Game Over! Hit a red space.");
                break;
            }
            if (turns == 9) {
                System.out.println("You Win! Survived 9 turns.");
            }
        }
        scanner.close();
    }
}