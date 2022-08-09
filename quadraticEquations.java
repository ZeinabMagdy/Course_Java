package Ex8_10;

class quadraticEquations {

    private double a;
    private double b;
    private double c;

    quadraticEquations(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double getA() {
        return a;
    }

    double getB() {
        return b;
    }

    double getC() {
        return c;
    }

    String getDiscriminant() {
        double x = (Math.pow(b, 2)) - (4 * a * c);
        if (x > 0) {
            return "The roots are " + getRoot1() + " and " + getRoot2();
        } else if (x == 0) {
            return "The root is " + getRoot1();
        } else {
            return "The equation has no roots";
        }

    }

    double getRoot1() {
        double x = (Math.pow(b, 2)) - (4 * a * c);
        return -b + Math.sqrt(x) / (2 * a);

    }

    double getRoot2() {
        double x = (Math.pow(b, 2)) - (4 * a * c);
        return -b - Math.sqrt(x) / (2 * a);
    }

}
