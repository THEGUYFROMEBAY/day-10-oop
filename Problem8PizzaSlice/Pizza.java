package Problem8PizzaSlice;

public class Pizza {
//     8   PizzaSlice
//    • Fields: int totalSlices; int eaten
//    • Methods: boolean eat(int n) (not beyond total); int left(); void addSlice()
//    • Main: eat slices; print left.

    int totalSlices, eaten, left;

    public boolean eat(int n){
        if (n > totalSlices){
            return false;
        }
        for (int i = 0; i < n; i++){
            totalSlices--;
        }
        eaten = n;
        left = totalSlices - eaten;
        System.out.println(left);
        return true;
    }

    public void addSlice(){
        eaten = eaten + left - totalSlices;
        left = totalSlices;
        System.out.println(eaten + " is How Many Slices eaten " + left + " is how many slices are left " + totalSlices + "Is how many slices there are in total");
    }
}
