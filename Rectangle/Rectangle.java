package Rectangle;

public class Rectangle {
    //    16  Rectangle
//    • Fields: int w; int h
//    • Methods: int area(); int peri(); boolean isSquare()
//    • Main: create rectangles; print area/peri/square.
    int w, h;

    public int area() {
        return w * h;
    }

    public int peri() {
        return (w + h) * 2;
    }

    public boolean isSquare() {
        return w == h;
    }
}
