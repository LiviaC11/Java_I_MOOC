
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int n01 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int n02 = Integer.valueOf(scanner.nextLine());
        System.out.println(n01 + " + " + n02 + " = " + (n01 + n02));
        System.out.println(n01 + " - " + n02 + " = " + (n01 - n02));
        System.out.println(n01 + " * " + n02 + " = " + (n01 * n02));
        double division = (double) n01 / n02;
        System.out.println(n01 + " / " + n02 + " = " + division);
        scanner.close();

    }
}
