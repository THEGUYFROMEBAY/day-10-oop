package MoneyBox;

public class MB {
//    48  MoneyBox
//    • Fields: int cents
//    • Methods: void addCoins(int c); boolean tryPay(int c); int getCents()
//    • Main: tryPay more than you have; print result.
    int cents;

    public void addCoins(int c){
        cents+=c;
    }

    public boolean tryPay(int c){
        if (c > cents){
            return false;
        }
        cents-=c;
        return true;
    }

    public int getCents() {
        return cents;
    }

}
