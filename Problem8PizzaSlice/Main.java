package Problem8PizzaSlice;

public class Main {
    //     8   PizzaSlice
//    • Fields: int totalSlices; int eaten
//    • Methods: boolean eat(int n) (not beyond total); int left(); void addSlice()
//    • Main: eat slices; print left.
    public static void main(String[] args) {

        Pizza pizza = new Pizza();
        pizza.totalSlices = 6;
        pizza.eaten = 0;
        pizza.left = 0;
        System.out.println(pizza.eat(3));
        pizza.addSlice();
    }
}
