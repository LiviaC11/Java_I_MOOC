
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int yearsSum = 0;
        int count = 0;
        double avrg = 0.0;

        while (true) {
            String frase = scanner.nextLine();
            if (frase.isEmpty()) {
                break;
            }
            String[] array = frase.split(",");
            if (longestName.length() < array[0].length()) {
                longestName = array[0];
            }
            yearsSum += Integer.valueOf(array[1]);
            count++;

        }
        if (count > 0) {
            avrg = (double) yearsSum / count;
            System.out.println("Longest name: " + longestName);
            System.out.println("Average of the birth years: " + avrg);
        }

    }
}
