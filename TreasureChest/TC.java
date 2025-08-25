package TreasureChest;

public class TC {
//     27  TreasureChest
//    • Fields: int coins; boolean locked
//    • Methods: void lock(); void unlock(); void addCoins(int n); int takeAll()
//    • Main: unlock, add, lock, try to take (should only allow when unlocked).
    int coins;
    boolean locked;

    public void lock(){
        locked = true;
    }

    public void unlock(){
        locked = false;
    }

    public void addCoins(int n){
        if (!locked){
            coins += n;
        }
        System.out.println("Please Unlock The chest then you can interact with it");
    }

    public int takeAll(){
        if (!locked){
            coins = 0;
            return coins;
        } System.out.println("Please Unlock The chest then you can interact with it");
        return -1;// they cant see how many coins because its locked
    }
}
