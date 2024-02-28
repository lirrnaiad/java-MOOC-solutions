
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File:");
        String file = scanner.nextLine();

        System.out.println("Team:");
        String team = scanner.nextLine();

        try (Scanner reader = new Scanner(Paths.get(file))) {
            int gamesPlayed = 0;
            int gamesWon = 0;
            int gamesLost = 0;

            while (reader.hasNextLine()) {
                String stat = reader.nextLine();
                String[] data = stat.split(",");

                String teamOne = data[0];
                String teamTwo = data[1];
                int teamOneScore = Integer.valueOf(data[2]);
                int teamTwoScore = Integer.valueOf(data[3]);

                if (teamOne.contains(team) || teamTwo.contains(team)) {
                    gamesPlayed++;
                }

                if (teamOne.equals(team)) {
                    if (teamOneScore > teamTwoScore) {
                        gamesWon++;
                    } else gamesLost++;
                }

                else if (teamTwo.equals(team)) {
                    if (teamTwoScore > teamOneScore) {
                        gamesWon++;
                    } else gamesLost++;
                }
            }
            System.out.println("Games: " + gamesPlayed);
            System.out.println("Wins: " + gamesWon);
            System.out.println("Losses: " + gamesLost);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
