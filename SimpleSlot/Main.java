package SimpleSlot;

public class Main {
    //    26  SimpleSlot
//    • Fields: int a,b,c; Random r
//    • Methods: void spin(); boolean jackpot() (all equal)
//            • Main: spin until jackpot; count spins.
    public static void main(String[] args) {

        SS ss = new SS();
        ss.spin();
        System.out.println(ss.jackpot());

    }
}
