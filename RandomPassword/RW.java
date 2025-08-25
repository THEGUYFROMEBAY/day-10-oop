package RandomPassword;

import java.util.Random;

public class RW {
//        24  RandomPassword
//    • Fields: String lastPwd; Random r
//    • Methods: String makeLetters(int len) (lowercase letters only)
//            • Main: make 3 passwords lengths 6–8; print.
    String lastPwd;
    Random r = new Random();
    StringBuilder sb = new StringBuilder();

    public String makeLetters(int len){
        for (int i = 0; i < len; i++) {
            sb.append((char) ('a' + r.nextInt(26)));
        }
        lastPwd = sb.toString();
        return lastPwd;
    }
// ChatGPT did not write code for me I did research by myself about string builder and i thought it would be easier then reassing the same string 50 times
}
