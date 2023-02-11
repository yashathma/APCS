package September.Friday6;

public class Monte_Carlo_Problem5 {
    public static void main(String[] args) {
        int money = 50;
        int count = 0;
        int runtimes=100;
        while (money > 0 && money < 250) {
            money = gamble(money);
            count++;
        }
        if (money == 0) {
            System.out.println("It took " + count + " times to reach 0");
        } else if (money == 250) {
            System.out.println("It took " + count + " times to reach 250");
        }

    }

    private static int gamble(int money) {
        return (Math.random() > 0.5) ? money+1 : money - 1;
    }
}
