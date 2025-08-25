package QuizCard;

import java.util.Random;

public class QC {
    //    28  QuizCard
//    • Fields: String q; String a; int score
//    • Methods: boolean check(String ans) (case-insensitive), void right() score+=1
//            • Main: store few QuizCards in array; check 3 answers; print score.
    String a;
    int score;

    Random rand = new Random();

    String[] cards = {"Who gives us too much Homework", "Who makes me want to $%^* myself", "Who is makes me happy"};
    String q = cards[rand.nextInt(cards.length)];



    public boolean check(String ans) {
        ans = ans.toLowerCase();

        if (q.equals("Who gives us too much Homework") && ans.equals("mher")) {
            right();
            return true;
        } else if (q.equals("Who makes me want to $%^* myself") && ans.equals("not mher")) {
            right();
            return true;
        } else if (q.equals("Who is makes me happy") && ans.equals("mher")) {
            right();
            return true;
        } else return false;

    }

    public void right() {
        System.out.println("Correct");
        score += 1;
    }

}
