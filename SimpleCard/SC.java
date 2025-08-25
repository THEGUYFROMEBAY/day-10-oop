package SimpleCard;

import java.util.Random;

public class SC {
//    33  SimpleCard
//    • Fields: String rank; String suit
//    • Methods: String text() like "Q♥"; int value() (A=1, 2..10 as numbers, J=11 Q=12 K=13)
//            • Main: make few cards; print value + text
    String rank, suit;
    Random rand = new Random();

    public String text(){
        String[] suits = new String[]{"♥", "♣", "♦", "♠"};
        String[] ranks = new String[]{"A",  "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        rank = ranks[rand.nextInt(ranks.length)];
        suit = suits[rand.nextInt(suits.length)];
        String text = rank + "" + suit;
        return text;

    }

    public int value(){
        switch(rank){
            case "A": return 1;
            case "J": return 11;
            case "Q": return 12;
            case "K": return 13;
            default: return Integer.parseInt(rank);
        }

    }



}
