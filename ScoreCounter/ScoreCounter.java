package ScoreCounter;

public class ScoreCounter {
// 12  ScoreCounter
//    • Fields: int score
//    • Methods: void add(int pts); void bonusIfOver(int threshold, int bonus); int get()
//    • Main: add points, apply bonus, print.
    int score;

    public void add(int pts){
        score = score + pts;
    }

    public void bonusIfOver(int threshold, int bonus){
        if (score >= threshold){
            add(bonus);
            System.out.println(get());
        }
    }

    public int get(){
        return score;
    }
}
