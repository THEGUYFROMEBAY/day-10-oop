package RandomWalker1D;

import java.util.Random;

public class RW1D {
//    39  RandomWalker1D
//    • Fields: int x; Random r
//    • Methods: void step() (±1 random); boolean atZero()
//    • Main: step until atZero (starting not zero), print number of steps.
    int x;
    Random r = new Random();

    public void step(){
        int step = r.nextInt(-1, 2);
        switch(step){
            case -1: x--; break;
            case 1: x++; break;
        }
        System.out.println(x);
        System.out.println(step);
    }

    public boolean atZero(){
        if (x == 0) return true;
        return false;
    }

}
