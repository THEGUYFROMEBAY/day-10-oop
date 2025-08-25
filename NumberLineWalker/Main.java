package NumberLineWalker;

public class Main {
    //    23  NumberLineWalker
//    • Fields: int pos
//    • Methods: void stepLeft(); void stepRight(); int getPos()
//    • Main: take a sequence of steps in a loop; print pos.\
    public static void main(String[] args) {

        NLW nlw = new NLW();
        nlw.pos = 50;
        nlw.stepRight();
        System.out.println(nlw.getPos());
        nlw.stepLeft();
        System.out.println(nlw.getPos());

    }
}
