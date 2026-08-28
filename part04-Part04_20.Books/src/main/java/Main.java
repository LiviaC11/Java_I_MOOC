import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Book> libreria = new ArrayList<>();

        while (true) {
            System.out.println("Title: ");
            String title = scan.nextLine();

            if (title.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scan.nextLine());
            System.out.println("Publication year: ");
            int year = Integer.valueOf(scan.nextLine());
            libreria.add(new Book(title, pages, year));

        }
        System.out.println("What information will be printed?");
        String infoType = scan.nextLine();
        if (infoType.equals("everything")) {
            for (Book book : libreria) {
                System.out.println(book.toString());
            }
        } else if (infoType.equals("name")) {
            for (Book book : libreria) {
                System.out.println(book.getTitle());
            }
        }
        scan.close();
    }
}
