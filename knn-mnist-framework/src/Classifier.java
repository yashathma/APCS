import javax.xml.crypto.Data;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Classifier {
    private ArrayList<DataPoint> trainingData;
    private int k;

    public Classifier(int k) {
        this.k = k;
        trainingData = new ArrayList<DataPoint>();
    }

    public void addTrainingData(List<DataPoint> points) {
        trainingData.addAll(points);
        // TODO: add all points from input to the training data
    }

    public void addTrainingData(DataPoint point) {
        trainingData.add(point);
        // TODO: add all points from input to the training data
    }

    public String classify(double[] featureVector) {
        if (trainingData.size() == 0) return "no training data";

        double mindistance = Double.MAX_VALUE;
        ArrayList<DataPoint> closest = new ArrayList<>();


        for (DataPoint point : this.trainingData) {
            double distance = distance(featureVector, point.getData());

            if (closest.size() < k) {
                closest.add(point);
            } else {

                DataPoint furthastClosePoint = closest.get(closest.size() - 1);
                double furthastclosedistance = distance(featureVector, furthastClosePoint.getData());

                if (distance < furthastclosedistance) {
                    insertNewClosest(featureVector, distance, point, closest);
                }
            }
        }


        // TODO: write a k-nearest-neighbor classifier.  Return its prediction of "0" to "9"

        return majorityvotefrom(closest);  // replace this line
    }

    private String majorityvotefrom(ArrayList<DataPoint> closest) {
        int maxcount = 0;
        String majorityLabel = "";
        for (DataPoint p : closest) {
            String label = p.getLabel();
            int count = count(label, closest);
            if (count > maxcount) {
                maxcount = count;
                majorityLabel = p.getLabel();
            }
        }
        return majorityLabel;
    }

    private int count(String label, ArrayList<DataPoint> closest) {
        int counter = 0;
        for (DataPoint p : closest) {
            if (p.getLabel().equals(label)) counter++;

        }
        return counter;
    }

    private void insertNewClosest(double[] featureVector, double distance, DataPoint point, ArrayList<DataPoint> closest) {
        for (int i = 0; i < closest.size(); i++) {
            double closeDistance = distance(featureVector, closest.get(i).getData());
            if (distance < closeDistance) {
                closest.add(i, point);
                if (closest.size() > k) {
                    closest.remove(closest.size() - 1);
                }
                return;
            }
        }
    }

    public double distance(double[] d1, double[] d2) {
        // TODO:  Use the n-dimensional Euclidean distance formula to find the distance between d1 and d2
        if (d1.length != d2.length) {
            System.err.println("Computing distance between vector is not the same length");
            return 0;
        }
        double sumofsquareDiffs = 0;
        for (int i = 0; i < d1.length; i++) {
            double diff = d1[i] - d2[i];
            sumofsquareDiffs += diff * diff;
        }

        return sumofsquareDiffs;
    }

    public void test(List<DataPoint> test) {
        ArrayList<DataPoint> correct = new ArrayList<>();
        ArrayList<DataPoint> wrong = new ArrayList<>();

        int i = 0;
        for (DataPoint p : test) {
            String predict = classify(p.getData());
            System.out.print("#" + i + " REAL:\t" + p.getLabel() + " predicted:\t" + predict);
            if (predict.equals(p.getLabel())) {
                correct.add(p);
                System.out.print(" Correct ");
            } else {
                wrong.add(p);
                System.out.print(" WRONG ");
            }

            i++;
            System.out.println(" % correct: " + ((double) correct.size() / i));
        }

        System.out.println(correct.size() + " correct out of " + test.size());
        System.out.println(wrong.size() + " wrong out of " + test.size());
        System.out.println("% Error: " + (double) wrong.size() / test.size());
    }
}
