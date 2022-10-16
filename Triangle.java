package Ex11_01;

public class Triangle extends GeometricObject {

    private double side1;
    private double side2;
    private double side3;

    Triangle() {
        this(1.0, 1.0, 1.0);

    }

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
    
    public double getArea() {
        double per = getPerimeter() / 2.0;
        return (Math.sqrt(per * (per - side1) * (per - side2) * (per - side3)));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTriangle: side1 = " 
                + side1 + " side2 = " + side2
                + " side3 = " + side3;
    }
}
