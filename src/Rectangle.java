public class Rectangle {
    private double height;
    private double length;

    public Rectangle(){
        height = 0;
        length = 0;
    }
    public Rectangle(double h,double l){
        height = h;
        length = l;
    }
    public double getHeight(){
        return height;
    }
    public double getLength(){
        return length;
    }
    public double area(){
        return height * length;
    }
}
