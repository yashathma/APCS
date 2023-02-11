package ProblemSet4;

public class Main {
    public static void main(String[] args) {
        Sphere s= new Sphere(3.3);
        Sphere s2=new Sphere(4);


        System.out.println(s);
        System.out.println(s2);
        System.out.println("Volume 1: "+s.volume());
        System.out.println("Volume 2: "+s2.volume());

        s.setRadius(10);
        System.out.println(s);
        System.out.println("new volume: "+s.volume());

        boolean answer= s.isLargerThan(s2);
        System.out.println("Is s larger?: "+answer);






    }




}
