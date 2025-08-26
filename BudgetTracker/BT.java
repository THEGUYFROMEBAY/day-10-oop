package BudgetTracker;

public class BT {
//     51  BudgetTracker
//    • Fields: int budget; int spent
//    • Methods: void buy(int price); int left(); boolean overspent()
//    • Main: buy a few items; print left.
    int budget, spent;

    public void buy(int price){
        spent += price;
    }

    public int left(){
        return Math.abs(spent - budget);
    }

    public boolean overspent(){
        return spent > budget;
    }
}
