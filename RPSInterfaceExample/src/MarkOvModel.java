public class MarkOvModel implements Player {
    int ps, pr, pp, rp, rs, rr, ss, sr, sp;
    int opponentMove;
    int yourMove;

    public void updateLastRoundInfo(int yourMove, int opponentMove, int outcome) {
        this.opponentMove = opponentMove;
        this.yourMove = yourMove;
        alltheifstate(yourMove);
    }

    public int getMove() {
        if (opponentMove == RPS.PAPER) {
            if (ps > pr && ps > pp) {
                return RPS.SCISSORS;
            } else if (pr > ps && pr > pp) {
                return RPS.ROCK;
            } else if (pp > ps && pp > pr) {
                return RPS.PAPER;
            }
        } else if (opponentMove == RPS.ROCK) {
            if (rp > rs && rp > rr) {
                return RPS.PAPER;
            } else if (rs > rp && rs > rr) {
                return RPS.SCISSORS;
            } else if (rr > rs && rr > rp) {
                return RPS.ROCK;
            }
        }else {
            if (ss>sr&&sr>sp){
                return RPS.SCISSORS;
            }else if (sr>ss&&sr>sp){
                return RPS.ROCK;
            }
        }
        return RPS.PAPER;
    }


    private void alltheifstate(int yourMove) {
        if (opponentMove == RPS.PAPER && yourMove == RPS.SCISSORS) {
            ps++;
        } else if (opponentMove == RPS.PAPER && yourMove == RPS.ROCK) {
            pr++;
        } else if (opponentMove == RPS.PAPER && yourMove == RPS.PAPER) {
            pp++;
        } else if (opponentMove == RPS.ROCK && yourMove == RPS.PAPER) {
            rp++;
        } else if (opponentMove == RPS.ROCK && yourMove == RPS.ROCK) {
            rr++;
        } else if (opponentMove == RPS.ROCK && yourMove == RPS.SCISSORS) {
            rs++;
        } else if (opponentMove == RPS.SCISSORS && yourMove == RPS.SCISSORS) {
            ss++;
        } else if (opponentMove == RPS.SCISSORS && yourMove == RPS.ROCK) {
            sr++;
        } else if (opponentMove == RPS.SCISSORS && yourMove == RPS.PAPER) {
            sp++;
        }
    }

}
