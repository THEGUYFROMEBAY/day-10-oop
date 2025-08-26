package PrizeWheel;

public class Main {
    //      40  PrizeWheel
//    • Fields: String[] prizes; Random r
//    • Methods: String spin() returns a random prize; int indexOf(String p)
//    • Main: spin 5 times; print each prize.
    public static void main(String[] args) {

        PW pw = new PW();

        for (int i = 0; i < pw.prizes.length; i++){
            System.out.println(pw.spin());
            System.out.println(pw.indexOf("Candy"));
        }

    }

}
