package November;

public class TwoDArray {
    public static void main(String[] args) {
        //problem 2a
//        int max=10;
//        int row = 2;
//        int column = 3;
//        int [] [] makeRandomArray = randomArraything(max,row,column);
//        System.out.println(makeRandomArray);
        //Problem 2b
//        String letters = "abc";
//        int row = 2;
//        int column = 3;
//        String [] [] makeStringArray = randomStringArraything(letters,row,column);
        //Problem 4
//        int row = 2;
//        int column = 2;
//        int [] [] checkerboard = CreateCheckerBoardArray(row,column);
        //Problem 5
//        int [] [] adder= {{1,1,1},
//                          {2,2,2},
//                          {3,3,3}};
//        printaddtion(adder);



    }

    private static void printaddtion(int[][] adder) {
        for (int i = 0; i < adder.length; i++) {
            int count = 0;
            for (int j = 0; j < 3; j++) {
                count=count+adder[i][j];
            }
            System.out.println("Row "+i+": "+count);
        }
    }

    private static int[][] CreateCheckerBoardArray(int row, int column) {
        int [] [] checkerboard = new int [row] [column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j=j+2) {
                checkerboard[i][j]=0;
                checkerboard[i][j+1]=1;
            }
        }
        return checkerboard;
    }

    private static String[][] randomStringArraything(String letters, int row, int column) {
        String[][] randomStringArray = new String[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                randomStringArray[i][j] = getrandletter(letters);
            }
        }
        return randomStringArray;
    }

    private static String getrandletter(String letters) {
        int rand = (int) ((Math.random() * letters.length()) + 1);
        return letters.substring(rand, rand + 1);
    }

    private static int[][] randomArraything(int max, int row, int column) {
        int[][] randomArray = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                randomArray[i][j] = (int) ((Math.random() * max) + 1);
            }
        }
        return randomArray;
    }
}
