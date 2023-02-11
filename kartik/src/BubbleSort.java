public class BubbleSort extends Sorter{
    public  void sort(int[] arr) {
        if (arr == null || arr.length < 2) return;

        int temp;
        int length = arr.length;
        boolean flip = true;

        while (flip) {
            flip = false;
            for (int j = 1; j < length - 1; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    flip = true;
                }

            }
            length--;
        }

    }




    public String getName(){
        return "Bubble Sort";
    }
}
