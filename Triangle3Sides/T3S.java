package Triangle3Sides;

public class T3S {
//    49  Triangle3Sides
//    • Fields: int a; int b; int c
//    • Methods: int perimeter(); boolean isValidSimple() (a+b>c etc.)
//            • Main: test with a few sets.
    int a, b, c;

    public int perimeter(){
        return a + b + c;
    }

    public boolean isValidSimple(){
        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Valid");
            return true;
        } else {
            System.out.println("Not valid");
            return false;
        }
    }
}