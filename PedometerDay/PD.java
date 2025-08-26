package PedometerDay;

public class PD {
//     56  PedometerDay
//    • Fields: int[] hours (length 24)
//    • Methods: void addHour(int h,int steps); int total(); int busiestHour()
//    • Main: set some hours; print total + busiest.
    int[] hours = new int[24];

    public void addHour(int h, int steps) {
        hours[h] += steps;  // add steps to the correct hour
    }

    public int total() {
        int sum = 0;
        for (int s : hours) {
            sum += s;
        }
        return sum;
    }

    public int busiestHour() {
        int maxSteps = hours[0];
        int maxHour = 0;
        for (int i = 1; i < hours.length; i++) {
            if (hours[i] > maxSteps) {
                maxSteps = hours[i];
                maxHour = i;
            }
        }
        return maxHour;
    }
}
