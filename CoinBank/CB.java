package CoinBank;

public class CB {
//     37  CoinBank
//    • Fields: int heads; int tails
//    • Methods: void record(String flip); int total(); String moreCommon()
//    • Main: record sequence {"H","T","H","H"}; print counts & winner.
    int head, tails;

    public void record(String flip){
        flip.toUpperCase();
        char[] arr = flip.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'H') {
                head++;
            } else tails++;
        } flip = new String(arr);
        System.out.println(flip);

    }

    public int total(){
        System.out.println(head);
        System.out.println(tails);
        return head + tails;
    }

    public String moreCommon(){
        if (head > tails) {
            return "heads";
        } else if (head == tails) {
            return "They are equal";
        } else{
            return "tails";
        }
    }

}
