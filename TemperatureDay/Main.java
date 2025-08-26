package TemperatureDay;

public class Main {
    //    44  TemperatureDay
//    • Fields: int morning; int noon; int evening
//    • Methods: int max(); double avg()
//    • Main: print max and avg.
    public static void main(String[] args) {

        TD td = new TD();
        td.morning = 22;
        td.noon = 23;
        td.evening = 24;
        System.out.println(td.max());
        System.out.println(td.avg());

    }

}
