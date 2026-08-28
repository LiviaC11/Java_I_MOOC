
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;

        while (true) {
            int n = Integer.valueOf(scanner.nextLine());
            if (n != -1) {
                sum += n;
                count++;
                if (n % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            } else {
                System.out.println("Thx! Bye!");
                break;
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        double average = (double) sum / count;
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        scanner.close();

    }
}
