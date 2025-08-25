package Battary;

public class Battery {
//     15  Battery
//    • Fields: int percent (0–100)
//    • Methods: void charge(int n) (cap 100); void use(int n) (floor 0); boolean low() (≤15)
//            • Main: charge/use; print percent + low?.
    int percent;

    public void charge(int n){
        percent = percent + n;
        if (percent > 100) {
            percent = 100;
        }
        System.out.println("Battery charge is " + percent);
    }

    public void use(int n){
        percent = percent - n;
        if (percent < 0) {
            percent = 0;
        }

        System.out.println("this much percent left " + percent);
    }

    public boolean low(){
        if (percent <= 15){
            System.out.println(percent + " percent charge left please charge");
            return true;
        } return false;
    }

}
