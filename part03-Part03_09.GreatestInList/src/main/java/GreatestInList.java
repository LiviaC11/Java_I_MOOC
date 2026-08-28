
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");
        System.out.println("The greatest number: " + greatestNumber(list));

        scanner.close();
    }

    public static int greatestNumber(ArrayList<Integer> lista) {
        int greatest = lista.get(0);
        for (Integer integer : lista) {
            if (integer > greatest) {
                greatest = integer;
            }
        }
        return greatest;
    }
}
