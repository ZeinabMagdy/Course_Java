package Ex8_10;

import java.util.Scanner;

public class testQuadraticEquations {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 Number : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        quadraticEquations QE = new quadraticEquations(a, b, c);
        QE.getDiscriminant();
        System.out.println(QE.getDiscriminant());
    }

}
