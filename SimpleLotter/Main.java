package SimpleLotter;

public class Main {
    //    30  SimpleLottery
//    • Fields: int[] picks (size 5); Random r
//    • Methods: void draw() (1..20, allow repeats); int matchCount(int[] guess)
//    • Main: draw; compare with a hard-coded guess; print matches.
    public static void main(String[] args) {

        SL sl = new SL();
        int[] g = new int[] {1,2,3,4,5};
        sl.draw();
        System.out.println(sl.matchCount(g));

    }
}
