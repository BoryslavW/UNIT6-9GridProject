public class Main {
    public static void main(String[] args) {
    //initial commit to Github

    //main menu offers a start button or an end button
    // write a start menu method so that you can re-use it after each time a player fails

    Grid grid = new Grid();
    Player guy = new Player();
    Boolean gameEnd = false;
    int waves = 0;

    while(guy.living() && !gameEnd) {
        //fix these nums cuz the grids start from 0
        int rand1 = (int) (Math.random() * 27);
        int rand2 = 27 + (int) (Math.random() * 27);
        int rand3 = 54 + (int) (Math.random() * 27);

        // use the static enemy methods to create the mcguffin

        // the mcguffin will just be a spot where the player has to reach to de-spawn the enemies per wave

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (true) {

                }
                else if (true) {

                }
            }
        }
        //repaint
    }


    // it will be a 9x9 grid with the player start in the middle, the non player characters
    // spawn facing a certain direction with a higher probability to somewhat face the player
    // the npcs attack directly in the way they are facing, either 5 or 6 block range, if an npc
    // hits another npc they are counted as hit and taken out, everything has one health with the
    // player included


    // the player can attack in a 3x3 grid, they have to plan there moves to not be hit


    // maybe two modes separated by 2 different windows or maybe a reset window, after a certain amount
    // of turns you unlock the boss battle, in which the player moves freely and has diagonal or expanding
    // attacks launched at them
    }
}
