package DicePair;

public class Main {
    //    29  DicePair
//    • Fields: Dice d1, d2
//    • Methods: int rollSum(); boolean doubles()
//    • Main: roll many times; count doubles.
    public static void main(String[] args) {

        DicePair dp = new DicePair();
        for (int i = 0; i < 234123; i++){
            System.out.println(dp.rollsum());
            System.out.println(dp.doubles());
        } System.out.println(dp.doubles);

    }
}
