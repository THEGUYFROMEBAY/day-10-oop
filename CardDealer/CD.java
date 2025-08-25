package CardDealer;

import SimpleCard.SC;

public class CD {
//    34  CardDealer
//    • Fields: SimpleCard[] deck (length 5); Random r
//    • Methods: void dealRandom(); int totalValue()
//    • Main: dealRandom then print totalValue and each card text.
    SC[] deck = new SC[5];

    public void init(){
        for(int i = 0; i < 5; i++){
            deck[i] = new SC();
        }
    }

    public void dealRandom(){
        for(int i = 0; i < 5; i++){
            System.out.println(deck[i].text());
        }
    }

    public int totalValue(){
        int sum = 0;
        for(int i = 0; i < 5; i++) {
            System.out.println(deck[i].value());
            sum = sum + deck[i].value();
        } return sum;
    }

}
