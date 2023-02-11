
package Friday23;

import java.util.ArrayList;

public class ImplementaionPractice1 {
    public static void main(String[] args) {

        int[] list = {1, 2, 2, 3, 18, 30, 40};
        ArrayList newList = remove_duplicates1(list);
        for (int i = 0; i < 7; i++) {
            System.out.println(newList.get(i) + " ");
        }



    }

    private static ArrayList<Integer> remove_duplicates1(int[] input) {
        ArrayList<Integer> newList = new ArrayList<Integer>();
        for (int i = 0; i < input.length; i++) {
            if (input[i] != newList.get(i)) {
                newList.add(input[i]);
            }
        }


        return newList;
    }
}
