package StepCounter;

public class Main {
//        14  StepCounter
//    • Fields: int steps
//    • Methods: void addSteps(int n); boolean reached(int goal); void reset()
//    • Main: add steps; check goal.
    public static void main(String[] args) {

        StepCounter sc = new StepCounter();
        sc.steps = 0;
        sc.addsteps(50);
        System.out.println(sc.reached(43));
        sc.reset();

    }
}
