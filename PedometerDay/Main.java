package PedometerDay;

public class Main {
//     56  PedometerDay
//    • Fields: int[] hours (length 24)
//    • Methods: void addHour(int h,int steps); int total(); int busiestHour()
//    • Main: set some hours; print total + busiest.
    public static void main(String[] args) {
        PD ped = new PD();

        ped.addHour(8, 200);
        ped.addHour(9, 500);
        ped.addHour(12, 300);
        ped.addHour(9, 100);

        System.out.println("Total steps: " + ped.total());

        System.out.println("Busiest hour: " + ped.busiestHour());
    }
}
