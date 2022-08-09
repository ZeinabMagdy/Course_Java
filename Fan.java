package Ex8_8;

class Fan {

    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;
    static private int speed;
    private boolean on;
    private double radius;
    private String color;

    Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    void seton(boolean o) {
        on = o;
    }

     boolean geton() {
        return on;
    }

    void setSpeed(int s) {
        if (on) {
            speed = s;
        }
    }

    double getSpeed() {
        return speed;
    }

    void setradius(double r) {
        radius = r;
    }

    double getradius() {
        return radius;
    }

    void setcolor(String c) {
        color = c;
    }

    String getcolor() {
        return color;
    }

    String tostring() {

        return "Fan is " + on + "\n" + "speed is " + speed + "\n" + "radius is " + radius + "\n" +"color is " + color;

    }
}
