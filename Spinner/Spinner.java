package Spinner;

import java.util.Random;

public class Spinner {
//        25  Spinner
//    • Fields: int sides; Random r
//    • Methods: int spin() (1..sides)
//            • Main: create 5-sided and 8-sided spinners; spin each 5 times.
    int sides;
    Random r = new Random();

    public int spin(){
        int outcome = r.nextInt(sides);
        return outcome;
    }

}
