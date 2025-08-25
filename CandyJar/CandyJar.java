package CandyJar;

public class CandyJar {
    int capacity;
    int count;
    int spaceleft;

    public void add(int n) {
        count = count + n;
        System.out.println(count +" out of " + capacity + "candies are left");
    }

    public void take(int n) {
        for (int i = 0; i < n; i++) {
            count -= 1;
        }
        spaceleft = capacity - count;
        System.out.println(count + " Candies are left " + spaceleft + " Is how much space is left");
    }
}
