package Triangle3Sides;

public class Main {
    //    49  Triangle3Sides
//    • Fields: int a; int b; int c
//    • Methods: int perimeter(); boolean isValidSimple() (a+b>c etc.)
//            • Main: test with a few sets.
    public static void main(String[] args) {

        T3S ts = new T3S();
        ts.a = 60;
        ts.b = 60;
        ts.c = 60;

        System.out.println(ts.perimeter());
        System.out.println(ts.isValidSimple());

    }
}
