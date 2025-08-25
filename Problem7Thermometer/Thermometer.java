package Problem7Thermometer;

public class Thermometer {
//        7   Thermometer
//    • Fields: int celsius
//    • Methods: void setC(int c); int toF() (F = C*9/5+32); boolean isFreezing() (≤0)
//            • Main: set few temps; print toF + freezing?

    int celsius;
    int toF = celsius*9/5+32;

    public boolean setC(){
        boolean isFreezing;
        if(celsius <= 0){
            isFreezing = true;
        } isFreezing = false;
        return isFreezing;
    }
}
