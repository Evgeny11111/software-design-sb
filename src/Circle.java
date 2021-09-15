import static java.lang.Math.pow;

public class Circle {
    private double radius;
    private final double PI = 3.141592;

    public Circle(){
        radius = 0;
    }
    public Circle(double rad){
        radius = rad;
    }
    public double getRadius(){
        return radius;
    }
    public double area(){
        return pow(radius,2)*PI;
    }
}
