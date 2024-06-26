/**
 Student ID: 6510450861,
 Name: Moradop Hengprasert
 */

package ku.cs.applications;

import ku.cs.models.Board;
import ku.cs.models.Die;
import ku.cs.models.MGame;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MGame game = new MGame();
        Board board = game.getBoard();
        ArrayList<Die> dice = game.getDice();

        // add new square to game 40 squares
        String[] squareNames = {
                "START", "Enchanted Forest", "Wizard's Tower", "Goblin Caves", "Elven Grove",
                "Dwarven Mines", "Mermaid Lagoon", "Phoenix Nest", "Sorcerer's Sanctum", "Centaur Meadows",
                "Haunted Mansion", "Fairy Circle", "Troll Bridge", "Unicorn Vale", "Orc Stronghold",
                "Griffin Roost", "Witch's Hut", "Kraken Abyss", "Leprechaun Hollow", "Vampire Crypt",
                "Werewolf Den", "Pegasus Heights", "Basilisk Swamp", "Cyclops Peak", "Phoenix Ridge",
                "Siren Cove", "Yeti Glacier", "Gnome Village", "Sphinx Oasis", "Minotaur Maze",
                "Chimera Ridge", "Hydra Marsh", "Pirate Cove", "Genie Oasis", "Lich Tomb",
                "Ent Forest", "Djinn Desert", "Satyr Valley", "Banshee Bog", "Cerberus Gate"
        };

        for (String sname : squareNames) {
            board.addSquare(sname);
        }

        String firstSquare = squareNames[0];

        // add new players to game 4 people
        String[] fourPlayerNames = {"Trin", "Bank", "Doe", "Tom"};
        // String[] eightPlayerNames = {"Trin", "Bank", "Doe", "Tom", "Top", "Nu", "Aom", "Q"};
        for (String pname : fourPlayerNames) {
            game.addNewPlayer(pname, board, dice, board.getSquareList().get(0));
        }

        int numberOfRounds = 10;
        game.playGame(numberOfRounds);

        System.out.println("--------- Game finished after " + numberOfRounds + " rounds. --------");
    }
}
