package September;

public class W3HW {
    public static void main(String[] args) {
        //Problem 1
        /*
        int input=11223;
        System.out.println(onlyOddDigits(input));
         */
        //Problem 2
        
        //Problem 3
        /*
        int input=1634;
        System.out.println(isNarcissistic(input));
         */
        //Problem 4
        /*
        int input[] = {0, 5, 8, 3};
        int newarr[]= replaceZeros(input);
        printarr(newarr);
         */
    }

    private static boolean isNarcissistic(int input) {
        double total=0;
        while (input > 0) {
            int diget = input % 10;
            input = input / 10;
            total=(total+Math.pow(diget,amountofdigets(input)));
        }
        if (total==input){
            return true;
        }else{
            return false;
        }

    }

    private static int amountofdigets(int input) {
        int count=0;
        while (input > 0) {
            input = input / 10;
            count++;
        }
        return count;

    }

    private static int[] replaceZeros(int[] input) {
        int maxval=findmaxVal(input);
        for (int i = 0; i < input.length; i++) {
            if (input[i]==0){
                input[i]=maxval;
            }
        }
        return input;
    }

    private static int findmaxVal(int[] input) {
        int maxval=input[0];
        for (int i = 1; i < input.length; i++) {
            if (input[i]>maxval){
                maxval=input[i];
            }
        }
        return maxval;
    }


    private static void printarr(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }
    }

    private static boolean onlyOddDigits(int input) {
        while (input > 0) {
            int diget = input % 10;
            input = input / 10;
            if (diget % 2 == 0) {
                return false;
            }

        }
        return true;
    }
}

