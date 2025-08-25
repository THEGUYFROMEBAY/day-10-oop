package ScoreDie;

public class Main {
    //    31  ScoreDie
//    • Fields: Dice die; int total
//    • Methods: int turn() (roll 3 times, sum); void reset()
//    • Main: play 3 turns; print totals.
    public static void main(String[] args) {

        ScoreDie sd = new ScoreDie();
        System.out.println(sd.turn());
        sd.reset();

    }
}
