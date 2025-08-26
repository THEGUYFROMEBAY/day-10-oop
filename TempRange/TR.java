package TempRange;

public class TR {
//        53  TempRange
//    • Fields: int low; int high
//    • Methods: boolean contains(int t); int width()
//    • Main: test a few temps.
    int low, high;

    public boolean contains(int t){
        if (t < low && t > high)
            return false;
        else return true;
    }

    public int width(){
        return high - low;
    }

}
