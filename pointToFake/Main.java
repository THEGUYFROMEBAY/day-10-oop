package pointToFake;

public class Main {
    //    42  Point2Fake (no 2D arrays!)
//    • Fields: int x; int y
//    • Methods: void move(int dx, int dy); int manhattan() (|x|+|y|)
//            • Main: move a few times; print manhattan.
    public static void main(String[] args) {

        PTF ptf = new PTF();

        ptf.x = 5;
        ptf.y = 5;
        ptf.move(3, 23);
        System.out.println(ptf.manhatten());
        ptf.move(3, 3234);
        System.out.println(ptf.manhatten());
        ptf.move(3, 2234);
        System.out.println(ptf.manhatten());
        ptf.move(3, 24);
        System.out.println(ptf.manhatten());

    }
}
