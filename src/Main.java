public class Main {
    public static void main(String[] args) {
        Grid grid = new Grid();
        Player player = new Player();
        grid.setPlayer(4, 4, player);

        int turns = 0;
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        while (player.living() && turns < 9) {
            grid.addEnemy1();
            grid.addEnemy2();
            grid.addEnemy3();
            grid.print();
            System.out.print("Move (w/a/s/d): ");
            String move = scanner.nextLine();
            player.move(move, grid);
            //highlighted turn red
            // new enemies spawn highlights already appearing
            if (!player.living()) {
                System.out.println("Game Over! Hit a red space.");
                break;
            }
            if (turns == 9) {
                System.out.println("You Win! Survived 9 turns.");
            }
            grid.flush();
            turns++;
        }
        scanner.close();
    }
}