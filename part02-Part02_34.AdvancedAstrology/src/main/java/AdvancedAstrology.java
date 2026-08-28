
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }

    }

    public static void printTriangle(int size) {
        int count = 1;
        int spaces = size - 1;
        while (size >= count) {
            printSpaces(spaces);
            printStars(count);
            spaces--;
            count++;
        }
    }

    public static void christmasTree(int height) {
        int count = 1;
        int spaces = height - 1;
        for (int i = 0; i < height; i++) {

            printSpaces(spaces);
            printStars(count);
            spaces -= 1;
            count += 2;
        }
        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
