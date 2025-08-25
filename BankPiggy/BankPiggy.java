package BankPiggy;

public class BankPiggy {
//     3   BankPiggy
//    • Fields: int cents
//    • Methods: void deposit(int amount); boolean withdraw(int amount) (only if enough, return true/false); int balance()
//    • Main: deposit, try to withdraw more than balance; print results.

    int balance;
    int deposit;

    public void deposit(int amount) {
        for (int i = amount; i >= 1; i--) {
            balance = balance + 1;
        }
        System.out.println("Deposited " + deposit + " cents");
        System.out.println("Balance: " + balance);
    }

    public boolean withdraw(int amount) {
        if (amount <= balance) {
            return true;
        } return false;
    }
}
