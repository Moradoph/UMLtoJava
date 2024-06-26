/**
 Student ID: 6510450861,
 Name: Moradop Hengprasert
 */

package ku.cs.models;

public class Piece {
    private Square location;

    // constructor
    public Piece(Square location) {
        this.location = location;
    }

    // setter
    public void setLocation(Square location) {
        this.location = location;
    }

    // getter
    public Square getLocation() {
        return location;
    }
}
