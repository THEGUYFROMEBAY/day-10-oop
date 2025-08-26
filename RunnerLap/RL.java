package RunnerLap;

public class RL {
//     50  RunnerLap
//    • Fields: int lap; int lapLength; int totalMeters
//    • Methods: void runLap(); int metersSoFar()
//    • Main: run 3 laps; print meters.
    int lap, lapLength, totalMeters;

    public void runLap(){
        lap++;
        totalMeters++;
        if (totalMeters >= lapLength){
            System.out.println("You have finished " + totalMeters + " laps");
        }
    }

    public int metersSoFar(){
        return totalMeters;
    }

}
