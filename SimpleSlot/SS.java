package SimpleSlot;

import java.util.Random;

public class SS {
    //    26  SimpleSlot
//    • Fields: int a,b,c; Random r
//    • Methods: void spin(); boolean jackpot() (all equal)
//            • Main: spin until jackpot; count spins.
    int a, b, c;
    Random r = new Random();

    public void spin() {
        a = r.nextInt(10);
        b = r.nextInt(10);
        c = r.nextInt(10);
        System.out.println("You Got " + a + " " + b + " " + c);
    }

    public boolean jackpot() {
        return a == b && b == c;
    }


}
