package Problem7Thermometer;

public class Main {
    //        7   Thermometer
//    • Fields: int celsius
//    • Methods: void setC(int c); int toF() (F = C*9/5+32); boolean isFreezing() (≤0)
//            • Main: set few temps; print toF + freezing?
    public static void main(String[] args) {
        Thermometer tm = new Thermometer();
        tm.celsius = -4;
        System.out.println("Celsius : " + tm.celsius + " Fahrenheit" + tm.toF + " Is it Freezing" + tm.setC());
    }

}
