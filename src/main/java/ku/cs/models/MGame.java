/**
 Student ID: 6510450861,
 Name: Moradop Hengprasert
 */

package ku.cs.models;

import java.util.ArrayList;

public class MGame {
    private Board board;
    private ArrayList<Player> players;
    private ArrayList<Die> dice;
    private int roundCnt;

    public MGame() {
        this.board = new Board();

        this.players = new ArrayList<>();
        this.dice = new ArrayList<>();

        this.dice.add(new Die());
        this.dice.add(new Die());

        this.roundCnt = 0;
    }

    // to initiate the round of game
    private void playRound() {
        System.out.println("------------------ Round: " + (this.roundCnt + 1) + " ------------------");
        for (Player player : this.players) {
            player.takeTurn();
            System.out.println("player <" + player.getName() + ">, is now at square: " + player.getPiece().getLocation().getName() + ".");
        }
        this.roundCnt++;
    }

    public void playGame(int N) {
        checkReady();
        while (this.roundCnt < N) {
            playRound();
        }
    }

    // to add new player into the game
    public void addNewPlayer(String name, Board board, ArrayList<Die> dice, Square square) {
        this.players.add(new Player(name, board, dice, square));
    }

    // to output log and check that player state is correct
    public void checkReady() {
        System.out.println("------------------ WELCOME! ------------------");
        for (Player player : this.players) {
            System.out.println("player <" + player.getName() + ">, is now READY at square: " + player.getPiece().getLocation().getName() + ".");
        }
    }

    public Board getBoard() {
        return this.board;
    }

    public ArrayList<Player> getPlayers() {
        return this.players;
    }

    public ArrayList<Die> getDice() {
        return dice;
    }
}