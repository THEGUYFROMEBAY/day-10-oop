package Ladder;

public class Ladder {
//    55  Ladder
//    • Fields: int steps; int current
//    • Methods: void up(); void down(); boolean atTop(); boolean atBottom()
//    • Main: climb; print current.
    int steps, current;

    public void up(){
        current++;
        System.out.println(current);
    }

    public void down(){
        current--;
        System.out.println(current);
    }

    public boolean atTop(){
        if (current == steps){
            return true;
        } return false;
    }

    public boolean atBottom(){
        if (current == 0){
            return true;
        } return false;
    }

}
