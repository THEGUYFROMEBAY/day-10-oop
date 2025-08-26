package Point1D;

public class Main {
    //        41  Point1D
//    • Fields: int x
//    • Methods: void move(int dx); int distanceTo(Point1D other) (absolute)
//            • Main: create two points; move; print distance.
    public static void main(String[] args) {

        P1D p1 = new P1D();
        P1D p2 = new P1D();

        p1.x = 8;
        p2.x = -546;

        p1.move(4);
        p2.move(4);

        p1.distanceTo(p2);
        p2.distanceTo(p1);

    }

}
