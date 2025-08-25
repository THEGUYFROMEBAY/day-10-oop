package TreasureChest;

public class Main {
    //     27  TreasureChest
//    • Fields: int coins; boolean locked
//    • Methods: void lock(); void unlock(); void addCoins(int n); int takeAll()
//    • Main: unlock, add, lock, try to take (should only allow when unlocked).
    public static void main(String[] args) {

        TC tc = new TC();
        tc.unlock();
        System.out.println(tc.takeAll());
        tc.addCoins(435);
        tc.lock();
        System.out.println(tc.takeAll());
        tc.addCoins(435);

    }
}
