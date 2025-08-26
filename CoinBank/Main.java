package CoinBank;

public class Main {
    //     37  CoinBank
//    • Fields: int heads; int tails
//    • Methods: void record(String flip); int total(); String moreCommon()
//    • Main: record sequence {"H","T","H","H"}; print counts & winner.
    public static void main(String[] args) {

        CB cb = new CB();
        cb.record("HTHTTH");
        System.out.println(cb.total());
        System.out.println(cb.moreCommon());

    }

}
