package StopWatchSplit;

public class SWS {
//     54  StopwatchSplit
//    • Fields: int totalSec; int lastSplit
//    • Methods: void tick(int s); int split() (return diff since lastSplit & update lastSplit)
//            • Main: tick & split; print.
        int totalSec;
        int lastSplit;

        public void tick(int s) {
            totalSec += s;
            System.out.println(totalSec);
        }

        public int split() {
            int diff = totalSec - lastSplit;
            lastSplit = totalSec;
            return diff;
        }
    }

