package Ex8_1;

class Rectangle {

    private double width;
    private double height;

    Rectangle() {
        double width = 1;
        double height = 1;
    }

    Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return (width + height) * 2;

    }
}
