package August;

public class Monday23 {
    public static void main(String[] args) {
        //Problem 1
           /*
          int arr[]={6,-0,9,-0,    1,-2,3       , 1,-5,-2};
           System.out.println(testParity(arr));
          */

        //Problem 2
            /*
            int arr[]= {0,1,2,3,4,5,6,7,8,9,10,11,12,1000,14,100};
            int sum=specialArraySum(arr);
            System.out.println(sum);
             */
        //Problem 3

             int arr[] = {1, 2, 3, 0, 0, 0, 0, 1, 2, 3,0};
             int targetamount = 4;
             System.out.println(matchingEnds(arr, targetamount));

    }

    private static boolean testParity(int[] arr) {
        for (int i = 0; i < arr.length-2; i++) {
            if (arr[i]>0&&arr[i+1]>0&&arr[i+2]>0){
                return true;
            }else if (arr[i]<0&&arr[i+1]<0&&arr[i+2]<0){
                return true;
            }
        }
        return false;
    }

    private static boolean matchingEnds(int[] arr, int targetamount) {
        int firstarr[] = new int[targetamount];
        int secondarr[] = new int[targetamount];
        for (int i = 0; i < targetamount; i++) {
            firstarr[i] = arr[i];
        }
        int count = 0;
        for (int i = (arr.length - targetamount); i < arr.length; i++) {
            secondarr[count] = arr[i];
            count++;
        }
        for (int i = 0; i < targetamount; i++) {
            if (firstarr[i] != secondarr[i]) {
                return false;
            }
        }
        return true;
    }

    private static int specialArraySum(int[] arr) {
        int sum = 0;
        if (arr.length < 13) {
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
            }
            return sum;
        } else if (arr.length == 13) {
            for (int i = 0; i < 12; i++) {
                sum = sum + arr[i];
            }
            return sum;
        } else {
            for (int i = 0; i < 13; i++) {
                sum = sum + arr[i];
            }
            for (int i = 14; i < arr.length; i++) {
                sum = sum + arr[i];
            }
            return sum;
        }
    }
}


