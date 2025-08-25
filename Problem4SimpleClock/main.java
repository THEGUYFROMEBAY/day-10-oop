package Problem4SimpleClock;

public class main {
    //        4   SimpleClock
//    • Fields: int hours (0–23); int minutes (0–59)
//    • Methods: void tick() (adds 1 minute, handle hour wrap); String show() like "07:05"
//            • Main: tick 70 times from 07:00; print show().
    public static void main(String[] args) {
        SimpleClock sc = new SimpleClock();
        for (int i = 1; i <= 70; i++) {
            sc.minutesHandling1Tick();
            sc.hoursHandling();
        }
    }
}
