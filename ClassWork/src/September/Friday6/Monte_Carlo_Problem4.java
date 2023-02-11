package September.Friday6;

public class Monte_Carlo_Problem4 {
    public static void main(String[] args) {
        double sum = 0;
        double total_trails = 100;
        int walkamount=100;
        for (int i = 1; i <= total_trails; i++) {
            double result = walk(walkamount);
            sum = result + sum;
            System.out.println( "Trial "+ i +":     "+(sum/ total_trails)*100+"%");
        }

    }

    private static double walk(int walkamount) {
        int x = 0;
        int y = 0;
        int z = 0;
        int count=0;
        for (int i = 0; i < walkamount; i++) {
            int num = (int) (Math.random() * 6);
            if (num == 0) {
                x++;
            } else if (num == 1) {
                x--;
            } else if (num == 2) {
                y++;
            } else if (num == 3) {
                y--;
            } else if (num == 4) {
                z++;
            } else if (num == 5) {
                z--;
            }


            if (x==0){
                if (z==0){
                    if (y==0){
                        count++;
                    }
                }
            }
        }

        return (count);

    }
}
