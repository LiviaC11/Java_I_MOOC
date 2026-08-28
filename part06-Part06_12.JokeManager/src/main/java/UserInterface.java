import java.util.Scanner;

public class UserInterface {
    private Scanner scan;
    private JokeManager joke;

    public UserInterface(JokeManager joke, Scanner scan) {
        this.scan = scan;
        this.joke = joke;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:\n1-Add a joke\n2-Draw a joke\n3-List jokes\nX-stops");
            String comando = this.scan.nextLine();
            if (comando.equals("X")) {
                break;
            }
            if (comando.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke1 = this.scan.nextLine();
                this.joke.addJoke(joke1);
            }
            if (comando.equals("2")) {
                System.out.println(this.joke.drawJoke());
            }
            if (comando.equals("3")) {
                System.out.println("Printing the jokes");
                this.joke.printJokes();
            }
        }

    }
}
