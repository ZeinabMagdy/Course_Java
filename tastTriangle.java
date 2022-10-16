package Ex11_01;

public class tastTriangle {

    public static void main(String[] args) {
        Triangle T1 = new Triangle();
        Triangle T2 = new Triangle(1, 1.5, 1);
        T2.setColor("yellow");
        T2.setFilled(true);
        System.out.println(T2.toString());
        System.out.printf(" Area of Triangle : %4.2f", T2.getArea());
        System.out.printf("\n Perimeter of Triangle : %4.2f \n", T2.getPerimeter());

    }
}
