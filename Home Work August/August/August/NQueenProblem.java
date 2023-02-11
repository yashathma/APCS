package August;

public class NQueenProblem {
    static int[][] Chessboard;
    static int amount_of_queens;


    public static void main(String[] args) {
        //Setting the amount of queens as the amount of rows and stuff because it wont work if
        // the amount of rows is less than the number of queens
        amount_of_queens = 8;
        Chessboard = new int[amount_of_queens][amount_of_queens];
        for (int i = 0; i < amount_of_queens; i++)
            for (int j = 0; j < amount_of_queens; j++)
                Chessboard[i][j] = 0;
        if (solveProblem(0)) {
            printBoard();
        } else {
            System.out.println(" There is no Solution");
        }
        System.out.println();
    }

    static boolean solveProblem(int column) {
        if (column > amount_of_queens - 1)
            return true;
        for (int i = 0; i < amount_of_queens; i++) {
            if (isSafe(i, column)) {
                Chessboard[i][column] = 1;
                if (solveProblem(column + 1))
                    return true;
                Chessboard[i][column] = 0;
            }
        }
        return false;
    }

    static boolean isSafe(int row, int col) {
        int i, j;
        for (i = 0; i < col; i++)
            if (Chessboard[row][i] == 1)
                return false;
        for (i = row, j = col; (i >= 0) && (j >= 0); i--, j--)
            if (Chessboard[i][j] == 1)
                return false;
        for (i = row, j = col; (j >= 0) && (i < amount_of_queens); i++, j--)
            if (Chessboard[i][j] == 1)
                return false;
        return true;
    }

    static void printBoard() {
        for (int i = 0; i < amount_of_queens; i++) {
            System.out.print("\n");
            for (int j = 0; j < amount_of_queens; j++) {
                System.out.print(Chessboard[i][j]+" ");
            }
        }
    }
}