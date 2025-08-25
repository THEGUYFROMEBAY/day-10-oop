package ScoreCounter;

public class Main {
    //     12  ScoreCounter
//    • Fields: int score
//    • Methods: void add(int pts); void bonusIfOver(int threshold, int bonus); int get()
//    • Main: add points, apply bonus, print.dd
    public static void main(String[] args) {
        ScoreCounter sc = new ScoreCounter();
        sc.score = 46;
        sc.add(3);
        System.out.println(sc.get());
        sc.bonusIfOver(34, 5);
    }

}
