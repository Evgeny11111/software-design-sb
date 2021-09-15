
public class Program {
    public static void main(String[] args){
        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(20);
        Circle circle3 = new Circle(15);
        Rectangle rectangle1 = new Rectangle(50,25);
        Rectangle rectangle2 = new Rectangle(-15,25);
        Rectangle rectangle3 = new Rectangle(10,-15);
        Square square1 = new Square(10);
        Square square2 = new Square(-15);
        Square square3 = new Square(17);
        finOutptCirc(circle1, "Radius of circle1 is less than zero!", "radius of circle1 = ");
        finOutptCirc(circle2, "Radius of circle2 is less than zero!", "radius of circle2 = ");
        finOutptCirc(circle3, "Radius of circle3 is less than zero!", "radius of circle3 = ");
        System.out.println("==========================================");
        finOutptRec(rectangle1, "Height of rectangle1 is less than zero!", "Length of rectangle1 is less than zero!", "height of rectangle1 = ", "length of rectangle1 = ");
        finOutptRec(rectangle2, "Height of rectangle2 is less than zero!", "Length of rectangle2 is less than zero!", "height of rectangle2 = ", "length of rectangle2 = ");
        finOutptRec(rectangle3, "Height of rectangle3 is less than zero!", "Length of rectangle3 is less than zero!", "height of rectangle3 = ", "length of rectangle3 = ");
        System.out.println("==========================================");
        finOutptSqua(square1, "Side of square1 is less than zero!", "side of square1 = ");
        finOutptSqua(square2, "Side of square2 is less than zero!", "side of square2 = ");
        finOutptSqua(square3, "Side of square3 is less than zero!", "side of square3 = ");
    }

    private static void finOutptSqua(Square square1, String s, String s2) {
        try {
            if (square1.getSide() < 0) {
                throw new Exception(s);
            } else {
                outptSqua(s2, square1.getSide(), "area: side^2 = ", square1.area());
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void finOutptRec(Rectangle rectangle1, String s, String s2, String s3, String s4) {
        try {
            if (rectangle1.getHeight() < 0) {
                throw new Exception(s);
            } else if (rectangle1.getLength() < 0) {
                throw new Exception(s2);
            } else {
                outptRec(s3, rectangle1.getHeight(), s4, rectangle1.getLength(), "area: height * length = ", rectangle1.area());
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void finOutptCirc(Circle circle1, String s, String s2) {
        try {
            if (circle1.getRadius() < 0) {
                throw new Exception(s);
            } else {
                outptCirc(s2, circle1.getRadius(), "area: PI * radius^2 = ", circle1.area());
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void outptSqua(String s, double side, String s2, double area) {
        System.out.print(s);
        System.out.println(side);
        System.out.print(s2);
        System.out.println(area);
    }

    private static void outptRec(String s, double height, String s2, double length, String s3, double area) {
        System.out.print(s);
        System.out.println(height);
        System.out.print(s2);
        System.out.println(length);
        System.out.print(s3);
        System.out.println(area);
    }

    private static void outptCirc(String s, double radius, String s2, double area) {
        System.out.print(s);
        System.out.println(radius);
        System.out.print(s2);
        System.out.println(area);
    }
}
