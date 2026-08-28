
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n01 = Integer.valueOf(scanner.nextLine());
        int n02 = Integer.valueOf(scanner.nextLine());

        if (n01 == n02) {
            System.out.println(n01 + " is equal to " + n02 + ".");
        } else if (n01 > n02) {
            System.out.println(n01 + " is greater than " + n02 + ".");
        } else {
            System.out.println(n01 + " is smaller than " + n02 + ".");
        }
        scanner.close();
    }
}
