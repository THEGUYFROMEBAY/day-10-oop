package CandyJar;

public class Main {
    //      1   CandyJar
//    • Class: CandyJar
//    • Fields: int capacity; int count
//    • Methods: void fill() → count=capacity; void add(int n) (cap at capacity); void take(int n) (not below 0); int spaceLeft()
    public static void main(String[] args) {
        CandyJar candyJar = new CandyJar();
        candyJar.count = 6;
        candyJar.capacity = 12;
        candyJar.take(3);
        candyJar.add(4);

    }
}
