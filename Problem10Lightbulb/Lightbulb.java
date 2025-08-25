package Problem10Lightbulb;

public class Lightbulb{
//     10  LightBulb
//    • Fields: boolean on; int hoursOn
//    • Methods: void toggle(); void tickHour() (if on, hoursOn++); boolean isOn()
//    • Main: toggle/tick; print hoursOn.

    boolean on;
    int hoursOn;

    public void toggle(){
        on = true;
    }

    public void tickHour(){
        if (on){
            hoursOn++;
        }
        System.out.println("On: " + hoursOn);
    }
}
