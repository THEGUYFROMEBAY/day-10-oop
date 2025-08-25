package Problem6Coin;
import java.util.Random;

public class Coin {
//        6   Coin
//    • Fields: String side; Random r
//    • Methods: String flip() → "H" or "T" (store in side); boolean isHeads()
//    • Main: flip 20 times; count heads.
    String side;
    boolean isHeads;

    Random r = new Random();

    public String flip(){
        r.nextInt(2);
        if(r.nextInt(2) == 0){
            isHeads = true;
        } else{
            isHeads = false;
        }
        if (isHeads){
            side = "heads";
            return side;
        } else {
            side = "tails";
            return side;
        }
    }
}
