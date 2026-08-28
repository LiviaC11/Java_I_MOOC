
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String name = "";

        while (true) {
            String frase = scanner.nextLine();
            if (frase.equals("")) {
                break;
            }
            String[] array = frase.split(",");
            if (oldest < Integer.valueOf(array[1])) {
                oldest = Integer.valueOf(array[1]);
                name = array[0];

            }
        }
        if (oldest != 0) {
            System.out.println("Name of the oldest: " + name);
        }

        scanner.close();

    }
}
