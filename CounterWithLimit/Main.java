package CounterWithLimit;

public class Main {
    //     52  CounterWithLimit
//    • Fields: int value; int min; int max
//    • Methods: void up(); void down(); void clamp(); boolean atEdge()
//    • Main: walk up/down; print.
    public static void main(String[] args) {

        test();

    }

    public static void test(){
        CWL cwl = new CWL();
        cwl.value = 56;
        cwl.min = 1;
        cwl.max = 100;
        cwl.up();
        cwl.down();
        cwl.clamp();
        System.out.println(cwl.atEdge());
    }
}
