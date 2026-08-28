
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int n01 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int n02 = Integer.valueOf(scanner.nextLine());

        double average = (double) (n01 + n02) / 2.0;
        if (n02 != 0) {
            System.out.println("The average is " + average);
        }

        scanner.close();

    }
}
