package RockPaperScissors;

import java.util.Random;

public class RPS {
//22  RockPaperScissors
//    • Fields: String last; Random r
//    • Methods: String cpuMove(); int result(String player) (1 win, 0 draw, -1 lose)
//            • Main: play 10 rounds with random player moves; print results.
    Random rand = new Random();

    String last;

    public String cpuMove(){
        String[] option = new String[]{"rock", "paper", "scissors"};
        last = option[rand.nextInt(option.length)];
        return last;
    }

    public int result(String player){
        player = player.toLowerCase();
            if(player.equals("rock")){
                switch(last){
                    case "rock": return 0;
                    case "paper": return -1;
                    case "scissors": return 1;
                }
            } else if (player.equals("paper")){
                switch(last){
                    case "rock": return 1;
                    case "paper": return 0;
                    case "scissors": return -1;
                }
            } else if (player.equals("scissors")){
                switch(last){
                    case "rock": return -1;
                    case "paper": return 1;
                    case "scissors": return 0;
                }
            }
            return 322;
    }

}
