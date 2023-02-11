public class BeatByFrequency implements Player {
    int numOfRock, numOfScissors, numOfPaper;

    public void updateLastRoundInfo(int yourMove, int opponentMove, int outcome) {
       if (opponentMove==RPS.ROCK){
           numOfRock++;
       }else if (opponentMove==RPS.PAPER){
           numOfPaper++;
       }else {
           numOfScissors++;
       }
    }

    public int getMove() {
        int rand = (int) Math.random()*(numOfScissors+numOfPaper+numOfRock);
        if (rand<numOfRock){
            return RPS.PAPER;
        }else if (rand<numOfRock+numOfPaper){
            return RPS.SCISSORS;
        }else {
            return RPS.ROCK;
        }
    }
}
