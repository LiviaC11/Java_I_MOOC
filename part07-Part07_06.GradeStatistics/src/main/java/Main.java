
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElencoVoti puntiUtente = new ElencoVoti();

        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
            Voto v = new Voto(number);
            puntiUtente.add(v);

        }

        System.out.println("Point average (all): " + puntiUtente.average());
        double averageValidi = puntiUtente.averageValidi();

        if (averageValidi == -1) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + averageValidi);
        }
        double passP = puntiUtente.percentage();
        System.out.println("Pass percentage: " + passP);
        System.out.println("Grade distribution: ");
        puntiUtente.stampaVoti();

        scanner.close();
    }
}
