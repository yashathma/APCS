public class Search {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 18, 100};
        int target = 1;
        boolean hasTargetNum = FiftyFiftySearch(arr, target);
        System.out.println(hasTargetNum);

    }



    private static boolean FiftyFiftySearch(int[] arr, int targ) {
        int max = arr.length;
        int min = 0;
        while (min <= max) {
            int mid = (max + min) / 2;
            if (arr[mid] < targ) {
                min = mid;
            } else if (arr[mid] > targ) {
                max = mid;
            } else {
                return true;
            }
        }
        return false;
    }
}
