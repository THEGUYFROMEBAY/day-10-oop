package Problem5Dice;

import java.util.Random;

public class Dice {
//        5   Dice
//    • Fields: int face (1–6); Random r
//    • Methods: int roll() (updates face and returns it)
//            • Main: roll 10 times; print each roll.

    int face;
    Random r = new Random();
    public int roll(){
        r.nextInt(1, 6);
        face = r.nextInt(6) + 1;
        return face;
    }
}
