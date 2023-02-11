import java.util.ArrayList;
import ProblemSet4.Point;

public class Path {

    private ArrayList<Point> points;

    public Path() {
        points = new ArrayList<Point>();
    }


    public static double getLength(ArrayList<Point> points) {
        double length = 0;

        for (int i = 0; i < points.size() - 1; i++) {
            Point p1 = points.get(i);
            Point p2 = points.get(i + 1);

        }

        return length;
    }
}







