
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String frase = scanner.nextLine();

            String[] array = frase.split(" ");
            System.out.println(array[array.length - 1]);
        }

        scanner.close();

    }
}
