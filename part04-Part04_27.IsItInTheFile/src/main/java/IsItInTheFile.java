
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        boolean trovato = false;

        try (Scanner lettura = new Scanner(Paths.get(file))) {
            while (lettura.hasNextLine()) {
                String riga = lettura.nextLine();

                if (riga.equals(searchedFor)) {
                    trovato = true;
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

        if (trovato) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }
        scanner.close();
    }
}
