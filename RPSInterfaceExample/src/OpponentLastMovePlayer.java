public class OpponentLastMovePlayer implements Player{
int opponentMove;
    public void updateLastRoundInfo(int yourMove, int opponentMove, int outcome) {
        this.opponentMove=opponentMove;
    }
    public int getMove() {
        return opponentMove;
    }
}
