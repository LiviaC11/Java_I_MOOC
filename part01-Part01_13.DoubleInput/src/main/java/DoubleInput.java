
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        double num01 = Double.valueOf(scanner.nextLine());
        System.out.println("You gave the number " + num01);

        // write your program here
        scanner.close();
    }
}
