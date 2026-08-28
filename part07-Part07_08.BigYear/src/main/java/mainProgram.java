
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
        ListaOsservati observed = new ListaOsservati();

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("? ");
            String command = scan.nextLine();
            if (command.equals("Quit")) {
                break;
            }
            if (command.equals("Add")) {
                System.out.println("Name: ");
                String bName = scan.nextLine();
                System.out.println("Latin name: ");
                String lName = scan.nextLine();
                Bird bird2Add = new Bird(bName, lName);
                observed.add(bird2Add);
            }
            if (command.equals("Observation")) {
                System.out.println("Bird?");
                String bName = scan.nextLine();
                Boolean trovato = false;
                for (Bird bird : observed.listaUccelli) {
                    if (bird.getName().equals(bName)) {
                        bird.addOsservazione();
                        trovato = true;
                    }
                }
                if (!trovato) {
                    System.out.println("Not a bird!");
                }
            }
            if (command.equals("All")) {
                observed.printAll();
            }
            if (command.equals("One")) {
                System.out.println("Bird? ");
                String bName = scan.nextLine();
                observed.printByName(bName);
            }
        }

        scan.close();
    }
}
