public class Tower {
    public static void main(String[] args) {
        solve(7, 1, 3);
    }

    private static void solve(int n, int start, int target) {
        if (n == 1) {
            System.out.println(start + " to " + target);
        } else {
            int x = 6 - target - start;
            solve(n-1,start,x);
            System.out.println(start+" to "+target);
            solve(n-1,x,target);
        }
    }
}
