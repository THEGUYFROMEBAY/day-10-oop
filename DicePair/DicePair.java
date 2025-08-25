package DicePair;

import java.util.Random;

public class DicePair {
//    29  DicePair
//    • Fields: Dice d1, d2
//    • Methods: int rollSum(); boolean doubles()
//    • Main: roll many times; count doubles.
    int d1, d2;
    int doubles = 0;
    Random rand = new Random();

    public int rollsum(){
        d1 = rand.nextInt(6)+1;
        System.out.println(d1);
        d2 = rand.nextInt(6)+1;
        System.out.println(d2);
        return d1 + d2;
    }

    public boolean doubles(){
        if (d1 == d2){
            doubles++;
            return true;
        } return  false;
    }

}
