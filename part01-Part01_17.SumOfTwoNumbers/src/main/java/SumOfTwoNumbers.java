
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int n01 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int n02 = Integer.valueOf(scanner.nextLine());
        System.out.println("The sum of the numbers is " + (n01 + n02));
        scanner.close();
    }
}
