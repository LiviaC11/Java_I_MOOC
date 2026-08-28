
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int n = Integer.valueOf(scanner.nextLine());
        int factorial = 1;
        if (n == 0) {
            System.out.println("Factorial: " + factorial);
        } else {
            for (int i = factorial; i <= n; i++) {
                factorial *= i;
            }
        }
        System.out.println("Factorial: " + factorial);
        scanner.close();

    }
}
