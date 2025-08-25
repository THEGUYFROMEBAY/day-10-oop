package Problem4SimpleClock;

public class SimpleClock {
//        4   SimpleClock
//    • Fields: int hours (0–23); int minutes (0–59)
//    • Methods: void tick() (adds 1 minute, handle hour wrap); String show() like "07:05"
//            • Main: tick 70 times from 07:00; print show().f
    int hours, minutes;
    String show;

    public void minutesHandling1Tick(){
        minutes++;
        if (minutes > 59) {
            minutes = 0;
            hours++;
        } show = hours + ":" + minutes;
        System.out.println(show);
    }

    public void hoursHandling(){
        if (hours > 23) {
            hours = 0;
        }
    }
}
