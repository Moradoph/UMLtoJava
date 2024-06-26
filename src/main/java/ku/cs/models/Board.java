/**
 Student ID: 6510450861,
 Name: Moradop Hengprasert
 */

package ku.cs.models;

import java.util.ArrayList;

public class Board {
    private ArrayList<Square> squareList;

    // constructor
    public Board() {
        this.squareList = new ArrayList<>();
    }

    // methods
    public void addSquare(String name) {
        Square square = new Square(name);
        this.squareList.add(square);
    }

    // getter
    public Square getSquare(Square oldLoc, int fvTot) {

        int newLocIndex = 0;
        for (int i = 0; i < squareList.size(); i++) {
            Square square = squareList.get(i);

            if (square.getName().equals(oldLoc.getName())) {
                newLocIndex = i + (fvTot);
                if (newLocIndex >= 40) { newLocIndex -= 40; } // !!
            }
        }

        return squareList.get(newLocIndex);
    }

    public ArrayList<Square> getSquareList() {
        return squareList;
    }
}
