import java.util.ArrayList;

public class PlayToBeatInfrequentPlays implements Player {
    int numOfRock, numOfScissors, numOfPaper;
    ArrayList<Integer> RPSList = new ArrayList<>();
    int count = 0;

    public void updateLastRoundInfo(int yourMove, int opponentMove, int outcome) {
        if (count == 10) count = 0;
        for (int i = 0; i < count; i++) {
            RPSList.add(opponentMove);
        }
    }

    public int getMove() {
        for (int i = 0; i < RPSList.size(); i++) {
            if (RPSList.get(i) == RPS.ROCK) {
                numOfRock++;
            } else if (RPSList.get(i) == RPS.PAPER) {
                numOfPaper++;
            } else {
                numOfScissors++;
            }
        }
        if (numOfScissors<numOfPaper&&numOfScissors<numOfRock){
            return RPS.ROCK;
        }else if (numOfRock<numOfPaper&&numOfRock<numOfScissors){
            return RPS.PAPER;
        } else{
            return RPS.SCISSORS;
        }

    }

}
