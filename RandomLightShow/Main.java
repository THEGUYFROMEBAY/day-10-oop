package RandomLightShow;

public class Main {
    //    32  RandomLightShow
//    • Fields: String color; Random r
//    • Methods: void blink() (set color randomly from {"RED","GREEN","BLUE"}); String show()
//    • Main: blink 10 times; print colors.
    public static void main(String[] args) {
        RLS rls = new RLS();
        for (int i = 0; i <= 10; i++) {
            rls.blink();
            System.out.println(rls.show());
            System.out.println(rls.color);
        }
    }
}
