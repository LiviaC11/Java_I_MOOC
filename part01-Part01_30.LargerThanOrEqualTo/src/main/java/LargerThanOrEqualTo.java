
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        int n01 = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int n02 = Integer.valueOf(scan.nextLine());
        if(n01 > n02){
            System.out.println("Greater number is: " + n01);
        }else if( n02 > n01){
            System.out.println("Greater number is: " + n02);
        } else {
            System.out.println("The numbers are equal!");
        }

    }
}
