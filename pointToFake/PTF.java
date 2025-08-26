package pointToFake;

public class PTF {
//    42  Point2Fake (no 2D ar*/rays!)
//    • Fields: int x; int y
//    • Methods: void move(int dx, int dy); int manhattan() (|x|+|y|)
//            • Main: move a few times; print manhattan.
    int x, y;

    public void move(int dx, int dy){
        x += dx;
        y += dy;
    }

    public int manhatten(){
        int manX = 54;
        int manY = 5;
        int difference = Math.abs(x - manX);
        int difference2 = Math.abs(y - manY);
        return difference + difference2;

    }

}
