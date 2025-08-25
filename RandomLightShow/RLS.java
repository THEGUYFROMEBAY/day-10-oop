package RandomLightShow;

import java.util.Random;

public class RLS {
    //    32  RandomLightShow
//    • Fields: String color; Random r
//    • Methods: void blink() (set color randomly from {"RED","GREEN","BLUE"}); String show()
//    • Main: blink 10 times; print colors.
    String color;
    Random r = new Random();

    public void blink() {
        String[] colors = new String[]{"RED", "GREEN", "BLUE"};
        color = colors[r.nextInt(colors.length)];
    }

    public String show() {
        String show = ("Color: " + color);
        return show;
    }
}
