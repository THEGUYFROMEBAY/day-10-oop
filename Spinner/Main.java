package Spinner;

public class Main {
    //        25  Spinner
//    • Fields: int sides; Random r
//    • Methods: int spin() (1..sides)
//            • Main: create 5-sided and 8-sided spinners; spin each 5 times.
    public static void main(String[] args) {

        Spinner spinner = new Spinner();
        Spinner spinner2 = new Spinner();
        spinner.sides = 5;
        spinner2.sides = 8;
        for (int i = 0; i <= 5; i++) {
            System.out.println(spinner.spin());
            System.out.println(spinner2.spin());
        }

    }
}
