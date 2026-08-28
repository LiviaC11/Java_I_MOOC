
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String fileName = scan.nextLine();
        System.out.println("Team: ");
        String teamName = scan.nextLine();
        int matchCounter = 0;
        int winCounter = 0;
        int lossesCounter = 0;

        try (Scanner lettura = new Scanner(Paths.get(fileName))) {
            while (lettura.hasNextLine()) {
                String riga = lettura.nextLine();
                String[] array = riga.split(",");
                String hTeam = array[0];
                String vTeam = array[1];
                int hPoint = Integer.valueOf(array[2]);
                int vPoint = Integer.valueOf(array[3]);
                if (hTeam.equals(teamName) || vTeam.equals(teamName)) {
                    matchCounter++;
                }
                if (hTeam.equals(teamName)) {
                    if (hPoint >= vPoint) {
                        winCounter++;

                    } else {
                        lossesCounter++;
                    }

                } else if (vTeam.equals(teamName)) {
                    if (vPoint >= hPoint) {
                        winCounter++;
                    } else {
                        lossesCounter++;
                    }
                }

            }
        } catch (Exception e) {
            System.out.println("File non trovato");
        }
        System.out.println("Games: " + matchCounter);
        System.out.println("Wins: " + winCounter);
        System.out.println("Losses: " + lossesCounter);
        scan.close();

    }

}
