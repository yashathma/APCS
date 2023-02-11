package Febuary;

public class RecursionHW1 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("axba"));
        int[]arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println(minVal(arr,0));
    }

    private static int minVal(int[] arr, int i) {
        int max =arr[i];
        if (i==arr.length-1) return max;
        if (i>=1&&arr[i]>max){
            return max;
        }
        return minVal(arr,i);



    }

    private static boolean isPalindrome(String str) {
        if (str.equals("")) return true;
        if (str.substring(0,1).equals(str.substring(str.length()-1))) {
            str = str.substring(1);
            str = str.substring(0, str.length() - 1);
            return isPalindrome(str);

        }
        return false;


    }
}
