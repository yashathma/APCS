package Wednesday28;

public class CirclePointThing {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.println("R: "+i+" LP: "+howManyLAtticePointsInCircle(i));
        }
    }

    private static int howManyLAtticePointsInCircle(int radius) {
        int num_of_points=0;
        for (int x = -radius; x <= radius; x++) {
            for (int y = -radius; y <= radius; y++) {
                if(distance(x,y)<=radius){
                    num_of_points++;
                }
            }
        }
        return num_of_points;

    }

    private static double distance(int i, int j) {
        return Math.sqrt(i*i+j*j);
    }
}
