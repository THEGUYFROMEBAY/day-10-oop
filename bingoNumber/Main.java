package bingoNumber;

public class Main {
    //    38  BingoNumber
//    • Fields: int number (1..75)
//    • Methods: String column() (B 1..15, I 16..30, N 31..45, G 46..60, O 61..75)
//            • Main: make numbers and print "B12" style text.
    public static void main(String[] args) {

        BN bn = new BN();
        bn.number = 43;
        System.out.println(bn.column());

    }

}
