package September.Friday6;

public class Monte_Carlo_Problem6 {
    public static void main(String[] args) {

        double amountoftrials = 10000;
        double averagekids=avgChildren(amountoftrials);
        System.out.println("About "+averagekids+" kids");
    }

    private static double avgChildren(double amountoftrials) {
        double count = 0;
        for (int i = 0; i < amountoftrials; i++) {
            int boy = 0;
            int girl = 0;
            while (boy == 0 || girl == 0) {
              if((Math.random() > 0.5)){
                  boy++;
              }else{
                  girl++;
              }

                count++;
            }
        }
        return count / amountoftrials;
    }
}
