package CarOdometer;

public class Main {
    public static void main(String[] args) {
//        11  CarOdometer
//    • Fields: int km; int tank (0–50)
//    • Methods: void addFuel(int l); boolean drive(int distance) (use 1L per 10km; only if enough fuel); int fuelLeft()
//    • Main: add fuel, drive, print km and fuel.
        CarOdometer car = new CarOdometer();
        car.addFuel(20);
        System.out.println(car.drive(150));
        System.out.println("Kilometers: " + car.km);
        System.out.println("Fuel left: " + car.fuelLeft());
    }
}
