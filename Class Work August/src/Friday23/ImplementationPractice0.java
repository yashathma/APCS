package Friday23;

public class ImplementationPractice0 {
    public static void main(String[] args) {

        int[] list = {1, 2, 3, 16, 18, 30, 40};
        int target = 10;
        int result = findClosest(list, target);
        System.out.println(result);


    }

    private static int findClosest(int[] input, int target) {

        int closest = input[0];
        for (int i = 1; i < input.length; i++) {
            if (distance(input[i], target) < distance(closest, target)) {
                input[i] = closest;
            }
        }
        return closest;

    }

    private static int distance(int first, int second) {
        return Math.abs(first - second);
    }
}

