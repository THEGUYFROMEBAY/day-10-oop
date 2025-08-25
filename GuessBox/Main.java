package GuessBox;

public class Main {
    //    21  GuessBox
//    • Fields: int secret (1..10); Random r
//    • Methods: void newSecret(); boolean guess(int g)
//    • Main: newSecret; loop guessing 1..10 until found; count tries.
    public static void main(String[] args) {

        GuessBox gb = new GuessBox();
        gb.newSecret();
        System.out.println(gb.guess(3));

    }
}
