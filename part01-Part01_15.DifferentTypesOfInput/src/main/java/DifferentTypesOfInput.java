
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a string:");
        String s = scanner.nextLine();
        System.out.println("Give an integer:");
        Integer i = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        Double d = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        Boolean b = Boolean.valueOf(scanner.nextLine());
        System.out.println("You gave the string " + s);
        System.out.println("You gave the integer " + i);
        System.out.println("You gave the double " + d);
        System.out.println("You gave the boolean " + b);
        scanner.close();
    }
}
