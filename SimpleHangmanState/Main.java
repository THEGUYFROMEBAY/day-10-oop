package SimpleHangmanState;

import java.util.Scanner;

public class Main {
    //    36  SimpleHangmanState
//    • Fields: String secret; String guessedSoFar (same length, start "_")
//    • Methods: boolean tryChar(char c) (reveal all matches); boolean finished()
//    • Main: try some letters; print guessedSoFar until finished.
    public static void main(String[] args) {

        SHS shs = new SHS();
        Scanner sc = new Scanner(System.in);
        shs.secret = "Hello";
        shs.guessedSoFar = "";
        shs.init();

        while (!shs.finished()){
            System.out.println(shs.tryChar(sc.next().charAt(0)));
        }

    }

}
