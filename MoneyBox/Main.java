package MoneyBox;

public class Main {
    //    48  MoneyBox
//    • Fields: int cents
//    • Methods: void addCoins(int c); boolean tryPay(int c); int getCents()
//    • Main: tryPay more than you have; print result./
    public static void main(String[] args) {

        MB mb = new MB();
        mb.cents = 3243;
        mb.addCoins(324);
        System.out.println(mb.getCents());
        System.out.println(mb.tryPay(42345));
        System.out.println(mb.tryPay(324));

    }

}
