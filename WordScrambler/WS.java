package WordScrambler;

import java.util.Random;

public class WS {
//    35  WordScrambler
//    • Fields: String word; Random r
//    • Methods: String mixOnce() (swap two random positions)
//            • Main: scramble 5 times; print each.
    String word;
    Random r = new Random();

    public String mixOnce(){
        int pos1 = r.nextInt(word.length());
        int pos2 = r.nextInt(word.length());
        char[] letters = word.toCharArray();
        char temp = letters[pos1];
        letters[pos1] = letters[pos2];
        letters[pos2] = temp;
        return new String(letters);

    }

}
