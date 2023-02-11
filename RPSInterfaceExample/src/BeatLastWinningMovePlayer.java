public class BeatLastWinningMovePlayer implements Player {
    int opponentMove;

    public void updateLastRoundInfo(int yourMove, int opponentMove, int outcome) {
        this.opponentMove = opponentMove;
    }

    public int getMove() {
        if (opponentMove == RPS.ROCK) {
            return RPS.PAPER;
        } else if (opponentMove == RPS.PAPER) {
            return RPS.SCISSORS;
        } else return RPS.ROCK;
    }
}
