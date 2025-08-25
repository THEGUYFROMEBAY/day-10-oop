package SimpleTimer;

public class SimpleTimer {
//    18  SimpleTimer
//    • Fields: int secondsLeft
//    • Methods: void set(int s); void tick(); boolean finished()
//    • Main: tick until finished using loop; count ticks.
    int secondsleft;
    int seconds;

    public void set(int s){
        seconds = s;
    }

    public void tick(){
        for (int i = secondsleft; i > 0; i--){
            secondsleft--;
            System.out.println("Seconds left: " + secondsleft);
        }
    }

    public boolean finished(){
        if (secondsleft == 0){
            return true;
        } return false;
    }
}
