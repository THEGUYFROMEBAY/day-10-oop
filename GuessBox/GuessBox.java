package GuessBox;

import java.util.Random;

public class GuessBox {
    //    21  GuessBox
//    • Fields: int secret (1..10); Random r
//    • Methods: void newSecret(); boolean guess(int g)
//    • Main: newSecret; loop guessing 1..10 until found; count tries.
    Random rand = new Random();
    int secret = rand.nextInt(11);

    public void newSecret() {
        secret = rand.nextInt(11);
    }

    public boolean guess(int g) {
        if (g == secret) {
            return true;
        }
        System.out.println(secret);
        return false;
    }
}
