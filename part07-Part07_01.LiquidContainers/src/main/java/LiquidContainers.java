
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int container1 = 0;
        int container2 = 0;
        int cPart2 = 0;
        while (true) {

            System.out.println("First: " + container1 + "/100");
            System.out.println("Second: " + container2 + "/100");

            String commandString = scan.nextLine();
            if (commandString.equals("quit")) {
                break;
            }
            String[] commandParts = commandString.split(" ");
            String command = commandParts[0];

            cPart2 = Integer.valueOf(commandParts[1]);

            if (command.equals("add")) {
                if (cPart2 > 0) {
                    container1 += cPart2;
                    if (container1 > 100) {
                        container1 = 100;
                    }
                    if (container1 < 0) {
                        container1 = 0;
                    }
                }

            }

            if (command.equals("move")) {
                if (cPart2 > 100) {
                    container2 += container1;
                    container1 = 0;
                    if (container2 > 100) {
                        container2 = 100;
                    }

                } else {
                    if (container1 >= cPart2) {
                        container2 += cPart2;
                        container1 -= cPart2;
                        if (container1 < 0) {
                            container1 = 0;
                        }
                        if (container2 > 100) {
                            container2 = 100;
                        }
                    } else {
                        container2 += container1;
                        container1 = 0;
                        if (container2 > 100) {
                            container2 = 100;
                        }
                    }

                }
            }

            if (command.equals("remove")) {
                if (cPart2 > 100) {
                    container2 = 0;
                }

                container2 -= cPart2;
                if (container2 < 0) {
                    container2 = 0;
                }
            }

        }
        scan.close();
    }
}
