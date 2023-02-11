package September.Friday6;

public class Monte_Carlo_Problem7 {
    public static void main(String[] args) {

        double amountoftrials = 100;
        double count = 0;

        for (int i = 0; i < amountoftrials; i++) {


            double stick = 1;
            double randBreak1 = Math.random();
            double randBreak2 = Math.random();

            double side1 = stick - randBreak1;
            stick = randBreak1;
            double side3 = (Math.random() * stick);
            double side2 = stick - side3;

            side1 = side1;
            side2 = side2;
            side3 = side3;

            if (side1 + side2 < side3) {
                count++;
            }

        }
        System.out.println((count / amountoftrials) * 100 + "%");
    }
}