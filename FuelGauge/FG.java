package FuelGauge;

public class FG {
//     46  FuelGauge
//    • Fields: int liters; int max
//    • Methods: void add(int l); boolean consumeForKm(int km) (1L per 10km); int left()
//    • Main: add + consume; print left.
    int liters, max;

    public void add(int l){
        liters = liters + l;
        if(liters > max){
            liters = max;
        }
        System.out.println(liters);
    }

    public boolean consumeForKm(int km) {
        km = km * 10;
        liters = liters - km;
        if (liters <= 0){
            liters = 0;
            System.out.println(liters);
            return false;
        }
        System.out.println(liters);
        return true;
    }
}
