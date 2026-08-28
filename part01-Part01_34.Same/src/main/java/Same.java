
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String s01 = scan.nextLine();
        System.out.println("Enter the second string:");
        String s02 = scan.nextLine();
        if (s01.equals(s02)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }

        scan.close();
    }
}
