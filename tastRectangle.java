package Ex8_1;

public class tastRectangle {

    public static void main(String[] args) {
        Rectangle c1 = new Rectangle(4, 40);
        System.out.printf("% 2.1f\n",c1.getArea());
        System.out.printf("% 2.1f\n",c1.getPerimeter());
        Rectangle c2 = new Rectangle(3.5, 35.9);
        System.out.printf("% 2.1f\n", c2.getArea());
        System.out.printf("% 2.1f\n",c2.getPerimeter());
    }
}
