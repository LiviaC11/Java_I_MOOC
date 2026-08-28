
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int n = Integer.valueOf(scanner.nextLine());

            if (n == 9999) {
                break;
            }
            lista.add(n);
        }
        int smallest = smallestInt(lista);
        System.out.println("Smallest number: " + smallest);
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == smallest) {
                System.out.println("Found at index: " + i);
            }

        }

        scanner.close();
    }

    public static int smallestInt(ArrayList<Integer> lista) {
        int smallest = lista.get(0);
        for (Integer integer : lista) {
            if (integer < smallest) {
                smallest = integer;
            }
        }
        return smallest;
    }
}
