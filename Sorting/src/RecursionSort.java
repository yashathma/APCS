public class RecursionSort {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.println(indexOf(7,arr,0,arr.length-1));
    }

    private static int indexOf(int target, int[] arr, int start, int end) {
        int mid = (start+end)/2;
        if (target == arr[mid]) return mid;
        if (start > end) {
            return -1;
        }

        if (arr[mid]>target){
           return indexOf(target,arr,start,mid-1);
        } else {
           return indexOf(target, arr, mid+1, end);
        }
    }
}
