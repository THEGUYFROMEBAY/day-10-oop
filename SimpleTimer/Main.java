package SimpleTimer;

public class Main {
    //    18  SimpleTimer
//    • Fields: int secondsLeft
//    • Methods: void set(int s); void tick(); boolean finished()
//    • Main: tick until finished using loop; count ticks.
    public static void main(String[] args) {

        SimpleTimer st = new SimpleTimer();
        st.secondsleft = 50;
        st.set(0);
        st.tick();
        System.out.println(st.finished());

    }
}
