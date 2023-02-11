public class InsertionSort extends Sorter {

    public void sort(int []arr){
        if (arr == null || arr.length < 2) return;

        int temp = 0;
        for (int curr = 1; curr < arr.length; curr++) {
            int loc = curr;
            while (loc != 0 && arr[loc] < arr[loc - 1]) {
                temp = arr[loc - 1];
                arr[loc - 1] = arr[loc];
                arr[loc] = temp;
                loc--;
            }

        }

    }

    public String getName(){
        return "Insertion Sort";
    }

}
