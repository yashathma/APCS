package November;

public class TwoDArrayTwo {
    public static void main(String[] args) {
        //Problem 13
//        int[][] array = {{30, 50, 70}, {10, 10, 100}, {30, 30, 70}};
//        int count = numHeavyRegions(array);
//        System.out.println(count);

        //Problem 14
//        int[][] array = {{30, 50, 70}, {10, 10, 10, 100}, {30, 30, 70}};
//        int count = peSumrim(array);
//        System.out.println(count);

        //Problem 17
        //Metod bellow
    }

    private static int peSumrim(int[][] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count = count + array[i][0];
            count = count + array[i][array[i].length];
        }
        return count;
    }

    private static int numHeavyRegions(int[][] array) {
        int mainCount = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array[i].length; j++) {
                count = count + array[i][j];
            }
            if (count > 100) {
                mainCount++;
            }
        }
        return mainCount;
    }

//    public int getMatchesFrom(int row, int column) {
//        //Problem 17 A
//        int count = 0;
//        for (int i = 0; i < 4; i++) {
//            if ((row,column).getLeft == (row, column - 1).getRight){
//                count++;
//            } else if ((row,column).getRight == (row, column + 1).getLeft)){
//                count++
//            } else if ((row,column).getTop == ((row - 1, column).getBottom)){
//                count++;
//            } else if ((row,column).getBottom == ((row + 1, column).getTop)){
//                count++;
//                roate();
//            }
//        }
//        return count;
//    }
//
//    public int GetMatches() {
//        //Problem 17 B
//        int count = 0;
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < column; j++) {
//                count=count+getMatchesFrom(i,j);
//            }
//        }
//        return count;
//    }
}
