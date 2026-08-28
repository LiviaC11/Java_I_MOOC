
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int pos = 0;

        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());

            if (num > 0) {
                sum += num;
                pos++;
            }
            if (num == 0) {
                break;
            }
        }
        if (pos == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double average = (double) sum / pos;
            System.out.println("Average of the numbers: " + average);
        }

        scanner.close();
    }
}
