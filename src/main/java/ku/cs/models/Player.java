/**
 Student ID: 6510450861,
 Name: Moradop Hengprasert
 */

package ku.cs.models;

import java.util.ArrayList;

public class Player {
    private String name;
    private Piece piece;
    private Board board;
    private ArrayList<Die> dice;

    // constructor
    public Player(String name, Board board, ArrayList<Die> dice, Square square) {
        this.name = name;
        this.board = board;
        this.dice = dice;
        this.piece = new Piece(square);
    }

    // method
    public void takeTurn() {
        int fvTot = 0;
        for (Die die : dice) {
            die.roll();
            int fv = die.getFaceValue();
            fvTot += fv;
            System.out.println(name + " rolled a " + fv + ".");
        }
        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc, fvTot);
        piece.setLocation(newLoc);
    }

    // getter
    public Piece getPiece() {
        return piece;
    }
    public String getName() {
        return name;
    }

}
