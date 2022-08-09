package Ex8_2;

import java.util.Scanner;

public class testStock {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stock S = new Stock("JAVA", "Sun Microsystems");
//        String previousClosingPrice;
        System.out.print(" Enter previousClosingPrice : ");
        double x = input.nextDouble();
        S.setpreviousClosingPrice(x);
        System.out.print(" Enter currentPrice : ");
        double y = input.nextDouble();
        S.setcurrentPrice(y);
        System.out.printf(" the price-change percentage" + " % 3.2f \n", S.getChangePercent());

    }
}
