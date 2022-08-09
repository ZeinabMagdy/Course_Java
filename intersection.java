package Ex8_12;

import Ex8_11.linearEquation;
import java.util.Scanner;

public class intersection {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the endpoints of the first line segment: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.print("Enter the endpoints of the second line segment: ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();
        double m1 = (y2 - y1) / (x2 - x1);
        double m2 = (y4 - y3) / (x4 - x3);
        double a = -1.0 * m1;
        double b = 1.0;
        double e = (-x1 * m1) + y1;
        double c = -1.0 * m2;
        double d = 1.0;
        double f = (-x3 * m2) + y3;
        linearEquation l = new linearEquation(a, b, c, d, e, f);
        if(l.isSolvable()) System.out.println("No solution");
        else{
            if( m1 != m2)
                System.out.println("The intersecting point is: (" + l.getX()+ ", " + l.getY() + ")" );
            else 
                System.out.println("No interserction");
        }
    }
}
