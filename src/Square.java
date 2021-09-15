import static java.lang.Math.pow;

public class Square {
    private double side;

    public Square(){
        side = 0;
    }
    public Square(double s){
        side = s;
    }
    public double getSide(){
        return side;
    }
    public double area(){
        return pow(side,2);
    }
}
