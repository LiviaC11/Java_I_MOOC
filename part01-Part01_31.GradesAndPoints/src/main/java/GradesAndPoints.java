
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int n01 = Integer.valueOf(scan.nextLine());

        if (n01 < 0) {
            System.out.println("Grade: impossible!");
        } else if (n01 <= 49 && n01 >= 0) {
            System.out.println("Grade: failed");
        } else if (n01 > 49 && n01 <= 59) {
            System.out.println("Grade: 1");
        } else if (n01 > 59 && n01 <= 69) {
            System.out.println("Grade: 2");
        } else if (n01 > 69 && n01 <= 79) {
            System.out.println("Grade: 3");
        } else if (n01 > 79 && n01 <= 89) {
            System.out.println("Grade: 4");
        } else if (n01 > 89 && n01 <= 100) {
            System.out.println("Grade: 5");
        } else {
            System.out.println("Grade: incredible!");
        }
    }

}