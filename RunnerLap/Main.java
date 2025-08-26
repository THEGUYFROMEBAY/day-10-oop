package RunnerLap;

public class Main {
    //     50  RunnerLap
//    • Fields: int lap; int lapLength; int totalMeters
//    • Methods: void runLap(); int metersSoFar()
//    • Main: run 3 laps; print meters.
    public static void main(String[] args) {

        RL rl = new RL();
        rl.lap = 0;
        rl.lapLength = 32;
        rl.totalMeters = 0;

        for (int i = 3; i >= 1;i--){
            rl.runLap();
            System.out.println(rl.metersSoFar());
        }

    }
}