package FuelGauge;

public class Main {
    //     46  FuelGauge
//    • Fields: int liters; int max
//    • Methods: void add(int l); boolean consumeForKm(int km) (1L per 10km); int left()
//    • Main: add + consume; print left.
    public static void main(String[] args) {

        FG fg = new FG();
        fg.liters = 50;
        fg.max = 100;
        fg.add(20);
        fg.consumeForKm(4);
    }
}
