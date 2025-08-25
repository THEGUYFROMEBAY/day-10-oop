package Problem10Lightbulb;

public class Main {
//     10  LightBulb
//    • Fields: boolean on; int hoursOn
//    • Methods: void toggle(); void tickHour() (if on, hoursOn++); boolean isOn()
//    • Main: toggle/tick; print hoursOn.

    public static void main(String[] args) {

        Lightbulb lb = new Lightbulb();
        lb.toggle();
        lb.tickHour();


    }
}
