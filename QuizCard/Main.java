package QuizCard;

import java.util.Scanner;

public class Main {
//    28  QuizCard
//    • Fields: String q; String a; int score
//    • Methods: boolean check(String ans) (case-insensitive), void right() score+=1
//            • Main: store few QuizCards in array; check 3 answers; print score.
    public static void main(String[] args) {

        QC qc = new QC();
        System.out.println(qc.q);
        Scanner input = new Scanner(System.in);
        qc.a = input.nextLine();
        System.out.println(qc.check(qc.a));

    }
}
