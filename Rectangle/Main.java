package Rectangle;

public class Main {
//    16  Rectangle
//    • Fields: int w; int h
//    • Methods: int area(); int peri(); boolean isSquare()
//    • Main: create rectangles; print area/peri/square.
    public static void main(String[] args) {

        Rectangle rect = new Rectangle();
        rect.w = 4;
        rect.h = 3;
        System.out.println(rect.area());
        System.out.println(rect.peri());
        System.out.println(rect.isSquare());

    }
}
