package Friday30;

public class BruteForceProblem4 {
    public static void main(String[] args) {
        int input=24;
        System.out.println(isAbundant(input));
    }

    private static boolean isAbundant(int input) {
        int sum=0;
        for (int i = 1; i <input ; i++) {
            if (input%i==0){
                sum=sum+i;
            }
        }
        if(sum>=input){
            return true;
        }else {
            return false;
        }
    }
}
