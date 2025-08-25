package NumberLineWalker;

public class NLW {
//    23  NumberLineWalker
//    • Fields: int pos
//    • Methods: void stepLeft(); void stepRight(); int getPos()
//    • Main: take a sequence of steps in a loop; print pos.
    int pos;

    public void stepLeft(){
        pos--;
    }

    public void stepRight(){
        pos++;
    }

    public int getPos(){
        return pos;
    }

}
