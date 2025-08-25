package TemperatureLog1;

public class main {
//            20  TemperatureLog1
//    • Fields: int[] log; int size
//    • Methods: void add(int t) (append if room); double avg(); int max()
//    • Main: add 5 temps; print avg and max.
    public static void main(String[] args) {

        TemperatureLog1 temp = new TemperatureLog1();
        temp.add(346);
        temp.add(34);
        temp.add(33);
        temp.add(342);
        temp.add(347);

        System.out.println(temp.avg());
        System.out.println(temp.max());

    }
}
