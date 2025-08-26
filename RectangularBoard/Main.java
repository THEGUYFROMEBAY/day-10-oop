package RectangularBoard;

public class Main {
    // 45  RectangleBoard
//    • Fields: int w; int h; char fill
//    • Methods: String draw() return lines using fill; int area()
//    • Main: draw a 3x5 board; print text.
    public static void main(String[] args) {

        RB rb = new RB();
        rb.w = 50;
        rb.h = 50;
        rb.fill = 'a';
        System.out.println(rb.draw());
        System.out.println(rb.area());

    }
}
