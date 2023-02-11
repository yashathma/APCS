package Wed4;

public class OneHundredStep {
    public static void main(String[] args) {
        double sum = 0;
        int total_trails = 100000;
        for (int i = 1; i < total_trails; i++) {
            double result = walk();
            sum = result + sum;
        }
        System.out.println(sum/total_trails);
    }

    private static double walk() {
        int x = 0;
        int y = 0;
        for (int i = 0; i < 100; i++) {
            int num = (int) (Math.random() * 4);
            if (num == 0) {
                x++;
            } else if (num == 1) {
                x--;
            } else if (num == 2) {
                y++;
            } else if (num == 3) {
                y--;
            }
        }
        return (Math.sqrt(((0 - x) * (0 - x)) + ((0 - y) * (0 - y))));

    }
}
