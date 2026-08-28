
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String frase = scanner.nextLine();
            if (!frase.isEmpty()) {
                String[] array = frase.split(" ");
                for (int i = 0; i < array.length; i++) {
                    if (array[i].contains("av")) {
                        System.out.println(array[i]);
                    }
                }

            }
        }
        scanner.close();
    }
}
