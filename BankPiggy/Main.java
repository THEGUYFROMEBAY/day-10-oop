package BankPiggy;

public class Main {
    //     3   BankPiggy
//    • Fields: int cents
//    • Methods: void deposit(int amount); boolean withdraw(int amount) (only if enough, return true/false); int balance()
//    • Main: deposit, try to withdraw more than balance; print results.
    public static void main(String[] args) {
        BankPiggy bp = new BankPiggy();
        bp.balance = 100;
        bp.deposit = 100;
        System.out.println(bp.balance);
        bp.deposit(bp.deposit);
        System.out.println(bp.withdraw(100));
    }
}
