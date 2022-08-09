package Ex8_11;

public class linearEquation {

    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public linearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    public boolean isSolvable() {

        return ((a * d) - (b * c)) == 0;
        
    }

    public double getX() {
        double X = ((e * d) - (b * f)) / ((a * d) - (b * c));
        return X;
    }

    public double getY() {
        double Y = ((a * f) - (e * c)) / ((a * d) - (b * c));
        return Y;
    }
}
