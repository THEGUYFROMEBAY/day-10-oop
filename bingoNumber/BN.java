package bingoNumber;

public class BN {
//    38  BingoNumber
//    • Fields: int number (1..75)
//    • Methods: String column() (B 1..15, I 16..30, N 31..45, G 46..60, O 61..75)
//            • Main: make numbers and print "B12" style text.
    int number;

    public String column(){

        if (number >= 1 && number <= 15) {
            return "B" + number;
        } else if (number >= 16 && number <= 30) {
            return "I" + number;
        } else if (number >= 31 && number <= 45) {
            return "N" + number;
        } else if  (number >= 46 && number <= 60) {
            return "G" + number;
        } else if (number >= 61 && number <= 75) {
            return "O" + number ;
        } return "error";

    }

}
