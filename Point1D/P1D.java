package Point1D;

public class P1D {
//    41  Point1D
//    • Fields: int x
//    • Methods: void move(int dx); int distanceTo(Point1D other) (absolute)
//            • Main: create two points; move; print distance.
    int x;

    public void move (int dx){
        x += dx;
        System.out.println(x);
    }

    public int distanceTo(P1D other){
            return Math.abs(this.x - other.x);
    }

}
