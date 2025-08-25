package StopWatch;

public class Main {
    //     9   Stopwatch
//    • Fields: int seconds
//    • Methods: void startAt(int s); void tick(int s); String format() "mm:ss"
//            • Main: startAt(0), tick(125), print "02:05".
    public static void main(String[] args) {

        StopWatch sw = new StopWatch();
        sw.start = 0;
        sw.minutes = 0;
        sw.seconds = 123432;

        sw.startAt(sw.start);
        sw.tick(sw.seconds);
    }
}