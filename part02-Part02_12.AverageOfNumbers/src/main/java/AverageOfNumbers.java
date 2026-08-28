
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            System.out.println("Give a number:");
            if (num != 0) {
                sum += num;
                count++;
            }
            if (num == 0) {
                break;
            }
        }
        double average = (double) sum / count;
        System.out.println("Average of the numbers: " + average);
        scanner.close();
    }
}
