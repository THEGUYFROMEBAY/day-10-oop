package Problem5Dice;

public class Main {
    //        5   Dice
//    • Fields: int face (1–6); Random r
//    • Methods: int roll() (updates face and returns it)
//            • Main: roll 10 times; print each roll.
    public static void main(String[] args) {

        Dice dice = new Dice();
        dice.face = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println(dice.roll());
        }

    }
}
