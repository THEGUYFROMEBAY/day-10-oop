package WaterBottle;

public class WatterBottle {
//    2   WaterBottle
//    • Fields: int ml; int maxMl
//    • Methods: void drink(int n); void refill(); boolean isEmpty()
//    • Main: simulate drink/refill; print ml after each.
    int ml, mxML;
    boolean isEmpty;

    public void check(){
        if (ml == 0){
            isEmpty = true;
        }
        if (isEmpty){
            refill();
            System.out.println(ml + " That much is after refilling We refilled cuz there wasnt any water");
        }
    }

    public void drink(int n){
        for (int i = n; i > 0; i--) {
            ml = ml - 1;
        }
        System.out.println("drinking this much water " + n + " this much is left " + ml);
        check();
    }
    public void refill(){
        for (int i = ml; i < mxML; i++) {
            ml = ml + 1;
        }
    }
}