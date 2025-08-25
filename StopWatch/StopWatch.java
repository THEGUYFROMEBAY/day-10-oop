package StopWatch;

public class StopWatch {
//     9   Stopwatch
//    • Fields: int seconds
//    • Methods: void startAt(int s); void tick(int s); String format() "mm:ss"
//            • Main: startAt(0), tick(125), print "02:05".

    int seconds;
    int minutes;
    int start;

    public void startAt(int s) {
        start = s;
    }

    public void tick(int t){
        for (int i = start; i <= t; i++) {
            seconds = seconds + 1;
            if (seconds > 59) {
                minutes++;
                seconds = 0;
            }

        }
        String format = seconds + " " + minutes;
        System.out.println(format);
    }
}
