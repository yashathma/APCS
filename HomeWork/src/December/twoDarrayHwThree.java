package December;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class twoDarrayHwThree {
    public static void main(String[] args) {
        //Problem 1
//        int [][] arr = {{1,1,1},
//                        {1,1,1},
//                        {1,1,1}};
//        int diagSum = diagonalSum(arr);
        //Problem 2
        //Method
        //Problem 3
        int[][] arr = {{1, 1, 1},
                {1, 2, 2},
                {1, 2, 2}};
        int row = 1;
        int col = 1;
        findLowerRight(row, col, arr);

    }

    private static void findLowerRight(int row, int col, int[][] arr) {
        for (int i = row; i < arr.length; i++) {
            for (int j = col; j < arr[0].length; j++) {
                if (arr[i][j]!=arr[row][col]&&arr[i+1][j]!=arr[row][col]){
                    System.out.println("("+i+","+j+")");
                }
            }
        }
    }

    public ArrayList<Point> getValues(int[][] arr) {
        //   Point point = new Point(int row;int column;int value);
        ArrayList<Point> end = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] != 0) {
                    //              end.add(new Point(i,j,arr[i][j]);
                }
            }
        }
        return end;
    }

    private static int diagonalSum(int[][] arr) {
        int sum = 0;
        if (arr.length != arr[0].length) {
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        for (int i = arr.length - 1; i < 0; i++) {
            sum += arr[i][i];
        }
        return sum * 2;
    }
}
