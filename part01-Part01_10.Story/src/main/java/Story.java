
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "I will tell you a story, but I need some information first.\nWhat is the main character called?");
        String mex01 = scanner.nextLine();
        System.out.println("What is their job?");
        String mex02 = scanner.nextLine();
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was " + mex01 + ", who was " + mex02 + ".\r\n" + //
                "On the way to work, " + mex01 + " reflected on life.\r\n" + //
                "Perhaps " + mex01 + " will not be " + mex02 + " forever.");
    
            }
}
