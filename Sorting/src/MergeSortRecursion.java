import java.lang.reflect.Array;
import java.util.ArrayList;

public class MergeSortRecursion {
    public static void main(String[] args) {
        int arr[] = {1, 10, 2, 9, 3, 8, 4, 7, 5, 6};
        MergSort(arr, 0, arr.length - 1);
        System.out.println(arr);
    }

    private static void MergSort(int[] arr, int start, int end) {
        if (end==start) return;
        int mid = (end + start) /2;
        MergSort(arr, start, mid);
        MergSort(arr,mid+1,end);
        Merge(arr,start,mid,mid+1,end);

    }

    private static void Merge(int[] arr, int s1, int e1, int s2, int e2) {
        int[] temp = new int[arr.length];
        int leftIndex = s1;
        int rightIndex = s2;
        int nextloc = s1;

        while (leftIndex <= e1 && rightIndex<= e2){
            if (arr[leftIndex]<arr[rightIndex]){
                temp[nextloc]=arr[leftIndex];
                leftIndex++;
            } else {
                temp[nextloc]=arr[rightIndex];
                rightIndex++;
            }
            nextloc++;
        }
        if (leftIndex<=e1){
            for (int i = leftIndex; i < e1; i++) {
                temp[nextloc]=arr[leftIndex];
                nextloc++;
            }
        }
        if (rightIndex<=e2){
            for (int i = rightIndex; i < e2; i++) {
                temp[nextloc]=arr[rightIndex];
                nextloc++;

            }
        }

    }


}
