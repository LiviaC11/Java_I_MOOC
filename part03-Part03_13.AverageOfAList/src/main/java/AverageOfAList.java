
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            lista.add(input);
        }

        int sum = 0;
        for (Integer integer : lista) {
            sum += integer;
        }
        double average = (double) sum / lista.size();
        System.out.println("Average: " + average);
        scanner.close();

    }
}
