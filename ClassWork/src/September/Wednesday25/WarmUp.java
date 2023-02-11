package September.Wednesday25;

public class WarmUp {
    public static void main(String[] args) {
        String one = "abcb";
        String two = "abcb";
        int sameend = sameEnd(one, two);
        System.out.println(sameend);
    }

    private static int sameEnd(String one, String two) {
        int count = 0;
        int top;
        if (one.length() > two.length()) {
            top = two.length();
        } else {
            top = one.length();
        }
        for (int i = top; i >= 0; i--) {
            if (!one.substring(one.length()).equals(two.substring(two.length()))) {
                break;
            }
            if (one.substring(i).equals(two.substring(i))) {
                count++;
            }
        }
        if (count > 0) {
            count--;
        }

        return count;
    }
}
