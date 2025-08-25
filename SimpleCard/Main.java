package SimpleCard;

public class Main {
    //     33  SimpleCard
//    • Fields: String rank; String suit
//    • Methods: String text() like "Q♥"; int value() (A=1, 2..10 as numbers, J=11 Q=12 K=13)
//            • Main: make few cards; print value + text.
    public static void main(String[] args) {

        SC sc = new SC();
        System.out.println(sc.text());
        System.out.println(sc.value());

    }
}
