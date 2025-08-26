package BudgetTracker;

public class Main {
    //     51  BudgetTracker
//    • Fields: int budget; int spent
//    • Methods: void buy(int price); int left(); boolean overspent()
//    • Main: buy a few items; print left.
    public static void main(String[] args) {

        buy();

    }

    public static void buy(){

        BT bt = new BT();
        bt.budget = 100;
        bt.spent = 0;
        bt.buy(43);
        System.out.println(bt.left());
        System.out.println(bt.overspent());

    }
}
