public class Random {
    public static void main(String[] args) {
        /*
        Random Yash = new Random("Athma",10,15);
        System.out.println("Now");
        System.out.println(Yash.getName());
        System.out.println(Yash.getGrade());
        System.out.println(Yash.getMyage());
        System.out.println();
        Random olderYash;
        olderYash = Yash.oneYearHasPassed();
        System.out.println("After 1 year");
        System.out.println(olderYash.getName());
        System.out.println(olderYash.getGrade());
        System.out.println(olderYash.getMyage());
        System.out.println();
        System.out.println("After 2 years");
        Random evenOlderyash;
        evenOlderyash=olderYash.oneYearHasPassed();
        System.out.println(evenOlderyash.getName());
        System.out.println(evenOlderyash.getGrade());
        System.out.println(evenOlderyash.getMyage());
         */
        int trials = 10000;
        double prob = getProb(trials);
        System.out.println(prob);



    }

    private static double getProb(int trials) {
        double count = 0;
        for (int i = 0; i < trials; i++) {
            int a = (int) (Math.random() * 10) + 1;
            int b = (int) (Math.random() * 10) + 1;
            if (a + b == 10) {
                count++;
            }


        }
        return (count / trials) * 100;

    }


    private String Lastname;
    private int mygrade;
    private int myage;

    Random(String name, int grade, int age) {
        this.Lastname = name;
        this.mygrade = grade;
        this.myage = age;
    }

    public String getName() {
        return Lastname;
    }

    public void setName(String name) {
        this.Lastname = name;
    }

    public int getGrade() {
        return mygrade;
    }

    public void setGrade(int grade) {
        this.mygrade = grade;
    }

    public int getMyage() {
        return myage;
    }

    public Random oneYearHasPassed() {
        Random newYash = new Random(Lastname, mygrade + 1, myage + 1);
        return newYash;

    }


    public void setMyage(int Originalage) {
        this.myage = Originalage;
    }

}



