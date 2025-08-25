package RandomPassword;

public class Main {
    //        24  RandomPassword
//    • Fields: String lastPwd; Random r
//    • Methods: String makeLetters(int len) (lowercase letters only)
//            • Main: make 3 passwords lengths 6–8; print.
    public static void main(String[] args) {

        RW rw = new RW();
        System.out.println(rw.makeLetters(500));

    }
}
