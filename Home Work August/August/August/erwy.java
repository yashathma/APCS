package August;

public class erwy {
    public static void main(String[] args) {
           /*
        int input=123;
        System.out.println(onlyOddDigits(input));
         */
        System.out.println("Hello World");
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

