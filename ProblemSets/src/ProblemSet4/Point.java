package ProblemSet4;

public class Point {
    private double x,y;
    public Point (double x,double y){
        this.x=x;
        this.y=y;
    }
    public void setX(double newX){
        this.x=newX;
    }
    public void setY(double newY){
        this.y=newY;
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
}
