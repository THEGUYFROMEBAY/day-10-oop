package Battary;

public class Main {
    //     15  Battery
//    • Fields: int percent (0–100)
//    • Methods: void charge(int n) (cap 100); void use(int n) (floor 0); boolean low() (≤15)
//            • Main: charge/use; print percent + low?.
    public static void main(String[] args) {

        Battery battery = new Battery();
        battery.percent = 50;
        System.out.println(battery.percent);// 50
        battery.charge(10); // 60
        battery.use(55);// 5
        battery.low();

    }
}
