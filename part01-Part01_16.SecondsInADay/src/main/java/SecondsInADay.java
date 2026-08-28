
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        final int HOURS = 24;
        final int SESSANTA = 60;

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days would you like to convert to seconds?");
        int i = Integer.valueOf(scanner.nextLine());
        int seconds = ((i * HOURS) * SESSANTA * SESSANTA);
        System.out.println(seconds);
        scanner.close();
    }
}
