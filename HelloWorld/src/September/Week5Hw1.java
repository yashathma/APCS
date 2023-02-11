package September;

public class Week5Hw1 {
    public static void main(String[] args) {
        //Problem1
        /*
        String input = "Hi";
        String duble = duble(input);
        System.out.println(duble);
         */

        //Problem2
        /*
        String input[] = {"hi", "hi"};
        String tagret = "hi";
        int amount = count(input, tagret);
        System.out.println(amount);
         */

        //Problem3
        /*
        String input = "catdog";
        boolean catdog = catdog(input);
        System.out.println(catdog);
         */

        //Problem4
        /*
        String input = "hello";
        int N = 3;
        String output = repeatLastN(input,N);
        System.out.println(output);
         */

        //Problem5
        /*
        String one = "maxim";
        String two = "bob";
        String three = combine(one, two);
        System.out.println(three);
         å*/


    }

    private static String combine(String one, String two) {
        String combine = "";
        combine = combine + one.substring(1);
        for (int i = 1; i < two.length() - 1; i++) {
            combine = combine + two.substring(i);
        }
        combine = combine + one.substring(one.length());
        return combine;
    }

    private static String repeatLastN(String input, int n) {
        String output = "";
        for (int i = 0; i < n; i++) {
            for (int j = input.length() - n; j < input.length(); j++) {
                output = output + input.substring(j);

            }
        }
        return output;

    }

    private static boolean catdog(String input) {
        int cat = 0;
        int dog = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.substring(i).equals("c") && input.substring(i + 1).equals("a") && input.substring(i + 2).equals("t")) {
                cat++;
            } else if (input.substring(i).equals("d") && input.substring(i + 1).equals("o") && input.substring(i + 2).equals("g")) {
                dog++;
            }
        }
        if (cat == dog) {
            return true;
        } else {
            return false;
        }
    }

    private static int count(String[] input, String tagret) {
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i].contains(tagret)) {
                count++;
            }
        }
        return count;
    }

    private static String duble(String input) {
        String more = "";
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < 2; j++) {
                more = more + input.substring(i);
            }
        }
        return more;
    }
}
