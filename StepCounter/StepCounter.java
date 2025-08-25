package StepCounter;

public class StepCounter {
//        14  StepCounter
//    • Fields: int steps
//    • Methods: void addSteps(int n); boolean reached(int goal); void reset()
//    • Main: add steps; check goal.
    int steps;

    public void addsteps(int n){
        steps = steps + n;
        System.out.println(steps);
    }

    public boolean reached(int goal){
        if (steps >= goal) return true;
        return false;
    }

    public void reset(){
        steps = 0;
        System.out.println("Steps Set to 0");
    }
}
