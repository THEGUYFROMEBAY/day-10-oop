package WaterBottle;

public class Main {
    //    2   WaterBottle
//    • Fields: int ml; int maxMl
//    • Methods: void drink(int n); void refill(); boolean isEmpty()
//    • Main: simulate drink/refill; print ml after each.
    public static void main(String[] args) {
        WatterBottle wb = new WatterBottle();
        wb.mxML = 100;
        wb.ml = wb.mxML;
        wb.drink(100);

//        wb.refill();
//        System.out.println(wb.ml + " That much is after refilling");
    }
}
