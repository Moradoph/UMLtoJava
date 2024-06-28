/**
 Student ID: 6510450861,
 Name: Moradop Hengprasert
 */

package ku.cs.models;

import java.util.Random;

public class Die {
    private int faceValue;
    private final int MAX_VALUE = 6;

    public Die() {
        this.faceValue = 1;
    }

    // to roll dices or to random the faceValue of dices
    public void roll() {
        Random rand = new Random();
        faceValue = rand.nextInt(MAX_VALUE) + 1;
    }

    public int getFaceValue() {
        return this.faceValue;
    }
}
