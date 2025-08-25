package RockPaperScissors;

public class Main {
//22  RockPaperScissors
//    • Fields: String last; Random r
//    • Methods: String cpuMove(); int result(String player) (1 win, 0 draw, -1 lose)
//            • Main: play 10 rounds with random player moves; print results.
    public static void main(String[] args) {

        RPS rps = new RPS();
        System.out.println(rps.cpuMove());
        System.out.println(rps.result("RoCk"));

    }
}
