package CarOdometer;

public class CarOdometer {
//    11  CarOdometer
//    • Fields: int km; int tank (0–50)
//    • Methods: void addFuel(int l); boolean drive(int distance) (use 1L per 10km; only if enough fuel); int fuelLeft()
//    • Main: add fuel, drive, print km and fuel.
    int km;
    int tank = 50;
    int fuel;

    public void addFuel(int l) {
        if (fuel + l <= tank) {
            fuel += l;
        }
    }

    public boolean drive(int distance) {
        int needed = distance / 10;
        if (needed <= fuel) {
            km += distance;
            fuel -= needed;
            return true;
        }
        return false;
    }

    public int fuelLeft() {
        return fuel;
    }
}
