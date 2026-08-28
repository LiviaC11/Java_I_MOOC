import java.util.Scanner;

public class UserInterface {
    private TodoList lista;
    private Scanner scan;

    public UserInterface(TodoList lista, Scanner scan) {
        this.lista = lista;
        this.scan = scan;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String c1 = this.scan.nextLine();
            if (c1.equals("stop")) {
                break;
            } else if (c1.equals("add")) {
                System.out.println("To add: ");
                String addS = this.scan.nextLine();
                this.lista.add(addS);

            } else if (c1.equals("list")) {
                this.lista.print();
            } else if (c1.equals("remove")) {
                System.out.println("To remove: ");
                int index = Integer.valueOf(this.scan.nextLine());
                this.lista.remove(index);
            }
        }
    }

}
