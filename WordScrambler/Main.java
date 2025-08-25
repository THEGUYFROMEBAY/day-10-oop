package WordScrambler;

public class Main {
    //    35  WordScrambler
//    • Fields: String word; Random r
//    • Methods: String mixOnce() (swap two random positions)
//            • Main: scramble 5 times; print each
    public static void main(String[] args) {

        WS ws = new WS();
        ws.word = "Elza Karapetyan";

        for (int i = 0; i <= 5; i++){
            System.out.println(ws.mixOnce());
        }

    }
}
