package ProblemSet4;

public class Sphere {

    private double radius;

    public Sphere(double r){
            radius=r;
    }
    public double getRadius() {
        return this.radius;

    }

    public void setRadius(double newRad){
     this.radius = newRad;
    }


    public String toString(){
        return "Your circle has radius "+radius;
    }

    public double volume(){
        return  (4.0/3)*Math.PI*radius*radius*radius;
    }

    public boolean isLargerThan(Sphere other){
        return this.volume()>other.volume();

    }





}
