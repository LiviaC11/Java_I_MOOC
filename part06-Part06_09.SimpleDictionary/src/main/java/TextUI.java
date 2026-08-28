import java.util.Scanner;

public class TextUI {
    private SimpleDictionary dictionary;
    private Scanner scan;

    public TextUI(Scanner scan, SimpleDictionary dictionary) {
        this.dictionary = dictionary;
        this.scan = scan;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String comando = scan.nextLine();
            if (comando.equals("end")) {
                System.out.println("Bye Bye");
                break;
            } else if (comando.equals("add")) {
                System.out.println("Word: ");
                String w1 = scan.nextLine();
                System.out.println("Translation: ");
                String wt = scan.nextLine();
                dictionary.add(w1, wt);
            } else if (comando.equals("search")) {
                System.out.println("To be translated: ");
                String w2 = scan.nextLine();
                String translation = dictionary.translate(w2);
                if (translation == null) {
                    System.out.println("Word " + w2 + " was not found");
                } else {
                    System.out.println("Translation: " + dictionary.translate(w2));
                }

            } else {
                System.out.println("Unknown command");
            }

        }
    }
}
