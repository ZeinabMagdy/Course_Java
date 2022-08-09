package Ex8_13;
import java.util.Scanner;
public class testLocation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the array: ");
        int Row = input.nextInt();
        int Column = input.nextInt();
        System.out.print("Enter the array: ");
        double[][] arr = new double[Row][Column];
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[(row)].length; column++) {
                arr[row][column] = input.nextDouble();
            }
        }
        Location L = new Location();
        L = L.locateLargest(arr);
        System.out.print("The location of the largest element is " + L.maxValue + "at" + "(" + L.row + ", " + L.column + ")");
    }
}