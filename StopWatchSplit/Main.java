package StopWatchSplit;

public class Main {
    //     54  StopwatchSplit
//    • Fields: int totalSec; int lastSplit
//    • Methods: void tick(int s); int split() (return diff since lastSplit & update lastSplit)
//            • Main: tick & split; print.
    public static void main(String[] args) {

        SWS sws = new SWS();
        sws.totalSec = 32;
        sws.lastSplit = 0;
        sws.tick(34);
        System.out.println(sws.split());

    }
}
