package RandomWalker1D;

public class Main {
    //    39  RandomWalker1D
//    • Fields: int x; Random r
//    • Methods: void step() (±1 random); boolean atZero()
//    • Main: step until atZero (starting not zero), print number of steps.
    public static void main(String[] args) {
        RW1D rw = new RW1D();
        rw.x = 32;

        while (rw.atZero() == false){
            rw.step();
            System.out.println(rw.atZero());
        }

    }

}
