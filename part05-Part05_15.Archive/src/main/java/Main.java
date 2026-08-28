
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archive = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String nInput = scanner.nextLine();
            if (nInput.isEmpty()) {
                break;
            }
            Archive obj = new Archive(nInput, input);
            if (!archive.contains(obj)) {
                archive.add(obj);
            }

        }
        System.out.println("==Items==");
        for (Archive item : archive) {
            System.out.println(item);
        }

        scanner.close();

    }
}
