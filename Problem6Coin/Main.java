package Problem6Coin;

public class Main {
    //        6   Coin
//    • Fields: String side; Random r
//    • Methods: String flip() → "H" or "T" (store in side); boolean isHeads()
//    • Main: flip 20 times; count heads.
    public static void main(String[] args) {
        Coin coin = new Coin();
        int count = 0;
        for (int i = 1; i <= 20; i++) {
            coin.flip();
            if (coin.isHeads){
                count++;
            }
        }
        System.out.println("You flipped " + count + " Heads");
    }
}
