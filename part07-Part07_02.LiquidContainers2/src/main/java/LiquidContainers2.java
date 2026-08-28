
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container c1 = new Container();
        Container c2 = new Container();
        int cPart2 = 0;

        while (true) {
            System.out.println("First: " + c1);
            System.out.println("Second: " + c2);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] commandParts = input.split(" ");
            String command = commandParts[0];

            cPart2 = Integer.valueOf(commandParts[1]);
            if (command.equals("add")) {
                c1.add(cPart2);
            }
            if (command.equals("move")) {
                if (c1.contains() < cPart2) {
                    c2.add(c1.contains());
                    c1.remove(100);
                } else {
                    c1.remove(cPart2);
                    c2.add(cPart2);
                }

            }
            if (command.equals("remove")) {
                c2.remove(cPart2);
            }
        }
        scan.close();
    }
}
