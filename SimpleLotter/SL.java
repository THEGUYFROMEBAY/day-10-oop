package SimpleLotter;

import java.util.Arrays;
import java.util.Random;

public class SL {
//    30  SimpleLottery
//    • Fields: int[] picks (size 5); Random r
//    • Methods: void draw() (1..20, allow repeats); int matchCount(int[] guess)
//    • Main: draw; compare with a hard-coded guess; print matches.
    int[] picks = new int[5];
    Random r =  new Random();

    public void draw(){
        for (int i = 0; i < picks.length; i++) {
            picks[i] = r.nextInt(21);
        }
        System.out.println("The Cards Drawn" + Arrays.toString(picks));
    }

    public int matchCount(int[] guess){
        int count = 0;
        for (int i = 0; i < picks.length; i++) {
            for (int j = 0; j < picks.length; j++) {
                if (guess[i] == picks[j]) {
                    count++;
                }
            }
        }
        return count;
    }

}
