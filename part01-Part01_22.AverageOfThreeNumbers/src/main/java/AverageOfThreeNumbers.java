
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        final double DIVISO = 3.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int n01 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int n02 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int n03 = Integer.valueOf(scanner.nextLine());

        double average = (double) (n01 + n02 + n03) / DIVISO;
        if (n02 != 0 && n01 != 0 && n03 != 0) {
            System.out.println("The average is " + average);
        }

        scanner.close();
        // Write your program here

    }
}
