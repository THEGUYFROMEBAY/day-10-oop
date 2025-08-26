package CounterWithLimit;

public class CWL {
//     52  CounterWithLimit
//    • Fields: int value; int min; int max
//    • Methods: void up(); void down(); void clamp(); boolean atEdge()
//    • Main: walk up/down; print.
    int value, min, max;

    public void up(){
        value++;
        System.out.println(value);
    }

    public void down(){
        value--;
        System.out.println(value);
    }

    public void clamp(){
        if(value < min){
            value = min;
            System.out.println(value);
        } else if (value > max){
            value = max;
            System.out.println(value);
        }
    }

    public boolean atEdge(){
        if (value == min || value == max){
            return true;
        } return false;
    }
}
