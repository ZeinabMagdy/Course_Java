package Ex8_11;

import java.util.Scanner;

public class testLinearEquation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print (" Enter the number of a, d, c, d, e, f : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
//        double Z = (a * d) - (b * c);
        linearEquation le = new linearEquation(a, b, c, d, e , f);
        
        if (le.isSolvable()){
           System.out.println("The equation has no solution."); 
        }
        else
            System.out.println(" X is : " + le.getX() + "\t" + "Y is : " + le.getY());
    }
}
