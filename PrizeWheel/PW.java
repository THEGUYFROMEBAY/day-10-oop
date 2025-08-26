package PrizeWheel;

import java.util.Random;

public class PW {
//      40  PrizeWheel
//    • Fields: String[] prizes; Random r
//    • Methods: String spin() returns a random prize; int indexOf(String p)
//    • Main: spin 5 times; print each prize.
    String[] prizes = new String[]{"Candy", "Keyboard", "Mouse", "Computer"};
    Random r = new Random();

    public String spin(){
        String spin = prizes[r.nextInt(prizes.length)];
        return spin;
    }

    public int indexOf(String P){
        for (int i = 0; i < prizes.length; i++){
            if (prizes[i].equals(P)){
                return i;
            }
        }
        return -1;
    }

}
