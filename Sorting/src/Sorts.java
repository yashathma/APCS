public class Sorts {

    public static void main(String[] args) {
        int[] arr = {4, 6, 4, 2, 5, 8};
        insertionSort(arr);
        selectionSort(arr);
        printarr(arr);
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            checkupwards(arr, i);
        }
    }

    private static void checkupwards(int[] arr, int i) {
        int minIndex = i;
        for (int j = i; j < arr.length; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        selectionSwap(arr, i, minIndex);
    }

    private static void selectionSwap(int[] arr, int i, int minIndex) {
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }

    private static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            checkbackwards(arr, i);
        }
    }

    private static void checkbackwards(int[] arr, int i) {
        for (int j = i; j > 0; j--) {
            if (arr[j] < arr[j - 1]) {
                Insertionswap(arr, j);
            }
        }
    }

    private static void Insertionswap(int[] arr, int index) {
        int temp = arr[index];
        arr[index] = arr[index - 1];
        arr[index - 1] = temp;
    }
}
