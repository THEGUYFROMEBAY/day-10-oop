package CircleApprox;

public class Main {
    //        17  CircleApprox
//    • Fields: int r
//    • Methods: double area() (π≈3.14); double circ()
//    • Main: make, print area & circ.
    public static void main(String[] args) {

        CircleApprox ca = new CircleApprox();
        ca.r = 4;
        System.out.println(ca.area());
        System.out.println(ca.circ());

    }
}
