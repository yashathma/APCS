import ProblemSet4.Point;

import java.nio.file.Path;
import java.util.ArrayList;

public class MainTwo {
    public static void main(String[] args) {

        ArrayList<Point> points = new ArrayList<Point>();
        points.add(new Point(0,0));
        points.add(new Point(0,10));
        points.add(new Point(10,10));
        points.add(new Point(10,0));
        points.add(new Point(0,0));

        System.out.println("Length of paths is: " + lengthOfPath(points));
    }


    public static double lengthOfPath(ArrayList<Point> points) {
        double length = 0;

        for (int i = 0; i < points.size() - 1; i++) {
            Point p1 = points.get(i);
            Point p2 = points.get(i + 1);


        }

        return length;
    }
}
