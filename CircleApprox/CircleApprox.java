package CircleApprox;

public class CircleApprox {
//        17  CircleApprox
//    • Fields: int r
//    • Methods: double area() (π≈3.14); double circ()
//    • Main: make, print area & circ.
    int r;
    double pi = 3.14159;

    public double area(){
        double area = pi * r * r;
        return area;
    }

    public double circ(){
        double area = pi * r * r;
        double circ = pi * area;
        return circ;
    }
}
