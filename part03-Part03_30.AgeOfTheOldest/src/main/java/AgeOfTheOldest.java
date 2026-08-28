
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;

        while (true) {
            String frase = scanner.nextLine();
            if (frase.equals("")) {
                break;
            }
            String[] array = frase.split(",");
            if (oldest < Integer.valueOf(array[1])) {
                oldest = Integer.valueOf(array[1]);
            }
        }

        System.out.println("Age of the oldest: " + oldest);
        scanner.close();
    }

}
