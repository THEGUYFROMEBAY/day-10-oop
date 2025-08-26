package Ladder;

public class Main {
    //    55  Ladder
//    • Fields: int steps; int current
//    • Methods: void up(); void down(); boolean atTop(); boolean atBottom()
//    • Main: climb; print current.
    public static void main(String[] args) {

        Ladder lad = new Ladder();
        lad.steps = 15;
        lad.current = 0;
        lad.up();
        lad.down();
        System.out.println(lad.atTop());
        System.out.println(lad.atBottom());

    }
}
