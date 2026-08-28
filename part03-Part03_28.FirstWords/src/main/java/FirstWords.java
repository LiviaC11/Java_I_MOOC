
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String frase = scanner.nextLine();

            String[] array = frase.split(" ");
            System.out.println(array[0]);
        }

        scanner.close();

    }
}
