package ScoreDie;

import java.util.Random;

public class ScoreDie {
//    31  ScoreDie
//    • Fields: Dice die; int total
//    • Methods: int turn() (roll 3 times, sum); void reset()
//    • Main: play 3 turns; print totals.
    int dice, total;
    Random rand = new Random();

    public int turn(){
        for (int i = 0; i <= 3; i++) {
            dice = rand.nextInt(6) + 1;
            total = dice + total;
        }
        return total;
    }

    public void reset(){
        dice = 0;
        total = 0;
        System.out.println(dice + "" + total);
    }

}
