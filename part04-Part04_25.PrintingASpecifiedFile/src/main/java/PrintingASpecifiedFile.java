
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String fileName = scanner.nextLine();

     
            try (Scanner lettura = new Scanner(Paths.get(fileName))) {
                while (lettura.hasNextLine()) {
                    String riga = lettura.nextLine();
                    System.out.println(riga);
                }
            } catch (Exception e) {
                System.out.println("Error message: " + e.getMessage());
            }
        
        scanner.close();
    }
}
