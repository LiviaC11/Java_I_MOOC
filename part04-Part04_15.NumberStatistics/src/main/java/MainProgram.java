
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics nUtente = new Statistics();
        Statistics pariN = new Statistics();
        Statistics dispariN = new Statistics();
        System.out.println("Enter numbers:");
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {
                break;
            }
            nUtente.addNumber(num);

            if (num % 2 == 0) {
                pariN.addNumber(num);
            } else {
                dispariN.addNumber(num);
            }

        }
        System.out.println("Sum: " + nUtente.sum());
        System.out.println("Sum of even numbers: " + pariN.sum());
        System.out.println("Sum of odd numbers: " + dispariN.sum());
        scanner.close();
    }
}
